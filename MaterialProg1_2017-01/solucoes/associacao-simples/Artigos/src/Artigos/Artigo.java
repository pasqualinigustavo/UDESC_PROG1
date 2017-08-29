/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artigos;

/**
 *
 * @author 9584013
 */
public class Artigo {
    private String titulo;
    private String resumo;

    @Override
    public String toString() {
        return "Artigo{" + "titulo=" + titulo + ", resumo=" + resumo + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
