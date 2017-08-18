package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao13 {
    
    public void executar(){
        double precoOriginal, imposto, lucroDistribuidor, precoFinal;
        
        precoOriginal = Double.parseDouble(JOptionPane.showInputDialog("Digíte o valor do carro !!").replaceAll(",", "."));
        
        imposto = 0.45 * precoOriginal;
        
        lucroDistribuidor = 0.12 * precoOriginal;
        
        precoFinal = precoOriginal + imposto + lucroDistribuidor;
        
        JOptionPane.showMessageDialog(null, "Preço original do vecíulo: " + precoOriginal 
                + "\nPreço final: " + precoFinal
                + "\nImpostos: " + imposto
                + "\nLucro do distribuidor: " + lucroDistribuidor);
    }
}
