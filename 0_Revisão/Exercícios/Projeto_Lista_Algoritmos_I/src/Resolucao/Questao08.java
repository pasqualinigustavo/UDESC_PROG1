package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao08 {
    
    public void executar(){
        double primeiroNumero, segundoNumero, divisao;
        
        primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digíte o primeiro número !!").replaceAll(",", "."));
        segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digíte o segundo número!!").replaceAll(",", "."));
        
        if(segundoNumero == 0){
            JOptionPane.showMessageDialog(null, "DIVISÂO POR ZERO !!");
        }else{
            divisao = primeiroNumero / segundoNumero;
            JOptionPane.showMessageDialog(null, "Resultado da divisão: " + divisao);
        }
    }
}
