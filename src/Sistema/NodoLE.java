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
public class NodoLE {
    private NodoLE next;
    private Empleado dato;

    public NodoLE(Empleado dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "" + dato;
    }

    public NodoLE getNext() {
        return next;
    }

    public void setNext(NodoLE next) {
        this.next = next;
    }

    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
        this.dato = dato;
    }
    
}