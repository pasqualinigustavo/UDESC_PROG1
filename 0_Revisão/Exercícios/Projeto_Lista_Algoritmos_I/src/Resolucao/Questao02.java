package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao02 {
    
    public void executar(){
        int valorDigitado, maior = 0;
        
        for(int i = 0; i < 3; i++){
            valorDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número: "));
            
            if(i == 0){
                maior = valorDigitado;
            }else{
                
                if(maior < valorDigitado){
                    maior = valorDigitado;
                }
                
            }
        }
        
        JOptionPane.showMessageDialog(null, "O maior número digítado foi " + maior + " !!");
    }
}
