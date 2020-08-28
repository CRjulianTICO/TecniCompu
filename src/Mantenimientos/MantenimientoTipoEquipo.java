/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import Conexion.Conexion;
import Objetos.TipoEquipo;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author julia
 */
public class MantenimientoTipoEquipo {
    private static MantenimientoTipoEquipo instancia;
    private TipoEquipo tipoEquipo;
    
    private MantenimientoTipoEquipo(){}
    
    public static MantenimientoTipoEquipo getInstancia(){
        if (instancia == null) {
            instancia = new MantenimientoTipoEquipo();
        }
        return instancia;
    }
    
    
    
    public void insertaMarca(Object obj){
        Conexion con;
        tipoEquipo = (TipoEquipo)obj;
        try {
            con  = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_INSERTA_TIPOEQUIPO(?)}");
            cs.setString(1, tipoEquipo.getTipo());
            if (cs.executeUpdate()==1) {
                System.out.println("Insercion de Marca exitosa");
            }else{
                System.out.println("Insercion de Marca Fallo");
            }
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
    
    }
    
    
    public List<Object> listarMarca(){
         Conexion con = null;
        ResultSet rs = null;
        List<Object> lista = new ArrayList();
        
        try {
            con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_LISTAR_TIPOEQUIPO(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeUpdate();           
            rs = (ResultSet)cs.getObject(1);
            while(rs.next()){
                tipoEquipo = new TipoEquipo();
                tipoEquipo.setIdTipoEquipo(rs.getInt(1));
                tipoEquipo.setTipo(rs.getString(2));
                lista.add(tipoEquipo); 
            }
            rs.close();
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return lista;
    }
}
