/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excluilivro;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Main {

    private static List<Livro> listaLivros = new ArrayList<Livro>();
    
    public static void main(String[] args) {
        criaLivros();
        String titulo = JOptionPane.showInputDialog("Informe o título do livro buscado");
        boolean excluido = excluiLivro(titulo);
        if(!excluido)
            JOptionPane.showMessageDialog(null, "Livro não encontrado!");
    }
    
    public static boolean excluiLivro(String tituloBusca) {
        boolean encontrado = false;
        for(Livro livro : listaLivros) {
            if(livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
                encontrado = true;
                listaLivros.remove(livro);
                break;
            }
        }
        
        return encontrado;
    }
    
    public static void criaLivros() {
        listaLivros.add(new Livro("Harry Potter", "J. K. Rolling", "Editora X", 580));
        listaLivros.add(new Livro("Meu primeiro livro", "José da Silva", "Editora Y", 348));
        listaLivros.add(new Livro("Mais um livro", "Maria Pereira", "Editora X", 320));
        listaLivros.add(new Livro("Último livro", "Miguel dos Santos", "Editora W", 193));
    }
}
