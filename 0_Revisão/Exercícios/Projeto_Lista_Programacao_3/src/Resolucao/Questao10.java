package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao10 {
    public void executar(){
        double volume, raio, altura;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digíte o valor do raio !!").replaceAll(",", "."));
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digíte o valor do altura !!").replaceAll(",", "."));
        
        volume = 2*Math.PI*raio*altura;
        
        JOptionPane.showMessageDialog(null, "Volume: " + volume);
    }
}
