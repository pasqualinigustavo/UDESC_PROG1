package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao05 {
    public void executar() {
        int matriz[][] = new int[3][3], opcao, ponteiro, valor;
        String s = "";
        
        for(int i = 0; i < matriz.length; i++){
            s += "| ";
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i;
                s += matriz[i][j] + "   ";
            }
            s += " |\n";
        }
        
        opcao = Integer.parseInt(JOptionPane.showInputDialog(s + "Digíte 1 para multiplicar uma linha\n"
                + "Digíte 2 para multiplicar uma coluna !!"));
        
        if(opcao == 1){
            ponteiro = Integer.parseInt(JOptionPane.showInputDialog("Qual linha quer operar?"))-1;
        }else{
            ponteiro = Integer.parseInt(JOptionPane.showInputDialog("Qual coluna quer operar?"))-1;
        }
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digíte o valor que deve multiplicar !!"));
        
        if(opcao == 1){
            for(int i = 0; i < matriz.length; i++){
                matriz[ponteiro][i] = valor * matriz[ponteiro][i];
            }
        }else{
            for(int i = 0; i < matriz.length; i++){
                matriz[i][ponteiro] = valor * matriz[i][ponteiro];
            }
        }
        
        s = "";
        for(int i = 0; i < matriz.length; i++){
            s += "| ";
            for(int j = 0; j < matriz[i].length; j++){
                s += matriz[i][j] + "   ";
            }
            s += " |\n";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
