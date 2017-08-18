package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao07 {
    
    public void executar(){
        double anos, cigarroPorDia, precoCarteira, valorTotal;
        
        anos = Double.parseDouble(JOptionPane.showInputDialog("Há quantos anos você fuma?").replaceAll(",", "."));
        cigarroPorDia = Double.parseDouble(JOptionPane.showInputDialog("Quantos cigarros você fuma por dia?").replaceAll(",", "."));
        precoCarteira = Double.parseDouble(JOptionPane.showInputDialog("Digíte o preço da cartela:").replaceAll(",", "."));
        
        valorTotal = anos * cigarroPorDia * precoCarteira;
        valorTotal = Double.parseDouble(String.format("%.2f", valorTotal).replaceAll(",", "."));
        
        JOptionPane.showMessageDialog(null, "Valor total: " + valorTotal);
    }
}
