/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadorprocessador;

/**
 *
 * @author marcelo
 */
public class Computador {
    
    private Processador processador;

    public void addProcessador(int nucleos, double potencia) {
        processador = new Processador();
        processador.setNucleos(nucleos);
        processador.setPotencia(potencia);
    }

    public void removeProcessador() {
        this.processador = null;
    }
    
    public Processador getProcessador() {
        return this.processador;
    }
}
