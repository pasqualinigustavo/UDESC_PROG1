/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 9584013
 */
public class Aplicacao {
    
    public void run() {
        List<Figura> figuras = criaListaFiguras();
        areaTodasFiguras(figuras);
        corFiguraMenorPerimetro(figuras);
    }
    
    private void corFiguraMenorPerimetro(List<Figura> figuras) {
        double menorPerimetro = Double.MAX_VALUE;
        Figura figuraMenorPerimetro = null;
        
        for(Figura f : figuras) {
            if(f.perimetro() < menorPerimetro) {
                menorPerimetro = f.perimetro();
                figuraMenorPerimetro = f;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A figura com menor perímetro possui perímetro igual a " + menorPerimetro + " e cor " + figuraMenorPerimetro.getCor().toUpperCase() + "!");
    }
    
    private void areaTodasFiguras(List<Figura> figuras) {
        String texto = "";
        double total = 0d;
        for(int i = 0; i < figuras.size(); i++) {
            double area = figuras.get(i).area();
            total += area;
            texto += "Área da figura " + (i + 1) + ": " + area + ".\n";
        }
        texto += "\nSoma das áreas: " + total;
        JOptionPane.showMessageDialog(null, texto);
    }
    
    private List<Figura> criaListaFiguras() {
        List<Figura> figuras = new ArrayList<Figura>();
        
        Retangulo r1 = new Retangulo(10, 4, "branco");
        Retangulo r2 = new Retangulo(2, 3, "azul");
        figuras.add(r1);
        figuras.add(r2);
        
        Triangulo t1 = new Triangulo(5, 4, 4, "verde");
        Triangulo t2 = new Triangulo(7, 4, 6, "azul");
        figuras.add(t1);
        figuras.add(t2);

        Circulo c1 = new Circulo(4, "branco");
        Circulo c2 = new Circulo(5, "vermelho");
        figuras.add(c1);
        figuras.add(c2);
        
        return figuras;
    }
}
