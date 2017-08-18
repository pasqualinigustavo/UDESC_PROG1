package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao05 {
    public void executar(){
        int primeiroNumero, segundoNumero, multiplicao;
        
        primeiroNumero = Integer.parseInt(
                JOptionPane.showInputDialog("Digíte o primeiro número !!"));
        segundoNumero = Integer.parseInt(
                JOptionPane.showInputDialog("Digíte o segundo número !!"));
        
        multiplicao = primeiroNumero * segundoNumero;
        
        JOptionPane.showMessageDialog(null, "Multiplicao: " + multiplicao);
    }
}
