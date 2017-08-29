/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livros;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Aplicacao {
    private List<Editora> listaEditoras = new ArrayList<Editora>();
    private List<Genero> listaGeneros = new ArrayList<Genero>();
    private List<Livro> listaLivros = new ArrayList<Livro>();
    
    public void run() {
        criaEditoras();
        criaGeneros();
        
        String menu = "1 - Cadastrar livro\n" +
                      "2 - Excluir livro\n" +
                      "3 - Consultar livro\n" +
                      "0 - Sair";
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(opcao) {
                case 1:
                    cadastraLivro();
                    break;
                case 2:
                    excluiLivro();
                    break;
                case 3:
                    consultaLivro();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
            
        } while(opcao != 0);
    }
    
    private void cadastraLivro() {
        String titulo = JOptionPane.showInputDialog("Informe o título do livro");
        int pags = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de páginas"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de publicação"));
        
        String generos = "Informe o gênero do livro\n\n";
        int contador = 1;
        for(Genero g: listaGeneros) {
            generos += contador + " - " + g.getDescricao() + "\n";
            contador++;
        }
        int index = Integer.parseInt(JOptionPane.showInputDialog(generos));
        Genero genero = listaGeneros.get(index - 1);
        
        String editoras = "Informe a editora do livro\n\n";
        contador = 1;
        for(Editora e: listaEditoras) {
            editoras += contador + " - " + e.getNome() + " [" + e.getCidade() + "]\n";
            contador++;
        }
        index = Integer.parseInt(JOptionPane.showInputDialog(editoras));
        Editora editora = listaEditoras.get(index - 1);
        
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setPags(pags);
        livro.setAno(ano);
        livro.setGenero(genero);
        livro.setEditora(editora);
        //editora.getListaLivros().add(livro);
        editora.addLivro(livro);
        
        listaLivros.add(livro);
    }
    
    private void excluiLivro() {
        String titulo = JOptionPane.showInputDialog("Informe o título do livro a ser excluído");
        boolean deletou = false;
        
        for(Livro l: listaLivros) {
            if(l.getTitulo().equalsIgnoreCase(titulo)) {
                //l.getEditora().getListaLivros().remove(l);
                l.getEditora().removeLivro(l);
                listaLivros.remove(l);
                deletou = true;
                break;
            }
        }
        
        if(!deletou)
            JOptionPane.showMessageDialog(null, "Livro não encontrado!");
    }
    
    private void consultaLivro() {
        String titulo = JOptionPane.showInputDialog("Informe o título do livro a ser consultado");
        boolean encontrou = false;
        
        for(Livro l: listaLivros) {
            if(l.getTitulo().equalsIgnoreCase(titulo)) {
                String resultado = "Título: " + l.getTitulo() + "\n" +
                                   "Número de páginas: " + l.getPags() + "\n" +
                                   "Ano de publicação: " + l.getAno() + "\n" +
                                   "Editora: " + l.getEditora().getNome() + "\n" +
                                   "Gênero: " + l.getGenero().getDescricao();
                
                JOptionPane.showMessageDialog(null, resultado);
                encontrou = true;
                break;
            }
        }
        
        if(!encontrou)
            JOptionPane.showMessageDialog(null, "Livro não encontrado!");
    }
    
    private void criaEditoras() {
        Editora e1 = new Editora();
        e1.setNome("Springer");
        e1.setCidade("Berlin");
        
        Editora e2 = new Editora();
        e2.setNome("Novatec");
        e2.setCidade("Porto Alegre");
        
        Editora e3 = new Editora();
        e3.setNome("Saraiva");
        e3.setCidade("São Paulo");
        
        listaEditoras.add(e1);
        listaEditoras.add(e2);
        listaEditoras.add(e3);
    }
    
    private void criaGeneros() {
        Genero g1 = new Genero("Romance");
        Genero g2 = new Genero("Ficção");
        Genero g3 = new Genero("Ação");
        Genero g4 = new Genero("Ciência");
        Genero g5 = new Genero("Biografia");
        
        listaGeneros.add(g1);
        listaGeneros.add(g2);
        listaGeneros.add(g3);
        listaGeneros.add(g4);
        listaGeneros.add(g5);
    }
}
