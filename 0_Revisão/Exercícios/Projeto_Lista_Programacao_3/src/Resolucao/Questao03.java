package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao03 {
    public void executar(){
        int primeiroNumero, segundoNumero, soma;
        
        primeiroNumero = Integer.parseInt(
                JOptionPane.showInputDialog("Digíte o primeiro número !!"));
        segundoNumero = Integer.parseInt(
                JOptionPane.showInputDialog("Digíte o segundo número !!"));
        
        soma = primeiroNumero + segundoNumero;
        
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}
