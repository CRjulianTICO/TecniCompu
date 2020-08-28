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
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián Bermudez, Andrey Palma, Rubén Ureña
 */
public class ServicioContratado extends Thread{
    private final String boleta;
    private final int numBoleta;

    public ServicioContratado(String boleta, int numBoleta) {
        this.boleta = boleta;
        this.numBoleta = numBoleta;
    }
    
    public void ingresa(){
        try{
            sleep(60000);
            try{
                File archivo = new File("./serviciosContratados.txt");
                FileWriter fw = new FileWriter(archivo.getAbsoluteFile());
                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write(numBoleta);
                    bw.newLine();
                    bw.write(boleta);               
                }
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error de archivo para escribir", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(InterruptedException e){
            JOptionPane.showMessageDialog(null, "El hilo no se ha podido realizar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void run(){
        ingresa();
    }
    
}
