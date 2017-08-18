package Resolucao;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao03 {
    public void executar(){
        int primeiroVetor[] = new int[5], segundoVetor[] = new int[5];
        boolean saoIguais;
        Random gerador = new Random();
        
        String s = "";
        for(int i = 0; i < primeiroVetor.length; i++){
            primeiroVetor[i] = gerador.nextInt(10);
            s += primeiroVetor[i] + ", ";
        }
        
        s += "\n";
        for(int i = 0; i < segundoVetor.length; i++){
            //segundoVetor[i] = primeiroVetor[i];
            segundoVetor[i] = gerador.nextInt(10);
            s += segundoVetor[i] + ", ";
        }
        
        JOptionPane.showMessageDialog(null, s);
        
        saoIguais = testarVetores(primeiroVetor, segundoVetor);
        
        if(saoIguais){
            JOptionPane.showMessageDialog(null, "Os vetores são iguais !!");
        }else{
            JOptionPane.showMessageDialog(null, "Os vetores são diferentes !!");
        }
    }
    
    public boolean testarVetores(int[] vetor1, int[] vetor2){
        int tamanhoMenorVetor;
        
        if(vetor1.length != vetor2.length){
            return false;
        }
        
        for(int i = 0; i < vetor1.length; i++){
            if(vetor1[i] != vetor2[i]){
                return false;
            }
        }
        
        return true;
    }
}
