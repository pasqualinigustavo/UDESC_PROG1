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
public class Eletronico extends Produto {
    private int voltagem;
    
    @Override
    public double calculaDesconto() {
        return this.getValor() * 0.1;
    }
    
    @Override
    public int calculaParcelas() {
        if(this.getValor() > 1000)
            return 10;
        else
            return super.calculaParcelas();
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
}
