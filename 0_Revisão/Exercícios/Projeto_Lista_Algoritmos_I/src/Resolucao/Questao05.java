package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao05 {
    
    public void executar(){
        int numeroDigitado, soma = 0;
        
        for(int i = 0; i < 4; i++){
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digíte o " + (i+1) + "º número: "));
            
            if(numeroDigitado % 2 == 0){
                soma += numeroDigitado;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}
