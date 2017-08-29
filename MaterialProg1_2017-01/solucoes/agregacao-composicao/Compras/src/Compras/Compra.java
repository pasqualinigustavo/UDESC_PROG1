/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 9584013
 */
public class Compra {
    private int numNota;
    private List<Produto> produtosCompra = new ArrayList<Produto>();

    public void addProduto(Produto p) {
        this.produtosCompra.add(p);
    }
    
    public int getNumNota() {
        return numNota;
    }

    public void setNumNota(int numNota) {
        this.numNota = numNota;
    }

    public List<Produto> getProdutosCompra() {
        return produtosCompra;
    }

    public void setProdutosCompra(List<Produto> produtosCompra) {
        this.produtosCompra = produtosCompra;
    }
}
