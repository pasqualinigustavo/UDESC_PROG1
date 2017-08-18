package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao11 {
    public void executar(){
        double consumoCarro, precoCombustivel, distanciaTotal, consumoKM, valorKM, valorTotal;
        
        consumoCarro = Double.parseDouble(
                JOptionPane.showInputDialog("Digíte quantos litros foram gastos !!")
                        .replaceAll(",", "."));
        precoCombustivel = Double.parseDouble(
                JOptionPane.showInputDialog("Digíte o preço de um litro de combustível !!")
                        .replaceAll(",", "."));
        distanciaTotal = Double.parseDouble(
                JOptionPane.showInputDialog("Digíte quantos quilometros foram percorridos !!")
                        .replaceAll(",", "."));
        
        consumoKM = consumoCarro / distanciaTotal;
        valorKM = precoCombustivel * consumoKM;
        valorTotal = consumoCarro * precoCombustivel;
        
        JOptionPane.showMessageDialog(null, 
                    "Litros consumidos: " + consumoCarro
                    + "\nPreço do combustível: " + precoCombustivel
                    + "\nDistância Total: " + distanciaTotal
                    + "\nConsumo por KM: " + consumoKM
                    + "\nValor por KM: R$ " + valorKM
                    + "\nValor Total: R$ " + valorTotal
        );
    }
}
