/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacoesCores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 9584013
 */
public class Aplicacao {
    private List<Desenho> desenhos = new ArrayList<Desenho>();
    
    public void run() {
        criaRegistros();
        areaCorNoDesenho(desenhos.get(1), "azul");
        coresDoDesenho(desenhos.get(0));
        desenhosSemCor(desenhos, "vermelho");
    }
    
    private void desenhosSemCor(List<Desenho> meusDesenhos, String cor) {
        List<Desenho> desenhosSemCor = new ArrayList<Desenho>();
        
        for(Desenho desenho : meusDesenhos) {
            boolean temCor = false;
            for(Figura f : desenho.getFiguras()) {
                if(f.getCor().equals(cor)) {
                    temCor = true;
                    break;
                }
            }
            
            if(!temCor)
                desenhosSemCor.add(desenho);
        }
        
        String texto = "Desenhos sem a cor " + cor.toUpperCase() + "\n";
        for(Desenho d : desenhosSemCor) {
            texto += "Desenho " + (desenhos.indexOf(d) + 1);
            texto += " (";
            for(int i = 0; i < d.getFiguras().size(); i++) {
                Figura f = d.getFiguras().get(i);
                texto += f.getCor();
                if(i != d.getFiguras().size() - 1)
                    texto += ", ";
            }
            texto += ")\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    private void coresDoDesenho(Desenho desenho) {
        List<String> cores = new ArrayList<String>();
        List<Double> areaCores = new ArrayList<Double>();
        
        for(Figura f : desenho.getFiguras()) {
            if(!cores.contains(f.getCor())) {
                cores.add(f.getCor());
                areaCores.add(f.area());
            } else {
                int index = cores.indexOf(f.getCor());
                double novaArea = areaCores.get(index) + f.area();
                areaCores.set(index, novaArea);
            }
        }
        
        String texto = "";
        for(int i = 0; i < cores.size(); i++) {
            texto += cores.get(i) + ": " + areaCores.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    private void areaCorNoDesenho(Desenho desenho, String cor) {
        double areaTotal = 0d;
        for(Figura f : desenho.getFiguras()) {
            if(f.getCor().equals(cor))
                areaTotal += f.area();
        }
        
        JOptionPane.showMessageDialog(null, "A cor " + cor + " ocupa uma área de " + areaTotal + " no desenho.");
    }
    
    private void criaRegistros() {
        Figura f1 = new Retangulo(5, 5, "azul");
        Figura f2 = new Retangulo(5, 3, "verde");
        Figura f3 = new Retangulo(2, 10, "vermelho");
        Figura f4 = new Triangulo(2, 3, 3, "verde");
        Figura f5 = new Triangulo(8, 5, 6, "azul");
        Figura f6 = new Triangulo(5, 3, 5, "branco");
        Figura f7 = new Circulo(3, "preto");
        Figura f8 = new Circulo(5, "amarelo");
        Figura f9 = new Circulo(6, "azul");
        
        Desenho d1 = new Desenho();
        Desenho d2 = new Desenho();
        Desenho d3 = new Desenho();
        
        d1.addFigura(f1);
        d1.addFigura(f2);
        d1.addFigura(f4);
        d1.addFigura(f7);
        
        d2.addFigura(f3);
        d2.addFigura(f5);
        d2.addFigura(f8);
        
        d3.addFigura(f6);
        d3.addFigura(f9);
        
        desenhos.add(d1);
        desenhos.add(d2);
        desenhos.add(d3);
    }
}
