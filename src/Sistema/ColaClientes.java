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
public class ColaClientes {
    private NodoCC frente, ultimo;
    
    public void encola(int ficha){
        if (frente==null){
            frente = new NodoCC(ficha);
            ultimo = frente;
        }else{
            NodoCC aux = new NodoCC(ficha);
            ultimo.setAtras(aux);
            ultimo = aux;
        }
    }
    
    public NodoCC atiende(){
        NodoCC aux = frente;
        if(aux!=null){
            frente = frente.getAtras();
            aux.setAtras(null);
            if(frente==null){
                ultimo=null;
            }
        }
        return aux;
    }
    
}