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
public class Factura {

    String informe;
    int total;

    public Factura(String informe, int total) {
        this.informe = informe;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura [Informe: " + informe + " Total: " + total + "]";
    }

}
