package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao13 {
    public void executar(){
        double numeroHorasTrabalhadas, valorSalarioMinimo = 973,
                numeroHorasExtrastrabalhadas, salarioFinal;
        
        numeroHorasTrabalhadas = Double.parseDouble(
                JOptionPane.showInputDialog("Digíte quantas horas foram feitas !!")
                        .replaceAll(",", "."));
        
        numeroHorasExtrastrabalhadas = Double.parseDouble(
                JOptionPane.showInputDialog("Digíte quantas horas foram feitas !!")
                        .replaceAll(",", "."));
        
        salarioFinal = numeroHorasTrabalhadas * (valorSalarioMinimo/8) +
                numeroHorasExtrastrabalhadas * (valorSalarioMinimo/4);
        
        salarioFinal = Double.parseDouble(String.format("%.2f", salarioFinal).replaceAll(",", "."));
        
        JOptionPane.showMessageDialog(null, "Horas trabalhadas: " + numeroHorasTrabalhadas 
                + "\nHoras extras trabalhadas: " + numeroHorasExtrastrabalhadas 
                + "\nSalário Final: R$ " + salarioFinal);
    }
}
