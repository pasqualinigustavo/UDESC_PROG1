package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao07 {
    public void executar() {
        int maior = 0, auxiliar;

        for (int i = 0; i < 5; i++) {
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Digíte o " + (i+1) + "º número !!"));
            
            if(i == 0){
                maior = auxiliar;
            }else{
                if(maior < auxiliar){
                    maior = auxiliar;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Maior número encontrado: " + maior);
    }
}
