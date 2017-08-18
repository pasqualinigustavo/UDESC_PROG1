package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao02 {
    public void executar(){
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digíte o número !!"));
        
        JOptionPane.showMessageDialog(null, "Antecessor: " + (numero-1) 
                + "\nSucessor: " + (numero+1));
    }
}
