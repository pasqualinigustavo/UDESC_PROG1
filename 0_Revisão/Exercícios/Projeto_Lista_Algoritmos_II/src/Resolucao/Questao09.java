package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao09 {
    public void executar(){
        String s = "";
        int numero;
        
        numero  = Integer.parseInt(JOptionPane.showInputDialog("Digíte o número para o cálculo da tabuada !!"));
        
        for(int i = 0; i <= 10; i++){
            s += numero + " x " + i + " = " + (numero*i) + "\n";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
