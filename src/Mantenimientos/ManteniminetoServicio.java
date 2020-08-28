/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import Conexion.Conexion;
import Objetos.Empleado;
import Objetos.Servicio;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author julia
 */
public class ManteniminetoServicio {
    
    private static ManteniminetoServicio instancia;
    private Servicio servicio;
    private ManteniminetoServicio(){
    }
    
    public static ManteniminetoServicio getInstancia(){
        if(instancia==null){
            instancia = new ManteniminetoServicio();
        }
        return instancia;
    }
    
    
    public void agregarServicio(Object obj){
        Conexion con;
        servicio = (Servicio)obj;
        
        try {
            con  = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_INSERTASERVICIOS(?,?,?)}");
            cs.setString(1, servicio.getTipoServicio());
            cs.setDouble(2,servicio.getCosto());
            cs.setString(3, servicio.getNombreServicio());
            if (cs.executeUpdate()==1) {
                System.out.println("Insercion de Servicio exitosa");
            }else{
                System.out.println("Insercion de Servicio Fallo");
            }
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }
    
    public List<Object> listarServicio(){
        Conexion con = null;
        ResultSet rs = null;
        List<Object> lista = new ArrayList();
            
        try {
             con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.P_LISTARSERVICIOS(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeUpdate();           
            rs = (ResultSet)cs.getObject(1);
            while(rs.next()){
                servicio = new Servicio();
                servicio.setIdServicio(rs.getInt(1));
                servicio.setTipoServicio(rs.getString(2));
                servicio.setCosto(rs.getDouble(3));
                servicio.setNombreServicio(rs.getString(4));
                lista.add(servicio); 
            }
            rs.close();
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        
        return lista;
    }
    
    public void desactivaServicio(int codigo){
        Conexion con;
        
        try {
            con  = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_DESACTIVASERVICIO(?)}");
            cs.setInt(1, codigo);
            if (cs.executeUpdate()==1) {
                System.out.println("Desactivacion de Servicio exitosa");
            }else{
                System.out.println("Desactivacion de Servicio Fallo");
            }
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }
    
    public void actualizaServicio(Object obj){
        Conexion con;
        servicio = (Servicio)obj;
            try {
                con  = Conexion.getInstancia();
                CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_ACTUALIZASERVICIOS(?,?,?,?)}");
                cs.setInt(1, servicio.getIdServicio());
                cs.setString(2, servicio.getTipoServicio());
                cs.setDouble(3,servicio.getCosto());
                cs.setString(4, servicio.getNombreServicio());
                if (cs.executeUpdate()==1) {
                    System.out.println("Actualizacion de Servicio exitosa");
                }else{
                    System.out.println("Actualizacion de Servicio, Fallo");
                }
                con.desconectarBD();
            } catch (Exception e) {
                System.out.println(""+e);
            }
    }
    
    
        public List<Object> listarServicioNombre(String nombre){
        Conexion con = null;
        ResultSet rs = null;
        List<Object> lista = new ArrayList();
            
        try {
             con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{?=call PKG_01_FUNCIONES.FN_LISTARSERVICIO(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, nombre);
            cs.executeUpdate();           
            rs = (ResultSet)cs.getObject(1);
            while(rs.next()){
                servicio = new Servicio();
                servicio.setIdServicio(rs.getInt(1));
                servicio.setTipoServicio(rs.getString(2));
                servicio.setCosto(rs.getDouble(3));
                servicio.setNombreServicio(rs.getString(4));
                lista.add(servicio); 
            }
            rs.close();
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        
        return lista;
    }
    
    
        
        
        public List<Object> listarServicioCodigoNombre(){
        Conexion con = null;
        ResultSet rs = null;
        List<Object> lista = new ArrayList();
            
        try {
             con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{? = call PKG_01_FUNCIONES.FN_LISTARSERVICIO_CODIGONOMBRE}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeUpdate();           
            rs = (ResultSet)cs.getObject(1);
            while(rs.next()){
                servicio = new Servicio();
                servicio.setIdServicio(rs.getInt(1));
                servicio.setNombreServicio(rs.getString(2));
                lista.add(servicio); 
            }
            rs.close();
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        
        return lista;
    }        
        
    
}
