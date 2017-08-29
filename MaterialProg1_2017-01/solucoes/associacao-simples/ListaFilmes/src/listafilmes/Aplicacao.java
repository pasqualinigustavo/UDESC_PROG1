/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listafilmes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Aplicacao {
    
    private List<Estante> listaEstantes = new ArrayList<Estante>();
    
    public void run() {
        criaRegistros();
        mostraRegistros();
    }
    
    private void criaRegistros() {
        for(int i = 0; i < 2; i++) {
            Estante e = new Estante();
            e.setNumSala(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da sala da estante " + (i + 1))));
            e.setNumCorredor(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do corredor da estante " + (i + 1))));
            listaEstantes.add(e);
            
            for(int j = 0; j < 2; j++) {
                Filme f = new Filme();
                f.setTitulo(JOptionPane.showInputDialog("Informe o título do filme " + (j + 1)));
                f.setSinopse(JOptionPane.showInputDialog("Informe a sinopse do filme " + (j + 1)));
                f.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Informe a duração do filme " + (j + 1))));
                e.addFilme(f);
            }
        }
    }
    
    private void mostraRegistros() {
        String resultado = "";
        for(Estante e: listaEstantes) {
            resultado += e + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
