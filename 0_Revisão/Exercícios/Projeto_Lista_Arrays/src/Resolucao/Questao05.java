package Resolucao;

import Modelos.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao05 {
    public void executar(){
        ArrayList<Aluno> listaAluno;
        int numeroAlunos;
        String s;
        
        numeroAlunos = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digíte quantos alunos há na sala !!"));
        
        listaAluno = new ArrayList<>(numeroAlunos);
        
        for(int i = 0; i < numeroAlunos; i++){
            Aluno a =new Aluno(JOptionPane.showInputDialog("Digíte o nome do aluno"));
            
            double[] notas = new double[3];
            for(int j = 0; j < notas.length; j++){
                notas[j] = Double.parseDouble(
                        JOptionPane.showInputDialog("Digíte a " + (j+1) + "ª nota: ")
                                .replaceAll(",", "."));
            }
            
            a.setNotas(notas);
            
            a.calcularMedia();
            
            listaAluno.add(a);
        }
        
        s = "";
        for(Aluno a: listaAluno){
            s += a.toString() + "\n\n";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
