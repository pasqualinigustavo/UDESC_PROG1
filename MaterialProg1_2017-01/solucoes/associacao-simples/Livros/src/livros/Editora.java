/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class Editora {
    private String nome;
    private String cidade;
    private List<Livro> listaLivros;
    
    public Editora() {
        listaLivros = new ArrayList<Livro>();
    }
    
    public void addLivro(Livro l) {
        this.listaLivros.add(l);
    }
    
    public void removeLivro(Livro l) {
        this.listaLivros.remove(l);
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(List<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
