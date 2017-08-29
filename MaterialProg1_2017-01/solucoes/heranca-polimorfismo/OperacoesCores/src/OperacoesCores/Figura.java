/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacoesCores;

/**
 *
 * @author 9584013
 */
public class Figura {
    private String cor;

    public Figura() {}

    public Figura(String cor) {
        this.cor = cor;
    }

    public double area() {
        return 0d;
    }
    
    public double perimetro() {
        return 0d;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
