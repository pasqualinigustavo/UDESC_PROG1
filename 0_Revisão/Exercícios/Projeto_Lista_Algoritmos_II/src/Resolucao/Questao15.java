package Resolucao;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao15 {
    public void executar(){
        Random geradorNumeros = new Random();
        String s = "";
        int auxiliar;
        
        for(int i = 0; i < 20; i++){
            auxiliar = 1000 + geradorNumeros.nextInt(1999 - 1000);
            if(auxiliar % 11 == 5){
                s += auxiliar + ", ";
            }
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
