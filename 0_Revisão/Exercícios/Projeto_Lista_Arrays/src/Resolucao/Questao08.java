package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao08 {
    public void executar(){
        int espacosBrancos = 0;
        String fraseAntiga, fraseEditada = "";
        char c;
        
        fraseAntiga = JOptionPane.showInputDialog("Digíte a frase !!");
        fraseAntiga = fraseAntiga.trim();
        
        for(int i = 0; i < fraseAntiga.length(); i++){
            c= fraseAntiga.charAt(i);
            if(c == ' '){
                espacosBrancos++;
            }else{
                fraseEditada += c;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Frase antiga: " + fraseAntiga + 
                    "\nFase editada: " + fraseEditada + 
                    "\nEspaço em branco: " + espacosBrancos);
    }
}
