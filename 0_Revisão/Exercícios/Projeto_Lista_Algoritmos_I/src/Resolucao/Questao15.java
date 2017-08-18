package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao15 {
    public void executar(){
        double qtdMetal, qtdCobre, qtdZinco;
        
        qtdMetal = Double.parseDouble(JOptionPane.showInputDialog("Digíte a quantidade de metal: ").replaceAll(",", "."));
        
        qtdCobre = 0.7 * qtdMetal;
        qtdZinco = 0.3 * qtdMetal;
        
        JOptionPane.showMessageDialog(null, "Quantidades:"
                + "\n   Metal: " + qtdMetal
                + "\n   Cobre: " + qtdCobre
                + "\n   Zinco: " + qtdZinco);
    }
}
