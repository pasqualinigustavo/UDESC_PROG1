/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turmaaluno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class Turma {
    private int ano;
    private int semestre;
    private List<Aluno> alunos;

    public Turma(int ano, int semestre) {
        this.ano = ano;
        this.semestre = semestre;
        alunos = new ArrayList<Aluno>();
    }
    
    public void addAluno(Aluno a) {
        alunos.add(a);
    }

    public boolean temAluno(String nomeAluno) {
        for(Aluno a: alunos) {
            if(a.getNome().equals(nomeAluno))
                return true;
        }
        return false;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
