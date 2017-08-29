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
public class Produto {
    private String nome;
    private double valor;
    
    public double calculaDesconto() {
        return valor * 0.05;
    }
    
    public int calculaParcelas() {
        return 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
