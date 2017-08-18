package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao03 {
    public void executar(){
        int numero, contador = 0;
        String s = "";
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digíte o número !!"));
        
        for(int i = 0; i <= (numero+1)/2; i++){
            for(int j = 0; j < numero; j++){
                if(j < contador || j >= (numero-contador)){
                    s += "   ";
                }else{
                    s += (j+1) + " ";
                }
            }
            s += "\n";
            contador++;
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
