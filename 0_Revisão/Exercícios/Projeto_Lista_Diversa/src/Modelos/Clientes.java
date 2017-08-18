package Modelos;

/**
 *
 * @author Tiago Funk
 */
public class Clientes {
    
    private String nome;
    private double valorCompras;
    private double bonus;

    public Clientes() {
    }

    public Clientes(String nome, double valorCompras) {
        this.nome = nome;
        this.valorCompras = valorCompras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCompras() {
        return valorCompras;
    }

    public void setValorCompras(double valorCompras) {
        this.valorCompras = valorCompras;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + 
                ", Valor de Compras=" + Double.parseDouble(String.format("%.2f", valorCompras).replaceAll(",", ".")) + 
                ", Bonus=" + Double.parseDouble(String.format("%.2f", bonus).replaceAll(",", ".")) + '\n';
    }
    
    
}
