/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author Rubén Ureña Gómez
 */
public class NodoCC {
    private int dato;
    private NodoCC atras;

    public NodoCC(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoCC getAtras() {
        return atras;
    }

    public void setAtras(NodoCC atras) {
        this.atras = atras;
    }   
    
}