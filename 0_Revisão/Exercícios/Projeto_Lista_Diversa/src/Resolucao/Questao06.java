package Resolucao;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao06 {
    public void executar(){
        int matriz[][] = new int[3][3];
        String s = "";
        Random gerador = new Random();
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = gerador.nextInt(20) - 10;
            }
        }
        
        for(int i = 0; i < matriz.length; i++){
            s += "|   ";
            for(int j = 0; j < matriz[i].length; j++){
                s += matriz[i][j] + "   ";
            }
            s += "   |\n";
        }
        
        JOptionPane.showMessageDialog(null, s);
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] < 0){
                    matriz[i][j] = -1 * matriz[i][j];
                }
            }
        }
        
        s = "";
        for(int i = 0; i < matriz.length; i++){
            s += "|   ";
            for(int j = 0; j < matriz[i].length; j++){
                s += matriz[i][j] + "   ";
            }
            s += "   |\n";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
