/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelatorioPessoas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 9584013
 */
public class Relatorio {
    
    public List<Pessoa> pesquisa(List<Pessoa> lista, Filtro filtro) {
        List<Pessoa> listaFiltrada = new ArrayList<Pessoa>();
        
        for(Pessoa p : lista) {
            if(p.getIdade() >= filtro.getIdadeMin() && p.getIdade() <= filtro.getIdadeMax()) {
                if(filtro.getSexo() != 'x') {
                    if(p.getSexo() == filtro.getSexo()) {
                        listaFiltrada.add(p);
                    }
                } else {
                    listaFiltrada.add(p);
                }
            }
        }
        return listaFiltrada;
    }
    
}
