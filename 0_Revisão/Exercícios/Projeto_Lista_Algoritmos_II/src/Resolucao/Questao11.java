package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao11 {
    public void executar(){
        int dentroIntervalo = 0, foraIntervalo = 0, auxiliar;
        
        for(int i = 0; i < 10; i++){
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digíte o " + (i+1) + "º número"));
            if(auxiliar >= 10 && auxiliar <= 50){
                dentroIntervalo++;
            }else{
                foraIntervalo++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Números dentro do intervalo: " + 
                dentroIntervalo + "\nNúmeros fora do intervalo: " + foraIntervalo);
    }
}
