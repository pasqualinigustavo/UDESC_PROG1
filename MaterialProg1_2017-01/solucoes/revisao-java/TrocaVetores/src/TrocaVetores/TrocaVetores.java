package TrocaVetores;

import javax.swing.JOptionPane;

public class TrocaVetores {

    public static void main(String[] args) {
        int[] vetor = null;
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor (número par)"));
        vetor = new int[tamanho];
        
        String mensagem = "Vetor original: ";
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "° valor do vetor "));
            mensagem += vetor[i] + " ";
        }
        JOptionPane.showMessageDialog(null, mensagem);

        for (int i = 0; i < tamanho / 2; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[((tamanho / 2) + i)];
            vetor[((tamanho / 2) + i)] = aux;
        }

        mensagem = "Vetor modificado: ";
        for (int i = 0; i < vetor.length; i++) {
            int j = vetor[i];
            mensagem += vetor[i] + " ";
        }
        JOptionPane.showMessageDialog(null, mensagem);
        
        int soma = 0;
        int produto = 1;
        
        for (int i = 0; i < tamanho; i++) {
            if ((vetor[i] % 2) == 0) {
                soma = soma + vetor[i];
            }else{
                produto = produto * vetor[i];
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos números pares é " + soma + "\nO produto dos números ímpares é " + produto);

    }

}
