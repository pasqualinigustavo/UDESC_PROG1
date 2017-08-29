package OperacoesMatriz;

import javax.swing.JOptionPane;

public class OperacoesMatriz {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da matriz"));
        int[][] matriz = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da posição [" + i + "][" + j + "]"));
            }
        }
        
        int somaAbaixo = 0;
        int somaAcima = 0;
        int produto = 1;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j)
                    produto *= matriz[i][j];
                if(i > j)
                    somaAbaixo += matriz[i][j];
                if(i < j)
                    somaAcima += matriz[i][j];
            }
        }
        
        JOptionPane.showMessageDialog(null, "Soma acima da diagonal principal: " + somaAcima
                                            + "\nSoma abaixo da diagonal principal: " + somaAbaixo
                                            + "\nProduto da diagonal principal: " + produto);
    }
    
}
