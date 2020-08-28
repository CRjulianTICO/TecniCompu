
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
     private static Conexion instancia;
     private Connection con;
    private Conexion(){
    
    }
    
    public static Conexion getInstancia(){
        if (instancia ==null) {
            instancia = new Conexion();
        }
    
        return instancia;
    }
    
    public Connection conectarBD(){
          try {  
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");   
            System.out.println("SE CONECTO SATISFACTORIAMENTE CON LA BD");           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public void desconectarBD(){
        try {  
            if (con != null) {
                con.close();
                System.out.println("SE CERRO LA CONEXION CON LA BD");
            }else{
                System.out.println("La conexio no ha sido inicializada");
            }
  
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
