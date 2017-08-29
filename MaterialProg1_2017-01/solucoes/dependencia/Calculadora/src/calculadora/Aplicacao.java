/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Aplicacao {
    
    public void run() {
        String expressao = JOptionPane.showInputDialog("Informe a expressão matemática na forma 'A <op> B'");
        
        for(int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            if(c == '+' || c == '-' || c == '*' || c == '/') {
                calcula(expressao, c);
                break;
            }
        }
    }
    
    public void calcula(String expressao, char op) {
        int index = expressao.indexOf(op);
        String num1 = expressao.substring(0, index);
        String num2 = expressao.substring(index + 1);
        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);
        
        Operacoes operacoes = new Operacoes();
        double resultado = 0;
        switch(op) {
            case '+':
                resultado = operacoes.adicao(a, b);
                break;
            case '-':
                resultado = operacoes.subtracao(a, b);
                break;
            case '*':
                resultado = operacoes.multiplicacao(a, b);
                break;
            case '/':
                resultado = operacoes.divisao(a, b);
                break;
        }
        
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }
}
