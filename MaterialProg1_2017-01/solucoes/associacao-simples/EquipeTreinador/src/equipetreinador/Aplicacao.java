/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipetreinador;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Aplicacao {
    
    private Equipe minhaEquipe;
    
    public void run() {
        criaObjetos();
        mostraObjetos();
    }
    
    private void mostraObjetos() {
        String resultado = "Dados dos objetos\n\n";
        
        resultado += "Nome da equipe: " + minhaEquipe.getNome() + "\n";
        resultado += "Categoria: " + minhaEquipe.getCategoria() + "\n";
        resultado += "Treinador: " + minhaEquipe.getTreinador().getNome();
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    private void criaObjetos() {
        minhaEquipe = new Equipe();
        Treinador meuTreinador = new Treinador();
        
        minhaEquipe.setNome(JOptionPane.showInputDialog("Informe o nome da equipe"));
        minhaEquipe.setCategoria(JOptionPane.showInputDialog("Informe a categoria da equipe"));
        
        meuTreinador.setNome(JOptionPane.showInputDialog("Informe o nome do treinador"));
        meuTreinador.setNumRegistro(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de registro do treinador")));
        meuTreinador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do treinador")));
        
        minhaEquipe.setTreinador(meuTreinador);
    }
}
