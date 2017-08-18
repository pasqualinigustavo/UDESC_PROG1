package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao02 {
    public void executar(){
        int numeros[] = new int[20], tamanho = 0, auxiliar, numeroBusca, qtd = 0;
        
        do{
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Digíte o próximo número\nPara finalizar digite -1."));
            
            if(auxiliar != -1){
                numeros[tamanho] = auxiliar;
                tamanho++;
            }
            
            if(tamanho == 20){
                break;
            }
        }while(auxiliar != -1);
        
        numeroBusca = Integer.parseInt(JOptionPane.showInputDialog("Digíte o número que vai ser procurado !!"));
        
        for(int i = tamanho-1; i >= 0; i--){
            if(numeros[i] == numeroBusca){
                qtd++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "O número " + numeroBusca + " aparece " + qtd + " vezes.");

    }
}
