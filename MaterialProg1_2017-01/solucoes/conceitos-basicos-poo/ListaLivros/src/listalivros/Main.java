/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listalivros;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Main {

    private static List<Livro> listaLivros = new ArrayList<Livro>();
    
    public static void main(String[] args) {
        criaLivros();
        mostraLivros();
    }
    
    public static void criaLivros() {
        for(int i = 0; i < 3; i++) {
            String titulo = JOptionPane.showInputDialog("Informe o título do primeiro livro");
            String autor = JOptionPane.showInputDialog("Informe o autor do primeiro livro");
            String editora = JOptionPane.showInputDialog("Informe a editora do primeiro livro");
            int numPags = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de páginas do primeiro livro"));
            
            Livro livro = new Livro(titulo, autor, editora, numPags);
            listaLivros.add(livro);
        }
    }
    
    public static void mostraLivros() {
        String resultado = "";
        for(Livro livro : listaLivros) {
            resultado += livro.getTitulo() + ": " + livro.getNumPags() + " páginas.\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
