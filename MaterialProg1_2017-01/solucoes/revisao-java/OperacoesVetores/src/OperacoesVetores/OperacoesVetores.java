package OperacoesVetores;

import javax.swing.JOptionPane;

public class OperacoesVetores {

    static final int TAMANHO = 10;
    
    public static void main(String[] args) {
        int[] vetor1 = new int[TAMANHO];
        int[] vetor2 = new int[TAMANHO];
        int[] vetorSoma = new int[TAMANHO];
        int[] vetorSubtracao = new int[TAMANHO];
        int[] vetorMultiplicacao = new int[TAMANHO];
        double[] vetorDivisao = new double[TAMANHO];
        
        for(int i = 0; i < TAMANHO; i++)
            vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe valor " + (i + 1) + " do primeiro vetor"));
        for(int i = 0; i < TAMANHO; i++)
            vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe valor " + (i + 1) + " do segundo vetor"));
        
        for(int i = 0; i < TAMANHO; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
            vetorSubtracao[i] = vetor1[i] - vetor2[i];
            vetorMultiplicacao[i] = vetor1[i] * vetor2[i];
            vetorDivisao[i] = (double) vetor1[i] / (double) vetor2[i];
        }
        
        String vSoma = "VETOR SOMA\n";
        String vSubtracao = "VETOR SUBTRAÇÃO\n";
        String vMultiplicacao = "VETOR MULTIPLICAÇÃO\n";
        String vDivisao = "VETOR DIVISÃO\n";
        
        for(int i = 0; i < TAMANHO; i++) {
            vSoma += vetorSoma[i] + "\n";
            vSubtracao += vetorSubtracao[i] + "\n";
            vMultiplicacao += vetorMultiplicacao[i] + "\n";
            vDivisao += vetorDivisao[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, vSoma);
        JOptionPane.showMessageDialog(null, vSubtracao);
        JOptionPane.showMessageDialog(null, vMultiplicacao);
        JOptionPane.showMessageDialog(null, vDivisao);
    }
    
}
