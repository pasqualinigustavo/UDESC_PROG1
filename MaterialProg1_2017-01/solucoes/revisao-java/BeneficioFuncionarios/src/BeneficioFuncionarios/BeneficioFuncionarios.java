package BeneficioFuncionarios;

import javax.swing.JOptionPane;

public class BeneficioFuncionarios {

    public static void main(String[] args) {
        int tempoServico = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de serviço"));
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
        int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de dependentes"));
        
        if(temDireito(tempoServico, idade)) {
            double beneficio = calculaBeneficio(salario, dependentes);
            double novoSalario = novoSalario(salario, beneficio);
            JOptionPane.showMessageDialog(null, "O benefício será de R$" + beneficio + ", totalizando um salário de R$" + novoSalario);
        } else {
            JOptionPane.showMessageDialog(null, "O funcionário não tem direito ao benefício!");
        }
    }
    
    public static double novoSalario(double salario, double beneficio) {
        return salario + beneficio;
    }
    
    public static double calculaBeneficio(double salario, int dependentes) {
        if(salario <= 1500) {
            if(dependentes <= 2)
                return 500;
            else
                return 800;
        } else {
            if(dependentes <= 2)
                return 300;
            else
                return 500;
        }
    }
    
    public static boolean temDireito(int tempoServico, int idade) {
        return (tempoServico >= 10 && idade >= 30);
    }
    
}
