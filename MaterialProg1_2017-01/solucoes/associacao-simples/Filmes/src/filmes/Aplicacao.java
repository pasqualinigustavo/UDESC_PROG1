/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmes;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Aplicacao {
    
    public void run() {
        Estante e1 = new Estante();
        e1.setNumSala(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da sala da estante 1")));
        e1.setNumCorredor(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do corredor da estante 1")));
        
        Filme f1 = new Filme();
        f1.setTitulo(JOptionPane.showInputDialog("Informe o título do filme 1"));
        f1.setSinopse(JOptionPane.showInputDialog("Informe a sinopse do filme 1"));
        f1.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Informe a duração do filme 1")));
        f1.setEstante(e1);
        
        Filme f2 = new Filme();
        f2.setTitulo(JOptionPane.showInputDialog("Informe o título do filme 2"));
        f2.setSinopse(JOptionPane.showInputDialog("Informe a sinopse do filme 2"));
        f2.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Informe a duração do filme 2")));
        f2.setEstante(e1);
        
        Filme f3 = new Filme();
        f3.setTitulo(JOptionPane.showInputDialog("Informe o título do filme 3"));
        f3.setSinopse(JOptionPane.showInputDialog("Informe a sinopse do filme 3"));
        f3.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Informe a duração do filme 3")));
        f3.setEstante(e1);
        
        Estante e2 = new Estante();
        e2.setNumSala(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da sala da estante 2")));
        e2.setNumCorredor(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do corredor da estante 2")));
        
        Filme f4 = new Filme();
        f4.setTitulo(JOptionPane.showInputDialog("Informe o título do filme 4"));
        f4.setSinopse(JOptionPane.showInputDialog("Informe a sinopse do filme 4"));
        f4.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Informe a duração do filme 4")));
        f4.setEstante(e2);
        
        Filme f5 = new Filme();
        f5.setTitulo(JOptionPane.showInputDialog("Informe o título do filme 5"));
        f5.setSinopse(JOptionPane.showInputDialog("Informe a sinopse do filme 5"));
        f5.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Informe a duração do filme 5")));
        f5.setEstante(e2);
        
        String resultado = "Filmes cadastrados\n\n";
        resultado += f1.getTitulo() + " (" + f1.getDuracao() + "): estante da sala " + f1.getEstante().getNumSala() + " no corredor " + f1.getEstante().getNumCorredor() + "\n";
        resultado += f2.getTitulo() + " (" + f2.getDuracao() + "): estante da sala " + f2.getEstante().getNumSala() + " no corredor " + f2.getEstante().getNumCorredor() + "\n";
        resultado += f3.getTitulo() + " (" + f3.getDuracao() + "): estante da sala " + f3.getEstante().getNumSala() + " no corredor " + f3.getEstante().getNumCorredor() + "\n";
        resultado += f4.getTitulo() + " (" + f4.getDuracao() + "): estante da sala " + f4.getEstante().getNumSala() + " no corredor " + f4.getEstante().getNumCorredor() + "\n";
        resultado += f5.getTitulo() + " (" + f5.getDuracao() + "): estante da sala " + f5.getEstante().getNumSala() + " no corredor " + f5.getEstante().getNumCorredor() + "\n";
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
