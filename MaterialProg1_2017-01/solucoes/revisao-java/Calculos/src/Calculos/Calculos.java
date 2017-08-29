package Calculos;

import javax.swing.JOptionPane;

public class Calculos {

    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));
        JOptionPane.showMessageDialog(null, "Fatorial.: " + fatorial(valor));
        JOptionPane.showMessageDialog(null, "Soma dos naturais menores.: " + somaNaturaisMenores(valor));
        imprimeImpares(valor);
    }
    
    public static void imprimeImpares(int valor) {
        String resultado = "";
        for(int i = valor; i < 50; i++) {
            if(i % 2 != 0)
                resultado += i + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public static int somaNaturaisMenores(int valor) {
        int resultado = 0;
        for(int i = 1; i <= valor; i++)
            resultado += i;
        return resultado;
    }
    
    public static int fatorial(int valor){
        int resultado = 1;
        for(int i = valor; i > 0; i--) {
            resultado = resultado * i;
        }
        return resultado;
    }
}
