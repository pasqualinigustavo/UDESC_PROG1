package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao08 {
    public void executar(){
        double valorPoupanca = 500;
        
        for(int i = 1; i <= 5 ; i++){
            valorPoupanca += valorPoupanca * 0.012;
        }
        
        valorPoupanca = Double.parseDouble(String.format("%.2f", valorPoupanca).replaceAll(",", "."));
        
        JOptionPane.showMessageDialog(null, "Valor: R$ " + valorPoupanca);
    }
}
