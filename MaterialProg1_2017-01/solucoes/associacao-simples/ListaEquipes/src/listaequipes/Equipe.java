/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaequipes;

/**
 *
 * @author marcelo
 */
public class Equipe {
    private String nome;
    private String categoria;
    private Treinador treinador;

    @Override
    public String toString() {
        return "Equipe: " + getNome() + "\n" +
                "Categoria: " + getCategoria() + "\n" +
                getTreinador().toString();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }
}
