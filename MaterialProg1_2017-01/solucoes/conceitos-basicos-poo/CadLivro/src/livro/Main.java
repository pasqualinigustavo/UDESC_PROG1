/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String titulo = JOptionPane.showInputDialog("Informe o título do livro");
        String autor = JOptionPane.showInputDialog("Informe o nome do autor");
        String editora = JOptionPane.showInputDialog("Informe a editora");
        int numPags = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de páginas"));
        
        Livro livro = new Livro(titulo, autor, editora, numPags);
        
        //livro.setTitulo(titulo);
        //livro.setAutor(autor);
        //livro.setEditora(editora);
        //livro.setNumPags(numPags);
        
        livro.virarPagina();
        livro.virarPagina();
        livro.virarPagina();
        
        String apresentacao = "Título: " + livro.getTitulo() + "\n" +
                              "Autor: " + livro.getAutor() + "\n" +
                              "Editora: " + livro.getEditora() + "\n" +
                              "Número de páginas: " + livro.getNumPags() + "\n" +
                              "Página atual: " + livro.getPagAtual();
        
        JOptionPane.showMessageDialog(null, apresentacao);
    }
    
}
