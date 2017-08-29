/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContasBancarias;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 9584013
 */
public class Aplicacao {
    
    private List<Conta> contas = new ArrayList<Conta>(); //a
    
    public void run() {
        criaRegistros();
        mostraContas();
        sacaValorTodasContas(500);
        mostraContas();
        transfere(contas.get(0), contas.get(1), 100);
        mostraContas();
        atualizaSaldoPoupancas();
        mostraContas();
    }
    
    //adicional
    private void mostraContas() {
        String texto = "";
        for(Conta c : contas) {
            texto += c.toString() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, texto);
    }
    
    //e
    private void atualizaSaldoPoupancas() {
        for(Conta c : contas) {
            if(c instanceof Poupanca) {
                Poupanca p = (Poupanca) c;
                double saldoAtual = p.getSaldo();
                double novoSaldo = saldoAtual + (saldoAtual * p.getTaxaJuros());
                p.setSaldo(novoSaldo);
            }
        }
    }
    
    //d
    private void transfere(Conta c1, Conta c2, double valor) {
        if(c1.saque(valor)) {
            c2.deposito(valor);
            JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Transferência NÃO PODE SER realizada!");
        }
    }
    
    //c
    private void sacaValorTodasContas(double valor) {
        for(Conta c : contas) {
            if(c.saque(valor))
                JOptionPane.showMessageDialog(null, "Valor sacado da conta " + c.getNumero());
            else
                JOptionPane.showMessageDialog(null, "Valor NÃO PODE SER sacado da conta " + c.getNumero());
        }
    }
    
    //b
    private void criaRegistros() {
        ContaCorrente c = new ContaCorrente();
        c.setAgencia(111);
        c.setNumero(123456);
        c.setSaldo(1200);
        c.setLimiteCredito(500);
        contas.add(c);
        
        c = new ContaCorrente();
        c.setAgencia(222);
        c.setNumero(654321);
        c.setSaldo(10);
        c.setLimiteCredito(1000);
        contas.add(c);
        
        c = new ContaCorrente();
        c.setAgencia(111);
        c.setNumero(789123);
        c.setSaldo(600);
        c.setLimiteCredito(200);
        contas.add(c);
        
        Poupanca p = new Poupanca();
        p.setAgencia(222);
        p.setNumero(963258);
        p.setSaldo(1500);
        p.setTaxaJuros(0.05);
        contas.add(p);
        
        p = new Poupanca();
        p.setAgencia(333);
        p.setNumero(741369);
        p.setSaldo(0);
        p.setTaxaJuros(0.08);
        contas.add(p);
    }
}
