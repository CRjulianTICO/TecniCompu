/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import Conexion.Conexion;
import Objetos.Cliente;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author julia
 */
public class MantenimientoCliente {
    
    private static MantenimientoCliente instancia;
    private Cliente cliente;
    
    private MantenimientoCliente(){}
    
    public static MantenimientoCliente getInstancia(){
        if (instancia == null) {
            instancia = new MantenimientoCliente();
        }
        
        return instancia;
    }
    
    
    public void insertaCliente(Object obj){
        Conexion con;
        cliente = (Cliente)obj;
        
        try {
            con  = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_INSERTACLIENTE(?,?,?,?,?)}");
            cs.setString(1, cliente.getNombre());
            cs.setString(2, cliente.getApellidos());
            cs.setString(3, cliente.getCedula());
            cs.setInt(4, cliente.getTelefono());
            cs.setString(5, cliente.getCorreo());
            if (cs.executeUpdate()==1) {
                System.out.println("Insercion de Cliente exitosa");
            }else{
                System.out.println("Insercion de Clietne Fallo");
            }
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
    }
    
    
    public int verificaCliente(String cedula){
        Conexion con;
        int resp = 0;
        try {
             con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{?=call PKG_01_FUNCIONES.FN_VERIFICACLIENTE(?)}");
            cs.registerOutParameter(1, OracleTypes.NUMBER);
            cs.setString(2, cedula);
            cs.executeUpdate();           
            
                resp = cs.getInt(1);
                
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        return resp;
    }
    
    
    public List<Object> listarCliente(String cedula){
        Conexion con = null;
        ResultSet rs = null;
        List<Object> lista = new ArrayList();
        
        try {
             con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{?=call PKG_01_FUNCIONES.FN_LISTARCLIENTE(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, cedula);
            cs.executeUpdate();           
            rs = (ResultSet)cs.getObject(1);
            while(rs.next()){
                cliente = new Cliente();
                cliente.setNombre(rs.getString(1));
                cliente.setApellidos(rs.getString(2));
                cliente.setCedula(rs.getString(3));
                cliente.setTelefono(rs.getInt(4));
                cliente.setCorreo(rs.getString(5));
                lista.add(cliente); 
            }
            rs.close();
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return lista;
    }
    
    
    
    public List<Object> listarClienteG(){
        Conexion con = null;
        ResultSet rs = null;
        List<Object> lista = new ArrayList();
        
        try {
             con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_LISTARCLIENTES(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeUpdate();           
            rs = (ResultSet)cs.getObject(1);
            while(rs.next()){
                cliente = new Cliente();
                cliente.setNombre(rs.getString(1));
                cliente.setApellidos(rs.getString(2));
                cliente.setCedula(rs.getString(3));
                cliente.setTelefono(rs.getInt(4));
                cliente.setCorreo(rs.getString(5));
                lista.add(cliente); 
            }
            rs.close();
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return lista;
    }
    
    
    public void insertaServicioCliente(int codigo,String cedCliente,String cedEmpleado){
        Conexion con;
        
        try {
            con  = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_INSERTA_CLIENTESERVICIO(?,?,?,?)}");
            cs.setInt(1,codigo );
            cs.setString(2, cedCliente);
            cs.setString(3, cedEmpleado);
            cs.setString(4, "Proceso");
            if (cs.executeUpdate()==1) {
                System.out.println("Insercion de  exitosa");
                JOptionPane.showMessageDialog(null, "Se registro con exito!");
            }else{
                System.out.println("Insercion de  Fallo");
            }
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }
    
    
    
    
}
