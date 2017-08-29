package Bhaskara;

import javax.swing.JOptionPane;

public class Bhaskara {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de C"));
        
        int delta = (b * b) + (-4 * (a * c));
        JOptionPane.showMessageDialog(null, "Delta = " + delta);

        if(delta == 0) {
            double x = (-b / (2 * a));
            JOptionPane.showMessageDialog(null, "x = " + x);
        } else if (delta >= 0) {
            double x1 = ((-(b) + Math.sqrt(delta)) / (2 * a));
            double x2 = ((-(b) - Math.sqrt(delta)) / (2 * a));
            JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\n x2 = " + x2);
        } else {
            JOptionPane.showMessageDialog(null, "Delta não possui raiz!");
        }
    }

}
