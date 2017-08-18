package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao04 {
    public void executar(){
        String primeiroNome, segundoNome;
        int tamanhoMenorNome, menorNome;
        
        primeiroNome = JOptionPane.showInputDialog("Digíte o primeiro nome !!");
        segundoNome = JOptionPane.showInputDialog("Digíte o segundo nome !!");
        
        if(primeiroNome.length() <= segundoNome.length()){
            tamanhoMenorNome = primeiroNome.length();
            //Para garantir que o menor nome venha antes em caso de ambos iguais.
            menorNome = 1;
        }else{
            tamanhoMenorNome = segundoNome.length();
            //Para garantir que o menor nome venha antes em caso de ambos iguais.
            menorNome = 2;
        }
        
        for(int i = 0; i < tamanhoMenorNome; i++){
            if(primeiroNome.charAt(i) == segundoNome.charAt(i)){
                continue;
            }
            
            if(primeiroNome.charAt(i) < segundoNome.charAt(i)){
                menorNome = 1;
                break;
            }else{
                menorNome = 2;
                break;
            }
        }
        
        if(menorNome == 1){
            JOptionPane.showMessageDialog(null, primeiroNome + "\n" + segundoNome);
        }else{
            JOptionPane.showMessageDialog(null, segundoNome + "\n" + primeiroNome);
        }
    }
}
