package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao09 {
    public void executar(){
        double f, c = 0;
        
        c = Double.parseDouble(JOptionPane.showInputDialog("Digíte a temperatura em celsius !!").replaceAll(",", "."));
        
        f = (9*c+160)/5;
        
        JOptionPane.showMessageDialog(null, "Celsius: " + c + "\nFarenheit: " + f);
    }
}
