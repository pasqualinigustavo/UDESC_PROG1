package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao03 {
    
    public void executar(){
        double razao, primeiroTermo, ultimoTermo, soma, auxiliar;
        int contadorTermos = 1;
        
        razao = Double.parseDouble(JOptionPane.showInputDialog("Digíte a razão:").replaceAll(",", "."));
        
        primeiroTermo = Double.parseDouble(JOptionPane.showInputDialog("Digíte o primeiro termo:").replaceAll(",", "."));
        
        ultimoTermo = Double.parseDouble(JOptionPane.showInputDialog("Digíte o ultimo termo:").replaceAll(",", "."));
        
        auxiliar = primeiroTermo;
        while(auxiliar < ultimoTermo){
            contadorTermos++;
            auxiliar += razao;
        }
        
        soma = ( (primeiroTermo + ultimoTermo) * contadorTermos )/ 2;
        
        JOptionPane.showMessageDialog(null, "Soma dos termos: " + soma);
    }
}
