package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao01 {
    public void executar(){
        int soma = 0;
        for(int i = 1; i <= 100; i++){
            soma += i;
        }
        
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}
