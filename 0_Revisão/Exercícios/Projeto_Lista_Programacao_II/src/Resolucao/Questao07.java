package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao07 {

    public void executar() {
        int n, termo = 1, aux = 0, outroTermo = 0;
        String s = "Termos: " + 1 + ", ";
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digíte o números de termos da sequência:"));

        for (int i = 0; i < (n - 1); i++) {
            aux = outroTermo;
            outroTermo = termo;
            termo = aux + outroTermo;
            s += termo + ", ";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
