package Resolucao;

import Modelos.Clientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao15 {
    public void executar(){
        ArrayList<Clientes> listaClientes = new ArrayList<>();
        
        listaClientes.add(new Clientes("Tiago", 1250));
        listaClientes.add(new Clientes("Brenda", 2580));
        listaClientes.add(new Clientes("Douglas", 2594));
        listaClientes.add(new Clientes("Robson", 200));
        listaClientes.add(new Clientes("Paulo", 10500));
        
        listaClientes.add(new Clientes("Rogério", 8502));
        listaClientes.add(new Clientes("Geraldo", 1360));
        listaClientes.add(new Clientes("Gustavo", 3601));
        listaClientes.add(new Clientes("Roberto", 5100));
        listaClientes.add(new Clientes("Andréia", 8000));
        
        listaClientes.add(new Clientes("Viviane", 4210));
        listaClientes.add(new Clientes("Luzia", 5630));
        listaClientes.add(new Clientes("Carla", 9800));
        listaClientes.add(new Clientes("Ana", 7100));
        listaClientes.add(new Clientes("Jonas", 3100));
        
        for(Clientes c: listaClientes){
            if(c.getValorCompras() <= 1000){
                c.setBonus(c.getValorCompras()*0.1);
            }else{
                c.setBonus(c.getValorCompras()*0.15);
            }
        }
        
        String s = "";
        for(Clientes c: listaClientes){
            s += c.toString();
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
