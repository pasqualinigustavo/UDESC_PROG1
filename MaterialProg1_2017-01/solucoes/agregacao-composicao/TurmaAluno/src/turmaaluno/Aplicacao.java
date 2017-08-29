/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turmaaluno;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Aplicacao {
    
    public void run() {
        List<Turma> listaTurmas = criaRegistros();
        String nomeAluno = "Maria";
        
        String resultado = "Pela forma 1\n";
        for(Turma t: turmasDoAlunoForma1(listaTurmas, nomeAluno)) {
            resultado += "Turma " + t.getAno() + "/" + t.getSemestre() + "\n";
        }
        
        resultado += "\n\nPela forma 2\n";
        for(Turma t: turmasDoAlunoForma2(listaTurmas, nomeAluno)) {
            resultado += "Turma " + t.getAno() + "/" + t.getSemestre() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    private List<Turma> turmasDoAlunoForma1(List<Turma> turmas, String nomeAluno) {
        List<Turma> result = new ArrayList<Turma>();
        
        for(Turma t: turmas) {
            for(Aluno a: t.getAlunos()) {
                if(a.getNome().equals(nomeAluno)) {
                    result.add(t);
                    break;
                }
            }
        }
        
        return result;
    }
    
    private List<Turma> turmasDoAlunoForma2(List<Turma> turmas, String nomeAluno) {
        List<Turma> result = new ArrayList<Turma>();
        
        for(Turma t: turmas) {
            if(t.temAluno(nomeAluno))
                result.add(t);
        }
        
        return result;
    }
    
    private List<Turma> criaRegistros() {
        List<Turma> turmas = new ArrayList<Turma>();
        
        Turma t1 = new Turma(2016, 2);
        t1.addAluno(new Aluno("111111", "João"));
        t1.addAluno(new Aluno("222222", "Maria"));
        t1.addAluno(new Aluno("333333", "Ana"));
        
        Turma t2 = new Turma(2017, 1);
        t2.addAluno(new Aluno("333333", "Ana"));
        t2.addAluno(new Aluno("444444", "Pedro"));
        t2.addAluno(new Aluno("555555", "José"));
        
        Turma t3 = new Turma(2017, 2);
        t3.addAluno(new Aluno("222222", "Maria"));
        t3.addAluno(new Aluno("555555", "José"));
        t3.addAluno(new Aluno("666666", "Luzia"));
        
        turmas.add(t1);
        turmas.add(t2);
        turmas.add(t3);
        
        return turmas;
    }
}
