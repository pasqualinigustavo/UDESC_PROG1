/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excluilivro;

/**
 *
 * @author marcelo
 */
public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int numPags;
    private int pagAtual;
    
    public Livro() {
        this.pagAtual = 0;
    }
    
    public Livro(String titulo, String autor, String editora,
                 int numPags) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numPags = numPags;
        this.pagAtual = 0;
    }
    
    public void virarPagina() {
        this.pagAtual++;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
}