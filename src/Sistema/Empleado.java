/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author Sebastián Bermudez, Andrey Palma, Rubén Ureña
 */
public class Empleado extends Persona {
    private String usuario;
    private int contrasena;

    public Empleado(String usuario, int contrasena, String nombre, String correo, int cedula, int telefono) {
        super(nombre, correo, cedula, telefono);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Empleado\nNombre: " + getNombre() + "\nCedula: " + getCedula() + "\nUsuario: " + usuario + "\nContrasena: " + contrasena + "\nTelefono: " + getTelefono() + "\nCorreo: " + getCorreo();
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }
    
}