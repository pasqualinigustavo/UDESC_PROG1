/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TecladoTecla;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 9584013
 */
public class Teclado {
    private String pais;
    private List<Tecla> teclas = new ArrayList<Tecla>();

    public void addTecla(char caracter) {
        Tecla t = new Tecla();
        t.setValor(caracter);
        this.teclas.add(t);
    }
    
    public String toString() {
        String result = "TECLADO: " + this.pais + "\nTECLAS: ";
        for(Tecla t: this.teclas) {
            result += t.getValor() + "  ";
        }
        return result;
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Tecla> getTeclas() {
        return teclas;
    }

    public void setTeclas(List<Tecla> teclas) {
        this.teclas = teclas;
    }
}
