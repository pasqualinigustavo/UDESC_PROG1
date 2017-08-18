package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao01 {
    public void executar(){
        int linhas, colunas, matriz[][], menor;
        
        linhas = Integer.parseInt(JOptionPane.showInputDialog("Digíte o número de linhas !!"));
        colunas = Integer.parseInt(JOptionPane.showInputDialog("Digíte o número de colunas !!"));
        
        matriz = new int[linhas][colunas];
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digíte o valor para a posição " + (i+1) + " e " + (j+1)));
            }
        }
        
        menor = matriz[0][0];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(menor > matriz[i][j]){
                    menor = matriz[i][j];
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Menor dos valores: " + menor);
    }
}
