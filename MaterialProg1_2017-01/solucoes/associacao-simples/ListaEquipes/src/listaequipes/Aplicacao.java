/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaequipes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Aplicacao {
    
    private List<Equipe> listaEquipes = new ArrayList<Equipe>();
    
    public void run() {
        for(int i = 0; i < 3; i++)
            cadastraEquipeTreinador();
        
        mostraRegistros();
    }
    
    private void cadastraEquipeTreinador() {
        Equipe equipe = new Equipe();
        Treinador treinador = new Treinador();
        
        equipe.setNome(JOptionPane.showInputDialog("Informe o nome da equipe"));
        equipe.setCategoria(JOptionPane.showInputDialog("Informe a categoria da equipe"));
        
        treinador.setNome(JOptionPane.showInputDialog("Informe o nome do treinador"));
        treinador.setNumRegistro(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de registro do treinador")));
        treinador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do treinador")));
        
        equipe.setTreinador(treinador);
        treinador.setEquipe(equipe);
        
        listaEquipes.add(equipe);
    }
    
    private void mostraRegistros() {
        String resultado = "";
        for(Equipe e : listaEquipes) {
            resultado += "Equipe: " + e.getNome() + "\n" +
                        "Categoria: " + e.getCategoria() + "\n" +
                        "Treinador: " + e.getTreinador().getNome() + "\n\n";
        }
            
        JOptionPane.showMessageDialog(null, resultado);
    }
}
