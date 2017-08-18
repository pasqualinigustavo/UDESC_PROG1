package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao07 {
    public void executar(){
        int l, numero;
        
        l = Integer.parseInt(JOptionPane.showInputDialog("Digíte o valor para o l !!"));
        
        numero = 0;
        while(true){
             if(Math.pow(numero, 2) >= l){
                 break;
             }
             numero++;
        }
        
        JOptionPane.showMessageDialog(null, numero);
    }
}
