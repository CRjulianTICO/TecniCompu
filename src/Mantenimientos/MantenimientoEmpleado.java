/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import Conexion.Conexion;
import Objetos.Empleado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author julia
 */
public class MantenimientoEmpleado {
    
    private static MantenimientoEmpleado instancia;
    private Empleado emp;
    
    private MantenimientoEmpleado(){
    }
    
    public static MantenimientoEmpleado getInstancia(){
        if (instancia==null) {
            instancia = new MantenimientoEmpleado();
        }
        return instancia;
    }
    
    
    
    public List<Object> listarEmpleados(){
        
        Conexion con = null;
        ResultSet rs = null;
        List<Object> lista = new ArrayList();
        
        try {
            con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_LISTAREMPLEADOS(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeUpdate();           
            rs = (ResultSet)cs.getObject(1);
            while(rs.next()){
                emp = new Empleado();
                emp.setIdEmpleado(0);
                emp.setNombre(rs.getString("NOMBRE"));
                emp.setApellidos(rs.getString("APELLIDOS"));
                emp.setCedula(rs.getString("CEDULA"));
                emp.setCorreo(rs.getString("CORREO"));
                emp.setTelefono(rs.getInt("TELEFONO"));
                emp.setUsuario(rs.getString("USUARIO"));
                emp.setIdRol(rs.getString("ROL"));
                lista.add(emp);
                
            }
            rs.close();
            con.desconectarBD();
            
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        
        return lista;
    }
    
    
    public void agregarEmpleado(Object obj){
        Conexion con = null;
        emp = (Empleado) obj;
        try {
            con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_AGREGAREMPLEADO(?,?,?,?,?,?,?,?)}");
            cs.setString(1,emp.getNombre());
            cs.setString(2,emp.getApellidos());
            cs.setString(3,emp.getCedula());
            cs.setInt(4,emp.getTelefono());
            cs.setString(5, emp.getUsuario());
            cs.setString(6,emp.getPassword());
            cs.setInt(7,Integer.parseInt(emp.getIdRol()));      
            cs.setString(8, emp.getCorreo());
            if(cs.executeUpdate()==1){
                System.out.println("Insercion exitosa");
            }else{
                System.out.println("Fallo la insercion");
            }
            
            con.desconectarBD();
            
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }
    
    
    public void desactivarEmpleado(String cedula){
        Conexion con = null;
        try {
            con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_DESACTIVAREMPLEADO(?)}");
            cs.setString(1, cedula);
            if (cs.executeUpdate()==1) {
                System.out.println("Se elimino satisfactoriamente");
            }else{
                System.out.println("No se logro eliminar");
            }
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        con.desconectarBD();
        
    }
    
    public void actualizaEmpleado(Object obj){
        emp = (Empleado) obj;
        Conexion con;
        if (verificaCedula(emp.getCedula())) {
            System.out.println("Las cedulas coinciden");
            try {   
                con = Conexion.getInstancia();
                CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_ACTUALIZAREMPLEADO(?,?,?,?,?,?,?)}");
                cs.setString(1,emp.getNombre());
                cs.setString(2,emp.getApellidos());
                cs.setString(3,emp.getCedula());
                cs.setInt(4,emp.getTelefono());
                cs.setString(5, emp.getUsuario());
                cs.setInt(6,Integer.parseInt(emp.getIdRol()));      
                cs.setString(7, emp.getCorreo());
                if(cs.executeUpdate()==1){
                    System.out.println("Actualizacion exitosa");
                }else{
                    System.out.println("Fallo la actualizacion");
                }
            
            con.desconectarBD();
            } catch (Exception e) {
                System.out.println(""+e);
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Las cedulas no coinciden. DEBE PONER UNA CEDULA EXISTENTE LAS CEDULAS NO SON MODIFICABLES");
        }
    }
    
    public boolean verificaCedula(String cedula){
        Conexion conexion = Conexion.getInstancia();        
        Connection con = conexion.conectarBD();
        String result = null;
         boolean resp = false;
        try {
            CallableStatement cs = con.prepareCall("{? = call PKG_01_FUNCIONES.FN_VERIFICARCEDULA(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, cedula);
            cs.execute();
            result = cs.getString(1);
            
            if (result != null) {
                resp = true;
                conexion.desconectarBD();
            }else{
                System.out.println("No sirvio");
            }
            
           
        } catch (Exception e) {
            System.out.println(""+e);
        }
        return resp;
    }
    
}
