package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao12 {
    public void executar(){
        double valorAntigo, novoValor;
        
        valorAntigo = Double.parseDouble(JOptionPane.showInputDialog("Digíte o valor do produto !!").replaceAll(",", "."));
        
        novoValor = valorAntigo - valorAntigo * 0.09;
        
        JOptionPane.showMessageDialog(null, "Valor antigo: " + valorAntigo + "\nValor novo: " + novoValor);
    }
}
