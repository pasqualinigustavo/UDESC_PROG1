
package Funcionario;

/**
 *
 * @author 9584013
 */
public class Funcionario {
    private String cpf;
    private String nome;
    private int idade;
    private double salario;
    private int tempoServico;
    private int dependentes;

    public Funcionario() {}
    
    public Funcionario(String cpf, String nome, int idade, double salario, int tempoServico, int dependentes) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.tempoServico = tempoServico;
        this.dependentes = dependentes;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", tempoServico=" + tempoServico + ", dependentes=" + dependentes + '}';
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }
}
