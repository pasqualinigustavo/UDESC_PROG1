package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao08 {
    public void executar(){
        String s = "";
        for(int i = 0; i <= 10; i++){
            s += "4 x " + i + " = " + (4*i) + "\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
}
