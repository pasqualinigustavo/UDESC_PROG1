package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao11 {
    
    public void executar(){
        String seuNome, outroNome;
        
        seuNome = JOptionPane.showInputDialog("Digíte o seu nome !!");
        
        outroNome = JOptionPane.showInputDialog("Digíte o outro nome !!");
        
        if(seuNome.equalsIgnoreCase(outroNome)){
            JOptionPane.showMessageDialog(null, "NOME CORRETO");
        }else{
            JOptionPane.showMessageDialog(null, "NOME INCORRETO");
        }
    }
}
