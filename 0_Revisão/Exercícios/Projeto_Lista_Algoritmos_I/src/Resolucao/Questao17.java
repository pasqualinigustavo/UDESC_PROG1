package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao17 {
    public void executar(){
        int a, b, c;
        double delta, raizes[] = new double[2];
        
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Sendo ax² + bx + c = 0\nDigíte o valor de a:"));
        
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Sendo ax² + bx + c = 0\nDigíte o valor de b:"));
        
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Sendo ax² + bx + c = 0\nDigíte o valor de c:"));
        
        delta = b*b - 4*a*c;
        
        if(delta < 0){
            JOptionPane.showMessageDialog(null, "A equação não possuem raízes reais !!");
        }else{
            raizes[0] = ( -b - Math.sqrt(delta) )/ (2*a);
            raizes[1] = ( -b + Math.sqrt(delta) )/ (2*a);
            
            JOptionPane.showMessageDialog(null, "Raízes: " + raizes[0] + " e " + raizes[1]);
        }
    }
}
