/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listafilmes;

/**
 *
 * @author marcelo
 */
public class Filme {
    private String titulo;
    private String sinopse;
    private int duracao;

    public Filme() {}

    public Filme(String titulo, String sinopse, int duracao) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme{" + "titulo=" + titulo + ", duracao=" + duracao + '}';
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
