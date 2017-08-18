package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao02 {
    public void executar(){
        double  media, notas[] = new double[4];
        
        for(int i = 0; i < notas.length; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digíte a " + (i+1) + "ª nota: ").replaceAll(",", "."));
        }
        
        media = (notas[0] + 2*notas[1] + 3*notas[2] + notas[3])/7;
        
        if(media >= 9){
            JOptionPane.showMessageDialog(null, "A");
        }else if(media >= 7.5){
            JOptionPane.showMessageDialog(null, "B");
        }else if(media >= 6){
            JOptionPane.showMessageDialog(null, "C");
        }else if(media >= 4){
            JOptionPane.showMessageDialog(null, "D");
        }else{
            JOptionPane.showMessageDialog(null, "E");
        }
    }
}
