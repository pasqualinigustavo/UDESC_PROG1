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
public class Conta {
    private int agencia;
    private int numero;
    protected double saldo;

    public boolean saque(double quantia) {
        if(quantia <= saldo) {
            this.saldo -= quantia;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" + "agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
    public void deposito(double quantia) {
        this.saldo += quantia;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
