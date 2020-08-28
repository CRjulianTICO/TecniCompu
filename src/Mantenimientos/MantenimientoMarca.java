/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import Conexion.Conexion;
import Objetos.Cliente;
import Objetos.Marca;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author julia
 */
public class MantenimientoMarca {
    
    private static MantenimientoMarca instancia;
    private Marca marca;
    
    private MantenimientoMarca(){}
    
    public static MantenimientoMarca getInstancia(){
        if (instancia == null) {
            instancia = new MantenimientoMarca();
        }
        return instancia;
    }
    
    
    
    public void insertaMarca(Object obj){
        Conexion con;
        marca = (Marca)obj;
        try {
            con  = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_INSERTAMARCA(?)}");
            cs.setString(1, marca.getNombreMarca());
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
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_LISTARMARCA(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeUpdate();           
            rs = (ResultSet)cs.getObject(1);
            while(rs.next()){
                marca = new Marca();
                marca.setIdMarca(rs.getInt(1));
                marca.setNombreMarca(rs.getString(2));
                lista.add(marca); 
            }
            rs.close();
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return lista;
    }
    
    
    
    
    
    
    
    
    
    
}
