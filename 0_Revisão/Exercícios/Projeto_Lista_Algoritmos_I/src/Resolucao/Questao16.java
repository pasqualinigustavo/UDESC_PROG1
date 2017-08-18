package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao16 {
    public void executar(){
        double[] numeros = new double[3];
        double auxiliar;
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digíte o " + (i+1) + "º número: ").replaceAll(",", "."));
        }
        
        for(int i = 1; i < numeros.length; i++){
            for(int j = 0; j < numeros.length; j++){
                if(numeros[i] < numeros[j]){
                    auxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = auxiliar;
                }
            }
        }
        
        String s = "";
        for(int i = 0; i < numeros.length; i++){
            s += numeros[i] + ", ";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
