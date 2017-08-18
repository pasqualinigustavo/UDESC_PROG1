package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao05 {
    
    public void executar(){
        double velocidadePermitida, velocidadeMotorista, valorMulta, diferencaVelocidades;
        
        velocidadePermitida = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digíte a velocidade permitida na via !!")
                        .replaceAll(",", "."));
        
        velocidadeMotorista = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digíte a velocidade que o motorista estava dirigindo !!")
                        .replaceAll(",", "."));
        
        diferencaVelocidades = velocidadeMotorista - velocidadePermitida;
        
        if(diferencaVelocidades <= 0){
            valorMulta = 0;
        }else if(diferencaVelocidades >=0 && diferencaVelocidades <= 10){
            valorMulta = 50;
        }else if(diferencaVelocidades >= 11 && diferencaVelocidades <= 30){
            valorMulta = 100;
        }else{
            valorMulta = 200;
        }
        
        JOptionPane.showMessageDialog(null, "Valor da multa: " + valorMulta);
    }
}
