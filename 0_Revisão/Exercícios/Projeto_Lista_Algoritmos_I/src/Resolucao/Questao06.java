package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao06 {
    
    public void executar(){
        int ano;
        
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digíte o ano:"));
        
        if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0) ){
            JOptionPane.showMessageDialog(null, "Ano de " + ano + " é Bissexto !!");
        }else{
            JOptionPane.showMessageDialog(null, "Ano de " + ano + " não é Bissexto !!");
        }
    }
}
