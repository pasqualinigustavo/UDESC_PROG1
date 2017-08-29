/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrocapitulos;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Aplicacao {
    
    public void run() {
        Livro livro = new Livro();
        livro.addCapitulo(1, "A bola é azul");
        livro.addCapitulo(2, "O lápis é vermelho");
        livro.addCapitulo(3, "A caneta também é azul");
        livro.addCapitulo(4, "O chão é cinza");
        livro.addCapitulo(5, "O computador é preto");
        
        mostraCapitulos(livro, "azul");
        
    }
    
    private void mostraCapitulos(Livro livro, String palavra) {
        String result = "";
        for(Capitulo c : livro.getCaps()) {
            if(c.getTitulo().contains(palavra)) {
                result += c.getNumero() + ": " + c.getTitulo() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
