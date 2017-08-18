package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao17 {
    public void executar(){
        int tamanho = 0, auxiliar, maior = 0, menor = 0;
        
        do{
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Digíte o próximo valor !!"));
            
            if(auxiliar > 0){
                if(tamanho == 0){
                    maior = auxiliar;
                }else{
                    if(maior < auxiliar){
                        maior = auxiliar;
                    }
                }
                
                if(tamanho == 0){
                    menor = auxiliar;
                }else{
                    if(menor > auxiliar){
                        menor = auxiliar;
                    }
                }
                
                tamanho++;
            }else if(auxiliar < 0){
                JOptionPane.showMessageDialog(null, "Valor inválido !!");
            }
        }while(auxiliar != 0);
        
        JOptionPane.showMessageDialog(null, "Quantidade números digitados: " + tamanho
                + "\nMaior número: " + maior
                + "\nMenor número: " + menor
        );
    }
}
