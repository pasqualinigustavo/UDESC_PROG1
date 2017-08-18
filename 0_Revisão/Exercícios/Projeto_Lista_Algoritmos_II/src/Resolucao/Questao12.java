package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao12 {

    public void executar() {
        int numero;
        boolean numeroPrimo = true;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
    
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                numeroPrimo = false;
                break;
            }
        }

        if (numeroPrimo) {
            JOptionPane.showMessageDialog(null, "É um número primo !!");
        } else {
            JOptionPane.showMessageDialog(null, "Não é um número primo !!");
        }
    }
}
