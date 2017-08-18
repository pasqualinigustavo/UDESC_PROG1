package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author TiagoFunk
 */
public class Questao06 {

    public void executar() {
        int sextoNumeroPrimo = 0, decimoSegundoNumeroPrimo = 0,
                numerosLista = 0, diferenca;
        boolean numeroPrimo;

        for (int i = 2; ; i++) {
            numeroPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    numeroPrimo = false;
                    break;
                }
            }
            if (numeroPrimo) {
                numerosLista++;
                if(numerosLista == 6){
                    sextoNumeroPrimo = i;
                }
                
                if(numerosLista == 12){
                    decimoSegundoNumeroPrimo = i;
                }
            }

            if (numerosLista == 12) {
                break;
            }
        }

        diferenca = decimoSegundoNumeroPrimo - sextoNumeroPrimo;

        JOptionPane.showMessageDialog(null, "Diferença entre "
                + sextoNumeroPrimo + " e " + decimoSegundoNumeroPrimo + ": " + diferenca);
    }
}
