/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artigos;

import java.util.List;

/**
 *
 * @author 9584013
 */
public class Instituicao {
    private String nome;
    private String cidade;
    private List<Revista> revistas;

    public void addRevista(Revista revista) {
        this.revistas.add(revista);
    }
    
    public List<Revista> getRevistas() {
        return revistas;
    }

    public void setRevistas(List<Revista> revistas) {
        this.revistas = revistas;
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
