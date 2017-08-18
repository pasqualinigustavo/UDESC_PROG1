package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao01 {
    public void executar(){
        int numeros[] = new int[100], tamanho = 0, auxiliar;
        
        do{
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Digíte o próximo número\nPara finalizar digite -1."));
            
            if(auxiliar != -1){
                numeros[tamanho] = auxiliar;
                tamanho++;
            }
        }while(auxiliar != -1);
        
        String s = "";
        for(int i = tamanho-1; i >= 0; i--){
            s += numeros[i] + " ";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
