/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import Conexion.Conexion;
import Objetos.ClienteServicio;
import Objetos.EquipoLista;
import Objetos.Servicio;
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
public class MantenimientoFactura {
    
    private static MantenimientoFactura instancia;
    private ClienteServicio cls;
    
    private MantenimientoFactura (){}
    
    public static MantenimientoFactura getInstancia(){
        if (instancia == null) {
            instancia = new MantenimientoFactura();
        }
        return instancia;
    }
    
    
    public List<Object> listarClienteServicio(){
    
        Conexion con;
        ResultSet rs ;
        List<Object> lista = new ArrayList();
        
        try {
            con = Conexion.getInstancia();
             CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_LISTAR_SERVICIOCLIENTE(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeUpdate();           
            rs = (ResultSet)cs.getObject(1);
            while(rs.next()){
                cls = new ClienteServicio();
                cls.setIdServicio(rs.getInt(1));
                cls.setIdCliente(rs.getString(2));
                cls.setMarca(rs.getString(3));
                cls.setModelo(rs.getString(4));
                cls.setTipo(rs.getString(5));
                cls.setEstado(rs.getString(6));
                cls.setCosto(rs.getDouble(7));
                lista.add(cls); 
            }
            rs.close();
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return lista;
    }
   
    
  
    public List<Object> listarServicioContratadoEsp(String cedula,int id){
        Conexion con = null;
        ResultSet rs = null;
        List<Object> lista = new ArrayList();
            
        try {
            con = Conexion.getInstancia();
            CallableStatement cs = con.conectarBD().prepareCall("{?=call PKG_01_FUNCIONES.FN_LISTAR_SERVICIO_CONTRATADO(?,?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setInt(2, id);
            cs.setString(3, cedula);
            cs.executeUpdate();           
            rs = (ResultSet)cs.getObject(1);
            while(rs.next()){
                cls = new ClienteServicio();
                cls.setIdServicio(rs.getInt(1));
                cls.setIdCliente(rs.getString(2));
                cls.setMarca(rs.getString(3));
                cls.setModelo(rs.getString(4));
                cls.setTipo(rs.getString(5));
                cls.setEstado(rs.getString(6));
                cls.setCosto(rs.getDouble(7));
                lista.add(cls); 
            }
            rs.close();
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        return lista;
    }
    
    
    public void listo(String cedula,int id){
      Conexion con;
      List<Object> lista = new ArrayList();
        
        try {
            con = Conexion.getInstancia();
             CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_LISTO_CLIENTESERVICIO(?,?)}");
            cs.setInt(1,id);
            cs.setString(2, cedula);
            if (cs.executeUpdate()==1 ) {
                System.out.println("Se actualizo bien");
                JOptionPane.showMessageDialog(null, "Se actualizo satisfactoriamente");
            }else{
                System.out.println("UPS NO LO LOGRAMOS");
            }
           
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
    }    
    
    public void facturado(String cedula,int id){
      Conexion con;
      List<Object> lista = new ArrayList();
        
        try {
            con = Conexion.getInstancia();
             CallableStatement cs = con.conectarBD().prepareCall("{call PKG_01_SP.SP_FINALIZA_CLIENTESERVICIO(?,?)}");
            cs.setInt(1,id);
            cs.setString(2, cedula);
            if (cs.executeUpdate()==1 ) {
                System.out.println("Se actualizo bien");
                JOptionPane.showMessageDialog(null, "Se facturo con exito");
            }else{
                System.out.println("UPS NO LO LOGRAMOS");
            }
           
            con.desconectarBD();
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
    }
    
}
