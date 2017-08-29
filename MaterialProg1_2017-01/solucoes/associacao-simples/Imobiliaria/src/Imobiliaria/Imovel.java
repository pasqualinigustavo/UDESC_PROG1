/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria;

/**
 *
 * @author 9584013
 */
public class Imovel {
    private int tipo;
    private double area;
    private Proprietario proprietario;
    private Cidade cidade;

    public Imovel() {}

    public Imovel(int tipo, double area) {
        this.tipo = tipo;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Imovel{" + "tipo=" + tipo + ", area=" + area + ", proprietario=" + proprietario.getNome() + ", cidade=" + cidade.getDescricao() + '}';
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
