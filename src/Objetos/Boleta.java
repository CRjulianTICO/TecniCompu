/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Sebastián Bermudez, Andrey Palma, Rubén Ureña
 */
public class Boleta {

    private int numeroTiquete = 0;

    public Boleta(int numeroTiquete) {
        this.numeroTiquete = numeroTiquete;
    }

    public Boleta() {
        
    }

    public int getNumeroTiquete() {
        return numeroTiquete;
    }

    public void setNumeroTiquete(int numeroTiquete) {
        this.numeroTiquete = numeroTiquete;
    }

    @Override
    public String toString() {
        return "El tiquete que le corresponde es el: " + numeroTiquete;
    }

}
