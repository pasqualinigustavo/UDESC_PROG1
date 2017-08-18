package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao10 {
    public void executar(){
        String original, editada = "";
        int posicao;
        
        original = JOptionPane.showInputDialog("Digíte a string");
        posicao = Integer.parseInt(JOptionPane.showInputDialog(original + "\nDigíte a posição para retirar"));
        
        for(int i = 0; i < original.length(); i++){
            if(i != posicao){
                editada += original.charAt(i);
            }
        }
        
        JOptionPane.showMessageDialog(null, "String original: " + original + "\nString editada: " + editada);
    }
}
