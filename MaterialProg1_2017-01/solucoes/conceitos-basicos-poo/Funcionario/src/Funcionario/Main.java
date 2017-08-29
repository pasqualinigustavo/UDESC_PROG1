
package Funcionario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    
    private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public static void main(String[] args) {
        String menu = "1 - Incluir funcionário\n" +
                      "2 - Excluir funcionário\n" +
                      "3 - Alterar dados de um funcionário\n" +
                      "4 - Consultar funcionário pelo CPF\n" +
                      "5 - Consultar funcionários por tempo mínimo de serviço\n" +
                      "6 - Consultar salário médio dos funcionários cadastrados\n" +
                      "7 - Consultar total de dependentes\n" +
                      "8 - Consultar todos os funcionários cadastrados\n\n" +
                      "0 - Sair\n";
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        while(opcao != 0) {
            switch(opcao) {
                case 1:
                    incluirFuncionario();
                    break;
                case 2:
                    excluirFuncionario();
                    break;
                case 3:
                    alterarFuncionario();
                    break;
                case 4:
                    consultaPeloCpf();
                    break;
                case 5:
                    consultaPorTempo();
                    break;
                case 6:
                    consultaSalarioMedio();
                    break;
                case 7:
                    consultaTotalDependentes();
                    break;
                case 8:
                    listaFuncionarios();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
    }
    
    public static void consultaTotalDependentes() {
        int total = 0;
        for(Funcionario f : funcionarios) {
            total += f.getDependentes();
        }
        
        JOptionPane.showMessageDialog(null, "Total de dependentes: " + total);
    }
    
    public static void consultaSalarioMedio() {
        double media = 0d;
        for(Funcionario f : funcionarios) {
            media += f.getSalario();
        }
        
        media = media / funcionarios.size();
        
        JOptionPane.showMessageDialog(null, "Média de salários: " + media);
    }
    
    public static void consultaPorTempo() {
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo mínimo de serviço"));
        boolean encontrou = false;
        String listagem = "";
        
        for(Funcionario f : funcionarios) {
            if(f.getTempoServico() >= tempo) {
                listagem += f.toString() + "\n";
                encontrou = true;
            }
        }
        
        if(!encontrou)
            JOptionPane.showMessageDialog(null, "Não existem funcionários a serem exibidos");
        else
            JOptionPane.showMessageDialog(null, listagem);
    }
    
    public static void consultaPeloCpf() {
        String cpf = JOptionPane.showInputDialog("Informe o CPF do funcionário a ser consultado");
        boolean encontrou = false;
        
        for(Funcionario f : funcionarios) {
            if(f.getCpf().equalsIgnoreCase(cpf)) {
                JOptionPane.showMessageDialog(null, f.toString());
                encontrou = true;
                break;
            }
        }
        
        if(!encontrou)
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
    }
    
    public static void incluirFuncionario() {
        String cpf = JOptionPane.showInputDialog("Informe o CPF");
        String nome = JOptionPane.showInputDialog("Informe o nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
        int tempoServico = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de servico"));
        int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de dependentes"));
        
        Funcionario f = new Funcionario(cpf, nome, idade, salario, tempoServico, dependentes);
        funcionarios.add(f);
    }
    
    public static void excluirFuncionario() {
        String cpf = JOptionPane.showInputDialog("Informe o CPF do funcionário a ser excluído");
        boolean encontrado = false;
        
        for(Funcionario f : funcionarios) {
            if(f.getCpf().equalsIgnoreCase(cpf)) {
                funcionarios.remove(f);
                JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
                encontrado = true;
                break;
            }
        }
        
        if(!encontrado)
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
    }
    
    public static void alterarFuncionario() {
        String cpf = JOptionPane.showInputDialog("Informe o CPF do funcionário a ser alterado");
        boolean encontrou = false;
        
        for(Funcionario f : funcionarios) {
            if(f.getCpf().equalsIgnoreCase(cpf)) {
                f.setCpf(JOptionPane.showInputDialog("Informe o novo CPF"));
                f.setNome(JOptionPane.showInputDialog("Informe o novo nome"));
                f.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a nova idade")));
                f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o novo salário")));
                f.setTempoServico(Integer.parseInt(JOptionPane.showInputDialog("Informe o novo tempo de servico")));
                f.setDependentes(Integer.parseInt(JOptionPane.showInputDialog("Informe o novo número de dependentes")));
                
                JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso!");
                encontrou = true;
                break;
            }
        }
        
        if(!encontrou)
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
    }
    
    public static void listaFuncionarios() {
        String listagem = "";
        
        for(Funcionario f : funcionarios) {
            listagem += f.toString() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, listagem);
    }
    
}
