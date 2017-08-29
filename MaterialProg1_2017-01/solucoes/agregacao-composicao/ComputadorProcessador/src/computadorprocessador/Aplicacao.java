/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadorprocessador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Aplicacao {
    
    List<Computador> computadores = new ArrayList<Computador>();
    
    public void run() {
        criaRegistros();
        mostraProcessadores(computadores);
    }
    
    private void mostraProcessadores(List<Computador> computadores) {
        int contador = 1;
        String result = "";
        for(Computador c: computadores) {
            if(c.getProcessador().getNucleos() > 1)
                result += "Computador " + contador + ": " + c.getProcessador().getNucleos() + " núcleos, com potência " + c.getProcessador().getPotencia() + "\n";
            contador++;
        }
        JOptionPane.showMessageDialog(null, result);
    }
    
    private void criaRegistros() {
        Computador c1 = new Computador();
        c1.addProcessador(1, 2);
        
        Computador c2 = new Computador();
        c2.addProcessador(2, 2);
        
        Computador c3 = new Computador();
        c3.addProcessador(4, 3);
        
        Computador c4 = new Computador();
        c4.addProcessador(4, 3);
        
        computadores.add(c1);
        computadores.add(c2);
        computadores.add(c3);
        computadores.add(c4);
    }
}
