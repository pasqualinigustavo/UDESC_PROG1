/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artigos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 9584013
 */
public class Aplicacao {
    
    private List<Instituicao> instituicoes = new ArrayList<Instituicao>();
    private List<Revista> revistas = new ArrayList<Revista>();
    private List<Artigo> artigos = new ArrayList<Artigo>();
    
    public void run() {
        String menu = "1 - Cadastrar instituição\n"
                + "2 - Cadastrar revista\n"
                + "3 - Cadastrar artigo\n"
                + "4 - Relatório de artigos\n\n"
                + "0 - Sair";
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        while(opcao != 0) {
            switch(opcao) {
                case 1:
                    cadastrarInstituicao();
                    break;
                case 2:
                    cadastrarRevista();
                    break;
                case 3:
                    cadastrarArtigo();
                    break;
                case 4:
                    relatorioArtigos();
                    break;
            }
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
    }
    
    private void cadastrarInstituicao() {
        Instituicao i = new Instituicao();
        i.setNome(JOptionPane.showInputDialog("Informe o nome da instituição"));
        i.setCidade(JOptionPane.showInputDialog("Informe a cidade da instituição"));
        i.setRevistas(new ArrayList<Revista>());
        
        instituicoes.add(i);
    }
    
    private void cadastrarRevista() {
        Revista r = new Revista();
        r.setNome(JOptionPane.showInputDialog("Informe o nome da revista"));
        r.setEdicao(Integer.parseInt(JOptionPane.showInputDialog("Informe a edição da revista")));
        r.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da revista")));
        r.setArtigos(new ArrayList<Artigo>());
        revistas.add(r);
        
        boolean encontrouInstituicao = false;
        
        while(!encontrouInstituicao) {
            String nomeInstituicao = JOptionPane.showInputDialog("Informe o nome da instituição a qual a revista pertence");
            
            for(Instituicao i : instituicoes) {
                if(i.getNome().equals(nomeInstituicao)) {
                    i.addRevista(r);
                    encontrouInstituicao = true;
                    break;
                }
            }
        }
    }
    
    private void cadastrarArtigo() {
        Artigo a = new Artigo();
        a.setTitulo(JOptionPane.showInputDialog("Informe o título do artigo"));
        a.setResumo(JOptionPane.showInputDialog("Informe o resumo do artigo"));
        artigos.add(a);
        
        boolean encontrouRevista = false;
        
        while(!encontrouRevista) {
            String nomeRevista = JOptionPane.showInputDialog("Informe o nome da revista a qual o artigo pertence");
            
            for(Revista r : revistas) {
                if(r.getNome().equals(nomeRevista)) {
                    r.addArtigo(a);
                    encontrouRevista = true;
                    break;
                }
            }
        }
    }
    
    private void relatorioArtigos() {
        String resultado = "ARTIGOS CADASTRADOS\n\n";
        for(Artigo a : artigos) {
            resultado += a.toString() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
