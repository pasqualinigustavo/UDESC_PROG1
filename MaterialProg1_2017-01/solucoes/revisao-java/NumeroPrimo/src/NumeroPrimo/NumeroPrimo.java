package NumeroPrimo;

import javax.swing.JOptionPane;

public class NumeroPrimo {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
        
        while (numero != -1) {
            boolean primo = true;
            for (int i = numero - 1; i > 1; i--) {
                if(numero % i == 0) {
                    primo = false;
                    break;
                }
            }
            
            if(primo)
                JOptionPane.showMessageDialog(null, "O número " + numero + " é primo");
            else
                JOptionPane.showMessageDialog(null, "O número " + numero + " NÃO é primo");

            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número ou -1 para encerrar"));
        }

    }

}
