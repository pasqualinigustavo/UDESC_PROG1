package Calculadora;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        String menu = "1 - Funções quadráticas\n"
                + "2 - Teorema de Pitágoras\n"
                + "3 - Área de trapézio\n\n"
                + "0 - Sair";
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
        
        while (opcao != 0) {
            switch(opcao) {
                case 1:
                    calculaBhaskara();
                    break;
                case 2:
                    calculaPitagoras();
                    break;
                case 3:
                    calculaAreaTrapezio();
                    break;
            }
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
        }
    }    
    
    private static void calculaBhaskara() {
        Bhaskara calculo = new Bhaskara();
        calculo.setA(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do coeficiente A")));
        calculo.setB(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do coeficiente B")));
        calculo.setC(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do coeficiente C")));
        
        JOptionPane.showMessageDialog(null, "RESULTADO: \n" + calculo.calcula());
    }
    
    private static void calculaPitagoras() {
        Pitagoras calculo = new Pitagoras();
        calculo.setB(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do cateto B")));
        calculo.setC(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do cateto C")));
        
        JOptionPane.showMessageDialog(null, "RESULTADO: \n" + calculo.calcula());
    }
    
    private static void calculaAreaTrapezio() {
        AreaTrapezio calculo = new AreaTrapezio();
        calculo.setBaseMaior(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base maior")));
        calculo.setBaseMenor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base menor")));
        calculo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura")));
        
        JOptionPane.showMessageDialog(null, "RESULTADO: \n" + calculo.calcula());
    }
}
