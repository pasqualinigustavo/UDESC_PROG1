package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao05 {
    public void executar(){
        int tamanho;
        double soma = 0, media;
        
        tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digíte quantos alunos existem na turma !!"));
        
        for(int i = 0; i < tamanho; i++){
            soma += Integer.parseInt(JOptionPane.showInputDialog("Digíte o " + (i+1) + "ª idade: "));
        }
        
        media = soma/tamanho;
        media = Double.parseDouble(String.format("%.2f", media).replaceAll(",", "."));
        
        JOptionPane.showMessageDialog(null, "Média: " + media);
    }
}
