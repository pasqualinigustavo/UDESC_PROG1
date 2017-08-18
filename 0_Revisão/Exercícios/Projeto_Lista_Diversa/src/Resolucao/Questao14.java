package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao14 {
    public void executar(){
        int idadePrimeiroHomem, idadeSegundoHomen, idadePrimeiraMulher, idadeSegundaMulher;
        int primeiraSoma, segundaSoma;
        
        idadePrimeiroHomem = Integer.parseInt(JOptionPane.showInputDialog("Digíte a idade do primeiro homen !!"));
        idadeSegundoHomen = Integer.parseInt(JOptionPane.showInputDialog("Digíte a idade do segundo homen !!"));
        idadePrimeiraMulher = Integer.parseInt(JOptionPane.showInputDialog("Digíte a idade do primeira mulher !!"));
        idadeSegundaMulher = Integer.parseInt(JOptionPane.showInputDialog("Digíte a idade do segunda mulher !!"));
        
        if(idadePrimeiroHomem < idadeSegundoHomen){
            if(idadePrimeiraMulher < idadeSegundaMulher){
                primeiraSoma = idadeSegundoHomen + idadePrimeiraMulher;
                segundaSoma = idadePrimeiroHomem + idadeSegundaMulher;
            }else{
                primeiraSoma = idadeSegundoHomen + idadeSegundaMulher;
                segundaSoma = idadePrimeiroHomem + idadePrimeiraMulher;
            }
        }else{
            if(idadePrimeiraMulher < idadeSegundaMulher){
                primeiraSoma = idadePrimeiroHomem + idadePrimeiraMulher;
                segundaSoma = idadeSegundoHomen + idadeSegundaMulher;
            }else{
                primeiraSoma = idadePrimeiroHomem + idadeSegundaMulher;
                segundaSoma = idadeSegundoHomen + idadePrimeiraMulher;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Idade primeiro homen: " + idadePrimeiroHomem 
                + "\nIdade segundo homen: " + idadeSegundoHomen 
                + "\nIdade primeira mulher: " + idadePrimeiraMulher 
                + "\nIdade segunda mulher: " + idadeSegundaMulher 
                + "\nPrimeira soma: " + primeiraSoma 
                + "\nSegunda soma: " + segundaSoma);
    }
}
