package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao01 {
    public void executar(){
        int primeiroNumero, segundoNumero;
        
        primeiroNumero = Integer.parseInt(
                JOptionPane.showInputDialog("Digíte o primeiro número !!"));
        segundoNumero = Integer.parseInt(
                JOptionPane.showInputDialog("Digíte o segundo número !!"));
        
        
        JOptionPane.showMessageDialog(null, "Primeiro número: " + primeiroNumero 
                + "\nSegundo número: " + segundoNumero);
    }
}
