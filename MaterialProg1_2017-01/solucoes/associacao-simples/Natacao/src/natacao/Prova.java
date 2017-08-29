/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natacao;

/**
 *
 * @author marcelo
 */
public class Prova {
    private String descricao;
    private int distancia;
    private Recorde recorde;

    public Recorde getRecorde() {
        return recorde;
    }

    public void setRecorde(Recorde recorde) {
        this.recorde = recorde;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}
