/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacoesCores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 9584013
 */
public class Desenho {
    private List<Figura> figuras = new ArrayList<Figura>();

    public void addFigura(Figura fig) {
        this.figuras.add(fig);
    }
    
    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }
}
