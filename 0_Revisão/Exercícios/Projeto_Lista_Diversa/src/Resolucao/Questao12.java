package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao12 {
    public void executar(){
        double salarioMinimo, salarioFuncionario, razao;
        
        salarioMinimo = Double.parseDouble(
                JOptionPane.showInputDialog("Digíte o salário minimo atual !!")
                        .replaceAll(",", "."));
        salarioFuncionario = Double.parseDouble(
                JOptionPane.showInputDialog("Digíte o salário do funcionário !!")
                        .replaceAll(",", "."));
        
        razao = salarioFuncionario / salarioMinimo;
        razao = Double.parseDouble(String.format("%.2f", razao).replaceAll(",", "."));
        
        JOptionPane.showMessageDialog(null, "Salário mínimo: " + salarioMinimo 
                + "\nSalário funcionário: " + salarioFuncionario + "\nRazão: " + razao);
    }
}
