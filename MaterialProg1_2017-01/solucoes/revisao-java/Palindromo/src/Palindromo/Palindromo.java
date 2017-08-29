package Palindromo;

import javax.swing.JOptionPane;

public class Palindromo {

    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Informe uma palavra");
        
        if(isPalindromo(palavra))
            JOptionPane.showMessageDialog(null, palavra + " é um palíndromo!");
        else
            JOptionPane.showMessageDialog(null, palavra + " não é um palíndromo!");
    }
    
    public static boolean isPalindromo(String palavra) {
        
        String palavraInvertida = "";
        
        for(int i = palavra.length() - 1; i >= 0; i-- ) {
            palavraInvertida += palavra.charAt(i);
        }
        
        return (palavra.equalsIgnoreCase(palavraInvertida));
    }
    
}
