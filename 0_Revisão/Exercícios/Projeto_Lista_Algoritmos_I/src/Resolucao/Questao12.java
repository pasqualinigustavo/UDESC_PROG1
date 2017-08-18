package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao12 {
    
    public void executar(){
        int a, b;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número !!"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número !!"));
        
        if(a == b){
            JOptionPane.showMessageDialog(null, "Os números são iguais A=B");
        }else if(a < b){
            JOptionPane.showMessageDialog(null, "O primeiro valor é o maior !!");
        }else{
            JOptionPane.showMessageDialog(null, "O segundo valor é o maior !!");
        }
    }
}
