package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao09 {
    
    public void executar(){
        double[] numeros = new double[3];
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número: ").replaceAll(",", "."));
        }
        
        if(numeros[0] > (numeros[1] + numeros[2])){
            JOptionPane.showMessageDialog(null, "O primeiro número é maior que a soma dos outros dois !!");
        }else{
            JOptionPane.showMessageDialog(null, "O primeiro número não é maior que a soma dos outros dois !!");
        }
    }
}
