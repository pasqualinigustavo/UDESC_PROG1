
package Farmacia;

public class Medicamento {
    private String descricao;
    private double dosagem;
    private String laboratorio;
    private double preco;

    @Override
    public String toString() {
        return "Medicamento{" + "descricao=" + descricao + ", dosagem=" + dosagem + ", laboratorio=" + laboratorio + ", preco=" + preco + '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
