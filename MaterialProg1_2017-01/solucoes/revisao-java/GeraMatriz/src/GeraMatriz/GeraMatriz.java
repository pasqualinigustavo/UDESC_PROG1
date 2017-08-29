package GeraMatriz;

import javax.swing.JOptionPane;

public class GeraMatriz {

    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho N"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho M"));
        
        int[][] matriz = new int[n][m];
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha " + i + " e coluna " + j));
            }
        }

        String mensagem = "Matriz NxM:\n\n";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mensagem += " " + matriz[i][j];
            }
            mensagem += "\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);

        int aux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                aux = aux + matriz[i][j];
            }
            vetor[i] = aux;
            aux = 0;
        }

        mensagem = "Vetor com as soma das linhas da matriz: ";
        for (int i = 0; i < n; i++) {
            mensagem += vetor[i] + " ";
        }
        JOptionPane.showMessageDialog(null, mensagem);
        
        int[] multiplicacao = new int[n];
        for(int i = 0; i < n; i++)
            multiplicacao[i] = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                multiplicacao[i] += matriz[i][j] * vetor[j];
            }
        }
        
        mensagem = "Matriz multiplicada pelo vetor:\n\n";
        for(int i = 0; i < n; i++)
            mensagem += multiplicacao[i] + " ";
        
        JOptionPane.showMessageDialog(null, mensagem);

    }

}
