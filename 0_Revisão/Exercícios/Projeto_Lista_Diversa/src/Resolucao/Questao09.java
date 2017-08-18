package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao09 {
    public void executar(){
        String s;
        char c;
        int posicao;
        
        s = JOptionPane.showInputDialog("Digíte a palavra !!");
        c = JOptionPane.showInputDialog("Digíte a letra").charAt(0);
        
        posicao = acharCaracter(s, c);
        
        JOptionPane.showMessageDialog(null, "String : " + s + "\nCaracter: " + c + "\nPosição: " + posicao);
    }
    
    public int acharCaracter(String s, char c){
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(c == s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
