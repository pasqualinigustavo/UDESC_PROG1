/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compras;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 9584013
 */
public class Aplicacao {
    private List<Compra> minhasCompras = new ArrayList<Compra>();
    private List<Produto> meusProdutos = new ArrayList<Produto>();
    
    public void run() {
        String menu = "1 - Cadastrar compra\n" +
                      "2 - Listar total da compra\n\n" +
                      "0 - Sair";
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        while(opcao != 0) {
            switch(opcao) {
                case 1:
                    cadastroCompra();
                    break;
                case 2:
                    listarTotal();
                    break;
            }
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
    }
    
    private void listarTotal() {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da nota"));
        
        for(Compra minhaCompra: minhasCompras) {
            if(minhaCompra.getNumNota() == nota) {
                double total = 0d;
                for(Produto p: minhaCompra.getProdutosCompra()) {
                    total += p.getValor();
                }
                JOptionPane.showMessageDialog(null, "Total da compra: " + total);
            }
        }
    }
    
    private void cadastroCompra() {
        Compra c = new Compra();
        c.setNumNota(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da nota")));
        
        String descricao = JOptionPane.showInputDialog("Informe o nome do produto (x para sair)");
        
        while(!descricao.equals("x")) {
            boolean encontrou = false;
        
            for(Produto meuProduto: meusProdutos) {
                if(meuProduto.getDescricao().equals(descricao)) {
                    encontrou = true;
                    c.addProduto(meuProduto);
                    break;
                }
            }

            if(!encontrou) {
                Produto p = new Produto();
                p.setDescricao(descricao);
                p.setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto")));
                c.addProduto(p);
                meusProdutos.add(p);
            }
            
            descricao = JOptionPane.showInputDialog("Informe o nome do produto (x para sair)");
        }
        
        minhasCompras.add(c);
    }
}
