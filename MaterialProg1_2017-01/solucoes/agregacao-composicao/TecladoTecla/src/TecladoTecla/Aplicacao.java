/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TecladoTecla;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 9584013
 */
public class Aplicacao {
    
    private List<Teclado> meusTeclados = new ArrayList<Teclado>();
    
    public void run() {
        String menu = "1 - Cadastrar teclado (e suas teclas)\n" +
                      "2 - Listar todos os teclados\n" +
                      "3 - Verificar palavra\n\n" +
                      "0 - Sair";
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        while(opcao != 0) {
            switch(opcao) {
                case 1:
                    cadastrarTeclado();
                    break;
                case 2:
                    listarTeclados();
                    break;
                case 3:
                    verificaPalavra();
                    break;
            }
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
    }
    
    private void verificaPalavra() {
        String palavra = JOptionPane.showInputDialog("Informe a palavra");
        List<String> tecladosCompativeis = new ArrayList<String>();
        
        for(Teclado teclado: meusTeclados) {   
            boolean compativel = true;
            for(int i = 0; i < palavra.length(); i++) {
                char c = palavra.charAt(i);
                boolean encontrou = false;
                for(Tecla tecla: teclado.getTeclas()) {
                    if(tecla.getValor() == c){
                        encontrou = true;
                        break;
                    }
                }
                if(!encontrou) {
                    compativel = false;
                    break;
                }
            }
            
            if(compativel) {
                tecladosCompativeis.add(teclado.getPais());
            }
        }   
        
        String result = "TECLADOS COMPATÍVEIS\n\n";
        for(String pais: tecladosCompativeis) {
            result += pais + "\n";
        }
        
        JOptionPane.showMessageDialog(null, result);
    }
    
    private void listarTeclados() {
        String result = "";
        for(Teclado t: meusTeclados) {
            result += t.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }
    
    private void cadastrarTeclado() {
        Teclado teclado = new Teclado();
        teclado.setPais(JOptionPane.showInputDialog("Informe o país"));
        
        String textoTecla = JOptionPane.showInputDialog("Informe o caracter da tecla (ou FIM para finalizar)");
        
        while(!textoTecla.equals("FIM")) {
            char caracter = textoTecla.charAt(0);
            teclado.addTecla(caracter);
            textoTecla = JOptionPane.showInputDialog("Informe o caracter da tecla (ou FIM para finalizar)");
        }
        
        meusTeclados.add(teclado);
    }
    
}
