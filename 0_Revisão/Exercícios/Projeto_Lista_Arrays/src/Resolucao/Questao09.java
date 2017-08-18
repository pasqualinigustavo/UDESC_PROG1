package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao09 {

    public void executar() {
        double m1[][] = new double[3][2];
        double m2[][] = new double[2][5];
        
        String s = "";
        
        double[][] multiplicacao = new double[m1.length][m2[0].length];
        int numeroLinhas = multiplicacao.length;
        int numeroColunas = multiplicacao[0].length;
        int aux = m1[0].length;
        
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                m1[i][j] = i+j;
            }
        }
        
        for(int i = 0; i < m2.length; i++){
            for(int j = 0; j < m2[i].length; j++){
                m2[i][j] = i+j;
            }
        }
        
        for (int i = 0; i < numeroLinhas; i++) {
            for (int j = 0; j < numeroColunas; j++) {
                for (int k = 0; k < aux; k++) {
                    multiplicacao[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        
        for(int i = 0; i < m1.length; i++){
            s += "|   ";
            for(int j = 0; j < m1[i].length; j++){
                s += m1[i][j] + "   ";
            }
            s += "|\n";
        }
        
        s += "\n\n";
        
        for(int i = 0; i < m2.length; i++){
            s += "|   ";
            for(int j = 0; j < m2[i].length; j++){
                s += m2[i][j] + "   ";
            }
            s += "|\n";
        }
        
        s += "\n\n";
        
        for(int i = 0; i < multiplicacao.length; i++){
            s += "|   ";
            for(int j = 0; j < multiplicacao[i].length; j++){
                s += multiplicacao[i][j] + "   ";
            }
            s += "|\n";
        }
        
        
        JOptionPane.showMessageDialog(null, s);
    }
}
