package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao03 {
    public void executar(){
        String s = "";
        for(int i = 0; i < 100; i++){
            if(i % 4 == 0){
                s += i + ", ";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}
