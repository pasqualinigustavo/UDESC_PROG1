package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao11 {
    public void executar() {
        String original, editada;
        int posicao;
        char c;

        original = JOptionPane.showInputDialog("Digíte a string");
        posicao = Integer.parseInt(JOptionPane.showInputDialog(original + "\nDigíte a posição para acrescentar"));
        c = JOptionPane.showInputDialog("Digíte a letra a ser inserida").charAt(0);

        editada = original.substring(0, posicao) + c + original.substring(posicao, original.length());

        JOptionPane.showMessageDialog(null, "String original: " + original + "\nString editada: " + editada);
    }
}
