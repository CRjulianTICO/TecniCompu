/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import Conexion.Conexion;
import Objetos.Cliente;
import Objetos.EquipoInserta;
import Objetos.EquipoLista;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author julia
 */
public class MantenimientoEquipo {
    
    private static MantenimientoEquipo instancia;
    private EquipoLista el;
    private EquipoInserta ei;
    
    private MantenimientoEquipo(){}
    
    public static MantenimientoEquipo getInstancia(){
        if (instancia == null) {
            instancia = new MantenimientoEquipo();
        }
        return instancia;
    }
    
    public void insertaEquipo(Object obj){
        Conexion con;
        ei = (EquipoInserta)obj;
        
        try {
            con  = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_INSERTAEQUIPO(?,?,?,?)}");
            cs.setString(1, ei.getModelo());
            cs.setInt(2, ei.getIdTipo());
            cs.setInt(3, ei.getIdMarca());
            cs.setString(4, ei.getCedula());
            if (cs.executeUpdate()==1) {
                System.out.println("Insercion de Equipo exitosa");
            }else{
                System.out.println("Insercion de Equipo Fallo");
            }
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }
    
    public List<Object> listaEquipo(){
        Conexion con = null;
        ResultSet rs = null;
        List<Object> lista = new ArrayList();
        
        try {
             con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_LISTAREQUIPOS(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeUpdate();           
            rs = (ResultSet)cs.getObject(1);
            while(rs.next()){
                el = new EquipoLista();
                el.setIdEquipo(rs.getInt(1));
                el.setCedula(rs.getString(2));
                el.setMarca(rs.getString(3));
                el.setModelo(rs.getString(4));
                el.setTipo(rs.getString(5));
                lista.add(el); 
            }
            rs.close();
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return lista;
    }
    
}
