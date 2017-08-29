/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestaoEmpresas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 9584013
 */
public class Aplicacao {
    private List<Empresa> todasEmpresas = new ArrayList<Empresa>();
    private List<Funcionario> todosFuncionarios = new ArrayList<Funcionario>();
    
    public void run() {
        criaRegistros();
        
        String menu = "1 - Cadastro de departamentos\n"
                + "2 - Vincular funcionário ao departamento\n"
                + "3 - Visualização de empresas, departamentos e funcionários\n\n"
                + "0 - Sair";
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        while(opcao != 0) {
            switch(opcao) {
                case 1:
                    cadastraDepartamento();
                    break;
                case 2:
                    vinculaFuncionarios();
                    break;
                case 3:
                    visualizaTudo();
                    break;
            }
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
    }
    
    private void visualizaTudo() {
        String result = "";
        
        for(Empresa e : todasEmpresas) {
            result += "EMPRESA: " + e.getNome() + " (" + e.getCnpj() + ")\n";
            for(Departamento d : e.getDepartamentos()) {
                result += "                DEPARTAMENTO: " + d.getNome() + "\n";
                for(Funcionario f : d.getFuncionarios()) {
                    result += "                                FUNCIONÁRIO: " + f.getNome() + " (" + f.getMatricula() + ")\n";
                }
            }
            result += "\n";
        }
        
        JOptionPane.showMessageDialog(null, result);
    }
    
    private void vinculaFuncionarios() {
        Empresa empresa;
        Departamento departamento;
        Funcionario funcionario;
        
        String empresas = "Selecione a empresa\n";
        int contador = 1;
        for(Empresa e: todasEmpresas) {
            empresas += contador + ": " + e.getNome() + "\n";
            contador++;
        }
        int indexEmpresa = Integer.parseInt(JOptionPane.showInputDialog(empresas));
        empresa = todasEmpresas.get(indexEmpresa - 1);
        
        String departamentos = "Selecione o departamento\n";
        contador = 1;
        for(Departamento d: empresa.getDepartamentos()) {
            departamentos += contador + ": " + d.getNome() + "\n";
            contador++;
        }
        int indexDepartamento = Integer.parseInt(JOptionPane.showInputDialog(departamentos));
        departamento = empresa.getDepartamentos().get(indexDepartamento - 1);
        
        String funcionarios = "Selecione o funcionário\n";
        contador = 1;
        for(Funcionario f: todosFuncionarios) {
            funcionarios += contador + ": " + f.getNome() + "\n";
            contador++;
        }
        int indexFuncionario = Integer.parseInt(JOptionPane.showInputDialog(funcionarios));
        funcionario = todosFuncionarios.get(indexFuncionario - 1);
        
        departamento.getFuncionarios().add(funcionario);
    }
    
    private void cadastraDepartamento() {
        Departamento d = new Departamento();
        
        String empresas = "Selecione a empresa\n";
        int contador = 1;
        for(Empresa e: todasEmpresas) {
            empresas += contador + ": " + e.getNome() + "\n";
            contador++;
        }
        
        int index = Integer.parseInt(JOptionPane.showInputDialog(empresas));
        todasEmpresas.get(index - 1).getDepartamentos().add(d);
        
        d.setNome(JOptionPane.showInputDialog("Informe o nome do departamento"));
        d.setAndar(Integer.parseInt(JOptionPane.showInputDialog("Informe o andar")));
    }
    
    private void criaRegistros() {
        Empresa e1 = new Empresa("Empresa A", "123456");
        Empresa e2 = new Empresa("Empresa B", "654321");
        Empresa e3 = new Empresa("Empresa C", "111222");
        
        Funcionario f1 = new Funcionario("Maria da Silva", "111111");
        Funcionario f2 = new Funcionario("João de Oliveira", "222222");
        Funcionario f3 = new Funcionario("José Alencar", "333333");
        Funcionario f4 = new Funcionario("Manuel Pereira", "444444");
        Funcionario f5 = new Funcionario("Ana Maria Clara", "555555");
        Funcionario f6 = new Funcionario("Lucas dos Santos", "666666");
        
        todasEmpresas.add(e1);
        todasEmpresas.add(e2);
        todasEmpresas.add(e3);
        
        todosFuncionarios.add(f1);
        todosFuncionarios.add(f2);
        todosFuncionarios.add(f3);
        todosFuncionarios.add(f4);
        todosFuncionarios.add(f5);
        todosFuncionarios.add(f6);
    }
}
