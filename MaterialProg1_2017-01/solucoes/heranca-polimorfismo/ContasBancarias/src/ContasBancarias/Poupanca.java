/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContasBancarias;

/**
 *
 * @author 9584013
 */
public class Poupanca extends Conta {
    private double taxaJuros;

    @Override
    public String toString() {
        return super.toString() + " - Poupanca{" + "taxaJuros=" + taxaJuros + '}';
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
