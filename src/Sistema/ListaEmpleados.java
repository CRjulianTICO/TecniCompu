/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián Bermudez, Andrey Palma, Rubén Ureña
 */
public class ListaEmpleados {
    private NodoLE cabeza, ultimo;
    
    public void inserta(Empleado e){
        if(cabeza == null){
            cabeza = new NodoLE(e);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
        }else{
            if(e.getCedula()<= cabeza.getDato().getCedula()){
                NodoLE aux = new NodoLE(e);
                aux.setNext(cabeza);
                cabeza = aux;
                ultimo.setNext(cabeza);
            }else{
                if(e.getCedula() >= ultimo.getDato().getCedula()){
                    NodoLE aux = new NodoLE(e);
                    ultimo.setNext(aux);
                    ultimo = aux;
                    ultimo.setNext(cabeza);
                }else{
                    NodoLE aux = cabeza;
                    while(aux.getNext().getDato().getCedula() < e.getCedula()){
                        aux = aux.getNext();
                    }
                    NodoLE temp = new NodoLE(e);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
            }
        }
    }
    
    @Override
    public String toString(){
        NodoLE aux = cabeza;
        String s = "";
        if(aux != null){
            s += aux + "\n\n";
            aux = aux.getNext();
            while(aux != cabeza){
                s += aux + "\n\n";
                aux = aux.getNext();
            }
        }else{
            s = "No hay empleados";
        }
        return s;
    }
    
    public boolean existe(int cedula){
        boolean existe = false;
        NodoLE aux = cabeza;
        if(aux != null){
            if(aux.getDato().getCedula() != cedula){
                aux = aux.getNext();
                while (aux != cabeza) {
                    if (aux.getDato().getCedula() == cedula) {
                        existe = true;
                    }
                    aux = aux.getNext();
                }
            }else{
                existe = true;
            }
        }
        return existe;
    }
    
    public boolean existeUsuario(String usuario){
        boolean existe = false;
        NodoLE aux = cabeza;
        if(aux != null){
            if(!aux.getDato().getUsuario().equals(usuario)){
                aux = aux.getNext();
                while (aux != cabeza) {
                    if (aux.getDato().getUsuario().equals(usuario)) {
                        existe = true;
                    }
                    aux = aux.getNext();
                }
            }else{
                existe = true;
            }
        }
        return existe;
    }
    
    public int contrasena(String usuario){
        int contrasena = 0;
        NodoLE aux = cabeza;
        do{
            if (aux.getDato().getUsuario().equals(usuario)) {
                contrasena = aux.getDato().getContrasena();
            }
            aux = aux.getNext();
        }while(aux != cabeza);
        return contrasena;
    }
    
    public void modifica(Empleado e){
        NodoLE aux = cabeza;
        if(aux != null){
            if(aux.getDato().getCedula() != e.getCedula()){
                aux = aux.getNext();
                while (aux != cabeza) {
                    if (aux.getDato().getCedula() == e.getCedula()) {
                        aux.setDato(e);
                    }
                    aux = aux.getNext();
                }
            }else{
                aux.setDato(e);
            }
        }
    }
    
    public void elimina(int cedula) {
        NodoLE aux = cabeza;
        if (cedula == cabeza.getDato().getCedula()){
            if(cabeza != ultimo){
                cabeza = cabeza.getNext();
                ultimo.setNext(cabeza);
            }else{
                cabeza = null;
                ultimo = null;
            }
        }else{
            while (aux.getNext() != cabeza){
                if (cedula == aux.getNext().getDato().getCedula()){
                    if(aux.getNext() == ultimo){
                        ultimo = aux;
                        ultimo.setNext(cabeza);
                    }else{
                        NodoLE temp = aux.getNext();
                        aux.setNext(temp.getNext());
                    }
                }
                aux = aux.getNext();
            }
        }
    }
    
    public void actualizarTxt(){
        NodoLE aux = cabeza;
        if(aux != null){
            try{
                File archivo = new File("./empleados.txt");
                FileWriter fw = new FileWriter(archivo.getAbsoluteFile());
                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write(aux.getDato().getUsuario());
                    bw.newLine();
                    bw.write(Integer.toString(aux.getDato().getContrasena()));
                    bw.newLine();
                    bw.write(aux.getDato().getNombre());
                    bw.newLine();
                    bw.write(aux.getDato().getCorreo());
                    bw.newLine();
                    bw.write(Integer.toString(aux.getDato().getCedula()));
                    bw.newLine();
                    bw.write(Integer.toString(aux.getDato().getTelefono()));
                    bw.newLine();
                    aux = aux.getNext();
                    while(aux!=cabeza){ 
                        bw.write(aux.getDato().getUsuario());
                        bw.newLine();
                        bw.write(Integer.toString(aux.getDato().getContrasena()));
                        bw.newLine();
                        bw.write(aux.getDato().getNombre());
                        bw.newLine();
                        bw.write(aux.getDato().getCorreo());
                        bw.newLine();
                        bw.write(Integer.toString(aux.getDato().getCedula()));
                        bw.newLine();
                        bw.write(Integer.toString(aux.getDato().getTelefono()));
                        bw.newLine();
                        aux = aux.getNext();
                    }                
                }
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error de archivo para escribir", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            try{
                File archivo = new File("./empleados.txt");
                FileWriter fw = new FileWriter(archivo.getAbsoluteFile());
                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write("");
                    bw.newLine();               
                }
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error de archivo para escribir", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public Empleado getEmpleado(int cedula){
        Empleado empleado = null;
        NodoLE aux = cabeza;
        if(aux != null){
            if(aux.getDato().getCedula() != cedula){
                aux = aux.getNext();
                while(aux != cabeza){
                    if (aux.getDato().getCedula() == cedula){
                        empleado = aux.getDato();
                    }
                    aux = aux.getNext();
                }
            }else{
                empleado = aux.getDato();
            }    
        }
        return empleado;
    }
    
}