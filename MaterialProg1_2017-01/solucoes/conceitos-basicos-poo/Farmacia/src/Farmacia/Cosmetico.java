package Farmacia;

public class Cosmetico {
    private String descricao;
    private String marca;
    private int lote;
    private double preco;

    @Override
    public String toString() {
        return "Cosmetico{" + "descricao=" + descricao + ", marca=" + marca + ", lote=" + lote + ", preco=" + preco + '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
