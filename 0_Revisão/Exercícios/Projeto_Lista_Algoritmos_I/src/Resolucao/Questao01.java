package Resolucao;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao01 {
    
    public void executar(){
        Scanner ler = new Scanner(System.in);
        
        int numero, sucessor;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digíte o número: "));
        
        sucessor = numero + 1;
        
        JOptionPane.showMessageDialog(null, "Número digítado: " + numero + ", Sucessor: " + sucessor);
        
        ler.close();
    }
}
