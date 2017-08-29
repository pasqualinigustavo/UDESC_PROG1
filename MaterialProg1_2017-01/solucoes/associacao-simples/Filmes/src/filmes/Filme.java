/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmes;

/**
 *
 * @author marcelo
 */
public class Filme {
    private String titulo;
    private String sinopse;
    private int duracao;
    private Estante estante;

    public Filme() {}

    public Filme(String titulo, String sinopse, int duracao) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    public Filme(String titulo, String sinopse, int duracao, Estante estante) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.estante = estante;
    }

    public Estante getEstante() {
        return estante;
    }

    public void setEstante(Estante estante) {
        this.estante = estante;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
