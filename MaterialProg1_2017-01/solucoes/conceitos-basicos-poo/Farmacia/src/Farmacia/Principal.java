
package Farmacia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Principal {
    
    private List<Medicamento> medicamentos = new ArrayList<Medicamento>();
    private List<Cosmetico> cosmeticos = new ArrayList<Cosmetico>();
    
    public void run() {
        String menu = "1 - Cadastro de medicamento\n" +
                      "2 - Cadastro de cosmético\n" +
                      "3 - Consulta de medicamentos e cosméticos\n" +
                      "4 - Marcas de cosméticos e quantidade por marca\n" +
                      "5 - Medicamentos com preço maior que a média de preços dos medicamentos\n\n" +
                      "0 - Sair\n";
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        while(opcao != 0) {
            switch(opcao) {
                case 1:
                    cadastraMedicamento();
                    break;
                case 2:
                    cadastraCosmetico();
                    break;
                case 3:
                    consultaRegistros();
                    break;
                case 4:
                    marcasCosmeticos();
                    break;
                case 5:
                    medicamentosPrecoMaiorMedia();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
    }
    
    private void cadastraMedicamento() {
        Medicamento m = new Medicamento();
        m.setDescricao(JOptionPane.showInputDialog("Informe a descrição"));
        m.setDosagem(Double.parseDouble(JOptionPane.showInputDialog("Informe a dosagem")));
        m.setLaboratorio(JOptionPane.showInputDialog("Informe o laboratório"));
        m.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço")));
        
        medicamentos.add(m);
    }
    
    private void cadastraCosmetico() {
        Cosmetico c = new Cosmetico();
        c.setDescricao(JOptionPane.showInputDialog("Informe a descrição"));
        c.setLote(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do lote")));
        c.setMarca(JOptionPane.showInputDialog("Informe a marca"));
        c.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço")));
        
        cosmeticos.add(c);
    }
    
    private void consultaRegistros() {
        String resultado = "---------- MEDICAMENTOS ----------\n";
        for(Medicamento m : medicamentos) {
            resultado += m.toString() + "\n";
        }
        
        resultado += "\n---------- COSMÉTICOS ----------\n";
        for(Cosmetico c : cosmeticos) {
            resultado += c.toString() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    private void marcasCosmeticos() {
        List<String> marcas = new ArrayList<String>();
        
        for(Cosmetico c : cosmeticos) {
            if(!marcas.contains(c.getMarca())) {
                marcas.add(c.getMarca());
            }
        }
        
        String resultado = "";
        for(String marca : marcas) {
            resultado += marca;
            int qtd = 0;
            for(Cosmetico c : cosmeticos) {
                if(c.getMarca().equals(marca))
                    qtd++;
            }
            resultado += ": " + qtd + "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    private void medicamentosPrecoMaiorMedia() {
        double media = 0;
        for(Medicamento m : medicamentos) {
            media += m.getPreco();
        }
        media = media / medicamentos.size();
        
        String resultado = "";
        for(Medicamento m : medicamentos) {
            if(m.getPreco() > media)
                resultado += m.toString() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
