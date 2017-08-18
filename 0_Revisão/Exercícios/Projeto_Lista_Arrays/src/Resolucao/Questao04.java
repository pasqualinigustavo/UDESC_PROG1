package Resolucao;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao04 {
    public void executar(){
        int a[] = new int[5], b[] = new int[a.length], c[] = new int[a.length];
        String s = "";
        Random gerador = new Random();
        
        for(int i = 0; i < a.length; i++){
            a[i] = gerador.nextInt(10);
        }
        
        for(int i = 0; i < b.length; i++){
            b[i] = gerador.nextInt(10);
        }
        
        for(int i = 0; i < c.length; i++){
            c[i] = a[i] + b[i];
        }
        
        for(int i = 0; i < a.length; i++){
            s += a[i] + ", ";
        }
        s += "\n";
        
        for(int i = 0; i < b.length; i++){
            s += b[i] + ", ";
        }
        s += "\n";
        
        for(int i = 0; i < c.length; i++){
            s += c[i] + ", ";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
