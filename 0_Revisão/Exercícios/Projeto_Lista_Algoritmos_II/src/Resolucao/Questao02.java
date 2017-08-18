package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao02 {
    public void executar(){
        String s = "";
        for(int i = 0; i < 200; i++){
            if(i % 7 == 0){
                s += i + ", ";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}
