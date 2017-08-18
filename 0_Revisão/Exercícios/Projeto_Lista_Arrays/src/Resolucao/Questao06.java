package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao06 {
    public void executar(){
        String fraseOriginal, fraseEditada = "";
        char c;
        
        fraseOriginal = JOptionPane.showInputDialog("Digíte a frase");
        fraseOriginal = fraseOriginal.toLowerCase();
        
        for(int i = 0; i < fraseOriginal.length(); i++){
            c = fraseOriginal.charAt(i);
            
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                fraseEditada += c;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Frase original: " + fraseOriginal + 
                "\nFrase Editada: " + fraseEditada);
    }
}
