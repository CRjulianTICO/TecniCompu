/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

/**
 *
 * @author julia
 */
public class Login {
    
    
    private static Login instancia;
    private String admin;
    
    private Login(){
    }
    
    public static Login getInstancia(){
        
        if (instancia==null) {
            instancia = new Login();
        }
        return instancia;
    }
    
    
    public boolean LoginEmpleado(String user,String pass){
        
        Conexion conexion = Conexion.getInstancia();        
        Connection con = conexion.conectarBD();
        String result = null;
         boolean resp = false;
        try {
            CallableStatement cs = con.prepareCall("{? = call PKG_01_FUNCIONES.LOGIN_EMPLEADO(?,?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, user);
            cs.setString(3, pass);
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
    
    
        public boolean LoginAdmin(String pass){
        
        Conexion conexion = Conexion.getInstancia();        
        Connection con = conexion.conectarBD();
        admin = "ADMINISTRADOR";
        String result = null;
         boolean resp = false;
        try {
            CallableStatement cs = con.prepareCall("{? = call PKG_01_FUNCIONES.LOGIN_ADMIN(?,?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, pass);
            cs.setString(3,admin);
            cs.execute();
            result = cs.getString(1);
            
            if (result != null && result.equalsIgnoreCase("ADMINISTRADOR")) {
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
