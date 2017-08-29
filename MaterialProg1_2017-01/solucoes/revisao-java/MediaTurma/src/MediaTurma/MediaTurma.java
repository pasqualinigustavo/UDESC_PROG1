package MediaTurma;

import javax.swing.JOptionPane;

public class MediaTurma {

    public static void main(String[] args) {
        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        
        int alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos"));
        
        for(int i = 0; i < alunos; i++) {
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota do " + (i+1) + "º aluno"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota do " + (i+1) + "º aluno"));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota do " + (i+1) + "º aluno"));
            double media = (nota1 + nota2 + nota3) / 3;
            
            if(media >= 7)
                aprovados++;
            else if(media >= 3 && media < 7)
                exame++;
            else
                reprovados++;
        }
        
        String resultado = "Alunos aprovados: " + aprovados +
                           "\nAlunos em exame: " + exame +
                           "\nAlunos reprovados: " + reprovados;
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
