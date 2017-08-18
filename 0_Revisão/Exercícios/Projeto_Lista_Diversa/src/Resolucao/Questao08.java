package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao08 {

    public void executar() {
        int matriz[][] = new int[3][3], primeiraLinha, segundaLinha, opcao;
        String s = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i+1;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            s += "|   ";
            for (int j = 0; j < matriz[i].length; j++) {
                s += matriz[i][j] + "   ";
            }
            s += "   |\n";
        }

        primeiraLinha = Integer.parseInt(JOptionPane.showInputDialog(s + "Digíte a primeira linha !!"));
        segundaLinha = Integer.parseInt(JOptionPane.showInputDialog(s + "Digíte a segunda linha !!"));
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Digíte:\n1-Para somar\n2-Para multiplicar"));

        for (int j = 0; j < matriz[primeiraLinha].length; j++) {
            if(opcao == 1){
                matriz[segundaLinha][j] = matriz[primeiraLinha][j] + matriz[segundaLinha][j];
            }else if(opcao == 2){
                matriz[segundaLinha][j] = matriz[primeiraLinha][j] * matriz[segundaLinha][j];
            }
        }

        s = "";
        for (int i = 0; i < matriz.length; i++) {
            s += "|   ";
            for (int j = 0; j < matriz[i].length; j++) {
                s += matriz[i][j] + "   ";
            }
            s += "   |\n";
        }

        JOptionPane.showMessageDialog(null, s);
    }
}
