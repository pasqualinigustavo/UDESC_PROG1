/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelatorioPessoas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 9584013
 */
public class Aplicacao {
    
    List<Pessoa> pessoas = new ArrayList<Pessoa>();
    
    public void run() {
        Pessoa p1 = new Pessoa("José", 'M', 40);
        Pessoa p2 = new Pessoa("Maria", 'F', 20);
        Pessoa p3 = new Pessoa("João", 'M', 30);
        Pessoa p4 = new Pessoa("Pedro", 'M', 15);
        Pessoa p5 = new Pessoa("Ana", 'F', 23);
        Pessoa p6 = new Pessoa("Manuel", 'M', 67);
        Pessoa p7 = new Pessoa("Lucia", 'F', 8);
        
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p6);
        pessoas.add(p7);
        
        Filtro filtro = new Filtro();
        filtro.setIdadeMax(30);
        filtro.setSexo('M');
        
        Relatorio r = new Relatorio();
        List<Pessoa> listaFiltrada = r.pesquisa(pessoas, filtro);
        
        String result = "LISTA FILTRADA\n";
        for(Pessoa p : listaFiltrada) {
            result += p.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
