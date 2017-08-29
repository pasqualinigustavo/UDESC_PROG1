/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmes;

/**
 *
 * @author marcelo
 */
public class Estante {
    private int numSala;
    private int numCorredor;
    
    public Estante() {}

    public Estante(int numSala, int numCorredor) {
        this.numSala = numSala;
        this.numCorredor = numCorredor;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public int getNumCorredor() {
        return numCorredor;
    }

    public void setNumCorredor(int numCorredor) {
        this.numCorredor = numCorredor;
    }
}
