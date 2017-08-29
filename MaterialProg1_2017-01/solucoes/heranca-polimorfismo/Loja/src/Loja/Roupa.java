/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loja;

/**
 *
 * @author 9584013
 */
public class Roupa extends Produto {
    private char tamanho;

    @Override
    public double calculaDesconto() {
        return super.calculaDesconto() + 15;
    }
    
    @Override
    public int calculaParcelas() {
        if(this.getValor() > 200)
            return super.calculaParcelas() + 2;
        else
            return super.calculaParcelas();
    }
    
    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
}
