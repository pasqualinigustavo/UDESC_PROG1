/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 9584013
 */
public class Aplicacao {
    
    private List<Proprietario> proprietarios = new ArrayList<Proprietario>();
    private List<Cidade> cidades = new ArrayList<Cidade>();
    private List<Imovel> imoveis = new ArrayList<Imovel>();
    
    public void run() {
        criaProprietarios();
        criaCidades();
        
        String menu = "1 - Cadastrar imóvel\n"
                + "2 - Consultar imóveis pelo tipo\n"
                + "3 - Consultar imóveis por cidade\n\n"
                + "0 - Sair";
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        while(opcao != 0) {
            switch(opcao) {
                case 1:
                    cadastraImovel();
                    break;
                case 2:
                    mostraImoveisPorTipo();
                    break;
                case 3:
                    mostraImoveisPorCidade();
                    break;
            }
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
    }
    
    private void mostraImoveisPorCidade() {
        String cidade = JOptionPane.showInputDialog("Informe a cidade");
        String result = "Imóveis da cidade " + cidade + "\n\n";
        
        for(Imovel i : imoveis) {
            if(i.getCidade().getDescricao().equals(cidade))
                result += i.toString() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, result);
    }
    
    private void mostraImoveisPorTipo() {
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo buscado"));
        String result = "Imóveis com tipo " + tipo + "\n\n";
        
        for(Imovel i : imoveis) {
            if(i.getTipo() == tipo)
                result += i.toString() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, result);
    }
    
    private void cadastraImovel() {
        String listaProprietarios = "Selecione um proprietário\n\n" + listaProprietarios();
        int numProprietario = Integer.parseInt(JOptionPane.showInputDialog(listaProprietarios));
        Proprietario p = proprietarios.get(numProprietario - 1);
        
        String listaCidades = "Selecione uma cidade\n\n" + listaCidades();
        int numCidade = Integer.parseInt(JOptionPane.showInputDialog(listaCidades));
        Cidade c = cidades.get(numCidade - 1);
        
        Imovel imovel = new Imovel();
        imovel.setCidade(c);
        imovel.setProprietario(p);
        imovel.setTipo(Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo do imóvel")));
        imovel.setArea(Double.parseDouble(JOptionPane.showInputDialog("Informe a área do imóvel")));
        imoveis.add(imovel);
    }
    
    private String listaCidades() {
        String result = "";
        int contador = 1;
        
        for(Cidade c : cidades) {
            result += contador + ": " + c.getDescricao() + "\n";
            contador++;
        }
        
        return result;
    }
    
    private String listaProprietarios() {
        String result = "";
        int contador = 1;
        
        for(Proprietario p : proprietarios) {
            result += contador + ": " + p.getNome() + " - " + p.getCpf() + "\n";
            contador++;
        }
        
        return result;
    }
    
    private void criaProprietarios() {
        Proprietario p1 = new Proprietario("Maria da Silva", "123.456.789-10", "12345");
        Proprietario p2 = new Proprietario("José de Oliveira", "111.222.333-44", "54321");
        Proprietario p3 = new Proprietario("Pedro Ferreira", "321.654.987-99", "67890");
        Proprietario p4 = new Proprietario("Ana Pereira", "987.654.321-00", "98760");
        
        proprietarios.add(p1);
        proprietarios.add(p2);
        proprietarios.add(p3);
        proprietarios.add(p4);
    }
    
    private void criaCidades() {
        Cidade c1 = new Cidade("Rio do Sul");
        Cidade c2 = new Cidade("Ibirama");
        Cidade c3 = new Cidade("Presidente Getúlio");
        
        cidades.add(c1);
        cidades.add(c2);
        cidades.add(c3);
    }
}
