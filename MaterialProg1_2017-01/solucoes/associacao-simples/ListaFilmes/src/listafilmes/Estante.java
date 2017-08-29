/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listafilmes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class Estante {
    private int numSala;
    private int numCorredor;
    private List<Filme> listaFilmes;
    
    public Estante() {
        listaFilmes = new ArrayList<Filme>();
    }

    public Estante(int numSala, int numCorredor) {
        this.numSala = numSala;
        this.numCorredor = numCorredor;
        listaFilmes = new ArrayList<Filme>();
    }

    public void addFilme(Filme f) {
        this.listaFilmes.add(f);
    }
    
    @Override
    public String toString() {
        String result = "Estante sala [" + this.numSala + "] corredor [" + this.numCorredor + "]\nFilmes:\n";
        for(Filme f : listaFilmes)
            result += f.toString() + "\n";
        
        return result;
    }
    
    public List<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public void setListaFilmes(List<Filme> listaFilmes) {
        this.listaFilmes = listaFilmes;
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
