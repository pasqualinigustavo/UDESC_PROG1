package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao10 {
    public void executar(){
        int numero = 17, soma = 0, contador = 0;
        boolean quadradoPerfeito = false;
        
        for(int i = 1; ; i += 2){
            soma += i;
            contador++;
            
            if(soma == numero){
                quadradoPerfeito = true;
                break;
            }
            
            if(soma > numero){
                break;
            }
        }
        
        if(quadradoPerfeito){
            JOptionPane.showMessageDialog(null, "Quadrado perfeito");
        }else{
            JOptionPane.showMessageDialog(null, "Não é um quadrado perfeito !!");
        }
    }
}
