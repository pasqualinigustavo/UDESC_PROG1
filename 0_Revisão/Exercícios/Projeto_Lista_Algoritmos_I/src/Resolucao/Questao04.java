package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao04 {
    
    public void executar(){
        int primeiroNumero, segundoNumero, soma, produto;
        
        primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digíte o primeiro número !!"));
        segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digíte o segundo número !!"));
        
        soma = primeiroNumero + segundoNumero;
        
        produto = primeiroNumero * segundoNumero;
        
        JOptionPane.showMessageDialog(null, "Números digítados: " + primeiroNumero + " e " + segundoNumero
                + "\nSoma: " + soma + "\nProduto: " + produto);
    }
}
