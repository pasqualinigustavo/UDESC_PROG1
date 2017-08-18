package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao04 {
    public void executar(){
        int primeiroNumero, segundoNumero, subtracao;
        
        primeiroNumero = Integer.parseInt(
                JOptionPane.showInputDialog("Digíte o primeiro número !!"));
        segundoNumero = Integer.parseInt(
                JOptionPane.showInputDialog("Digíte o segundo número !!"));
        
        subtracao = primeiroNumero - segundoNumero;
        
        JOptionPane.showMessageDialog(null, "Subtracao: " + subtracao);
    }
}
