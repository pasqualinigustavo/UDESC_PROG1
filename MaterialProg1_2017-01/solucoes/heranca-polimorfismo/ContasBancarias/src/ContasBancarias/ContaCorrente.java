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
public class ContaCorrente extends Conta {
    private double limiteCredito;

    public boolean saque(double quantia) {
        if(quantia <= saldo) {
            this.saldo -= quantia;
            return true;
        } else if(quantia - saldo <= limiteCredito) {
            this.saldo -= quantia;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " - ContaCorrente{" + "limiteCredito=" + limiteCredito + '}';
    }
    
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
