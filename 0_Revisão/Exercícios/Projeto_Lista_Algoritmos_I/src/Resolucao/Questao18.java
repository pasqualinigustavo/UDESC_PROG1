package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao18 {
    public void executar(){
        double notas[] = new double[4], soma = 0,media;
        
        for(int i = 0; i < notas.length; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digíte o " + (i+1) + "º nota: ").replaceAll(",", "."));
        }
        
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        
        media = soma/notas.length;
        
        JOptionPane.showMessageDialog(null, "Sua média final: " + media);
    }
}
