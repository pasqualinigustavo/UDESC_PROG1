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
public class Treinador {
    private String nome;
    private int numRegistro;
    private double salario;
    private Equipe equipe;

    @Override
    public String toString() {
        return "Treinador: " + getNome() + "\n" +
                "Registro: " + getNumRegistro() + "\n" +
                "Salário: " + getSalario() + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
