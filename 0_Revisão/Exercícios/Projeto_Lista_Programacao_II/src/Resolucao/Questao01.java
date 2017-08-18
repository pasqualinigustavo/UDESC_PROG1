package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao01 {
    public void executar(){
        int numero;
        long fatorial = 1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digíte o número para o cálculo do fatorial !!"));
        
        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        
        JOptionPane.showMessageDialog(null, "O fatorial do número " + numero + " é " + fatorial);
    }
}
