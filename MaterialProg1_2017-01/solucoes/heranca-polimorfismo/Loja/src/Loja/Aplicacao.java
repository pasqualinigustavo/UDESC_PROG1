/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loja;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 9584013
 */
public class Aplicacao {
    private List<Produto> produtos = new ArrayList<Produto>();
    
    public void run() {
        String menu = "1 - Cadastro de produtos\n"
                + "2 - Vender produto\n"
                + "3 - Produtos com mais de R$ 80,00 de desconto\n"
                + "4 - Produtos que podem ser parcelados em mais de 5x\n"
                + "5 - Valor à vista e a prazo dos produtos\n\n"
                + "0 - Sair";
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        while(opcao != 0) {
            switch(opcao) {
                case 1:
                    cadastroProduto();
                    break;
                case 2:
                    venda();
                    break;
                case 3:
                    mostraProdutosDesconto80();
                    break;
                case 4:
                    mostraProdutosParcelas5();
                    break;
                case 5:
                    mostraValoresVistaPrazo();
                    break;
            }
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
    }
    
    private void mostraValoresVistaPrazo() {
        String texto = "";
        double totalSemDesconto = 0d;
        double totalComDesconto = 0d;
        
        for(Produto p : produtos) {
            texto += p.getNome() + ": R$" + p.getValor() + " (sem desconto) e R$" + (p.getValor() - p.calculaDesconto()) + " (com desconto)\n";
            totalSemDesconto += p.getValor();
            totalComDesconto += (p.getValor() - p.calculaDesconto());
        }
        
        texto += "\n\nTotal sem desconto: " + totalSemDesconto + "\nTotal com desconto: " + totalComDesconto;
        JOptionPane.showMessageDialog(null, texto);
    }
    
    private void mostraProdutosParcelas5() {
        String texto = "Produtos com mais de 5 parcelas\n";
        for(Produto p : produtos) {
            if(p.calculaParcelas() > 5) {
                texto += p.getNome() + " (" + p.calculaParcelas() + " parcelas)\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, texto);
    }
    
    private void mostraProdutosDesconto80() {
        String texto = "Produtos com desconto superior a R$ 80,00\n";
        for(Produto p : produtos) {
            if(p.calculaDesconto() > 80) {
                texto += p.getNome() + " (R$ " + p.calculaDesconto() + ")\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, texto);
    }
    
    private void venda() {
        String texto = "Selecione o produto\n";
        for(int i = 0; i < produtos.size(); i++) {
            texto += (i + 1) + ": " + produtos.get(i).getNome() + " (" + produtos.get(i).getValor() + ")\n";
        }
        int indexProduto = (Integer.parseInt(JOptionPane.showInputDialog(texto)) - 1);
        
        Produto produto = produtos.get(indexProduto);
        String nota =  "Produto: " + produto.getNome() + "\n"
                + "Valor final (com desconto): " + (produto.getValor() - produto.calculaDesconto()) + "\n"
                + "Número de parcelas: " + produto.calculaParcelas();
        
        JOptionPane.showMessageDialog(null, nota);
    }
    
    private void cadastroProduto() {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção\n1 - Eletrônico\n2 - Roupa"));
        
        if(opcao == 1) {
            Eletronico e = new Eletronico();
            e.setNome(JOptionPane.showInputDialog("Informe o nome do produto"));
            e.setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto")));
            e.setVoltagem(Integer.parseInt(JOptionPane.showInputDialog("Informe a voltagem (110 ou 220)")));
            produtos.add(e);
        }
        
        if(opcao == 2) {
            Roupa r = new Roupa();
            r.setNome(JOptionPane.showInputDialog("Informe o nome do produto"));
            r.setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto")));
            r.setTamanho(JOptionPane.showInputDialog("Informe o tamanho (P, M ou G)").charAt(0));
            produtos.add(r);
        }
    }
    
}
