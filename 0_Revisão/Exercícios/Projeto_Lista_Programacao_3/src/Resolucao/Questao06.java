package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao06 {
    public void executar(){
        double despesa, gorjeta, valorTotal;
        
        despesa = Double.parseDouble(JOptionPane.showInputDialog("Digíte o valor da despesa !!").replaceAll(",", "."));
        
        gorjeta = despesa * 0.1;
        
        valorTotal = despesa + gorjeta;
        
        JOptionPane.showMessageDialog(null, "Despesa: " + despesa
                + "\nGorjeta: " + gorjeta
                + "\nValor Total: " + valorTotal
        );
    }
}
