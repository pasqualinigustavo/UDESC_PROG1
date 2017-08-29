package Salario;

import javax.swing.JOptionPane;

public class Salario {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário"));
        int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de dependentes do funcionário"));
        
        if (salario < 2000 && dependentes > 2) {
            salario += salario * 0.255;
            JOptionPane.showMessageDialog(null, nome + ", seu valor reajustado é de " + salario);
        } else if (salario >= 2000 && dependentes >= 1) {
            salario += salario * 0.15;
            JOptionPane.showMessageDialog(null, nome + ", seu valor reajustado é de " + salario);
        } else if (salario > 3000) {
            salario += salario * 0.075;
            JOptionPane.showMessageDialog(null, nome + ", seu valor reajustado é de " + salario);
        }
    }

}
