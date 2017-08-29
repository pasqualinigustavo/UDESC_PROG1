/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livroscompleto;

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
        String opcoes = "1 - Cadastrar livro\n" +
                        "2 - Alterar livro\n" +
                        "3 - Excluir livro\n" +
                        "4 - Consultar livro\n" +
                        "5 - Listar todos os livros\n" +
                        "0 - Sair\n\n" +
                        "Informe uma opção";
        
        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(opcoes));
            String titulo = "";
            switch(opcao) {
                case 1:
                    cadastraLivro();
                    break;
                case 2:
                    titulo = JOptionPane.showInputDialog("Informe o título do livro a ser alterado");
                    if(!alteraLivro(titulo))
                        JOptionPane.showMessageDialog(null, "Livro não encontrado!");
                    break;
                case 3:
                    titulo = JOptionPane.showInputDialog("Informe o título do livro a ser excluído");
                    if(!excluiLivro(titulo))
                        JOptionPane.showMessageDialog(null, "Livro não encontrado!");
                    break;
                case 4:
                    titulo = JOptionPane.showInputDialog("Informe o título do livro a ser consultado");
                    JOptionPane.showMessageDialog(null, buscaLivro(titulo));
                    break;
                case 5:
                    mostraLivros();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            
        } while (opcao != 0);
        
        
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
    
    public static boolean alteraLivro(String tituloBusca) {
        boolean encontrado = false;
        for(Livro livro : listaLivros) {
            if(livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
                encontrado = true;
                livro.setTitulo(JOptionPane.showInputDialog("Informe o novo titulo"));
                livro.setEditora(JOptionPane.showInputDialog("Informe a nova editora"));
                livro.setAutor(JOptionPane.showInputDialog("Informe o novo autor"));
                livro.setNumPags(Integer.parseInt(JOptionPane.showInputDialog("Informe o novo número de páginas")));
                break;
            }
        }
        
        return encontrado;
    }
    
    public static String buscaLivro(String tituloBusca) {
        String resultado = "Livro não encontrado!";
        for(Livro livro : listaLivros) {
            if(livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
                resultado = "Título: " + livro.getTitulo() + "\n" +
                            "Autor: " + livro.getAutor() + "\n" +
                            "Editora: " + livro.getEditora() + "\n" +
                            "Número de páginas: " + livro.getNumPags() + "\n" +
                            "Página atual: " + livro.getPagAtual();
                break;
            }
        }
        return resultado;
    }
    
    public static void cadastraLivro() {
        String titulo = JOptionPane.showInputDialog("Informe o título do livro");
        String autor = JOptionPane.showInputDialog("Informe o nome do autor");
        String editora = JOptionPane.showInputDialog("Informe a editora");
        int numPags = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de páginas"));
        
        Livro livro = new Livro(titulo, autor, editora, numPags);
        listaLivros.add(livro);
    }
    
    public static void mostraLivros() {
        String resultado = "";
        for(Livro livro : listaLivros) {
            resultado += livro.getTitulo() + ": " + livro.getNumPags() + " páginas.\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
