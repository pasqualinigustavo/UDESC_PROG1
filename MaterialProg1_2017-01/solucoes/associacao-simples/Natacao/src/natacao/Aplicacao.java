/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natacao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Aplicacao {
    
    private List<Prova> listaProvas = new ArrayList<Prova>();
    private List<Atleta> listaAtletas = new ArrayList<Atleta>();
    
    public void run() {
        String menu = "1 - Cadastro de prova\n" +
                "2 - Cadastro de atleta\n" +
                "3 - Cadastro de recorde\n" +
                "4 - Consulta registros\n" +
                "0 - Sair";
        
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(opcao) {
                case 1:
                    cadastraProva();
                    break;
                    
                case 2:
                    cadastraAtleta();
                    break;
                    
                case 3:
                    cadastraRecorde();
                    break;
                    
                case 4:
                    consultaRegistros();
                    break;
                    
                case 0:
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
            
        } while (opcao != 0);
    }
    
    private void cadastraProva() {
        String descricao = JOptionPane.showInputDialog("Informe a descrição");
        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Informe a distância"));
        
        Prova p = new Prova();
        p.setDescricao(descricao);
        p.setDistancia(distancia);
        p.setRecorde(null);
        
        listaProvas.add(p);
    }
    
    private void cadastraAtleta() {
        String nome = JOptionPane.showInputDialog("Informe o nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
        
        Atleta a = new Atleta();
        a.setNome(nome);
        a.setIdade(idade);
        
        listaAtletas.add(a);
    }
    
    private void cadastraRecorde() {
        String provas = "Informe o número da prova\n\n";
        int contador = 1;
        for(Prova p : listaProvas) {
            provas += contador + " - " + p.getDescricao() + " / " + p.getDistancia() + "\n";
            contador++;
        }
        
        int index = Integer.parseInt(JOptionPane.showInputDialog(provas));
        Prova p = listaProvas.get(index - 1);
        
        String atletas = "Informe o número do atleta\n\n";
        contador = 1;
        for(Atleta a : listaAtletas) {
            atletas += contador + " - " + a.getNome() + "\n";
            contador++;
        }
        
        index = Integer.parseInt(JOptionPane.showInputDialog(atletas));
        Atleta a = listaAtletas.get(index - 1);
        
        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo realizado"));
        Recorde r = new Recorde();
        r.setTempo(tempo);
        r.setAtleta(a);
        p.setRecorde(r);
        
    }
    
    private void consultaRegistros() {
        String resultado = "";
        for(Prova p: listaProvas) {
            if(p.getRecorde() != null)
                resultado += p.getDescricao() + " / " + p.getDistancia() + " - Recorde de " + p.getRecorde().getTempo() + " batido por " + p.getRecorde().getAtleta().getNome() + ".\n";
            else
                resultado += p.getDescricao() + " / " + p.getDistancia() + " - não possui recorde.\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
