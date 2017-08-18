package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao04 {
    public void executar(){
        int numero;
        String s = "";
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digíte o número !!"));
        
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                s += i + ", ";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}
