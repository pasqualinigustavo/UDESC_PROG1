package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao03 {
    public void executar(){
        double soma = 0, media, contador = 0;
        
        for(int i = 13; i <= 73; i++){
            if(i % 2 == 0){
                soma += i;
                contador++;
            }
        }
        
        media = soma / contador;
        
        JOptionPane.showMessageDialog(null, "Média dos números: " + media);
    }
}
