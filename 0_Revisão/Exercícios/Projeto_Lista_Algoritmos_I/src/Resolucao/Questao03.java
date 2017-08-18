package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao03 {
    
    public void executar(){
        double lado, area;
        
        lado = Double.parseDouble(JOptionPane.showInputDialog("Digíte o valor do lado do quadrado !!").replaceFirst(",", "."));
        
        area = Math.pow(lado, 2);
        
        JOptionPane.showMessageDialog(null, "A área do quadrado é " + area + " !!");
    }
}
