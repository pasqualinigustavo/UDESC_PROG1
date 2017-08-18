package Resolucao;

import Modelos.Candidato;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao16 {
    public void executar(){
        ArrayList<Candidato> listaCandidatos = new ArrayList<>();
        
        Candidato c1 = new Candidato("Tiago");
        Candidato c2 = new Candidato("Robson");
        Candidato c3 = new Candidato("Paulo");
        Candidato c4 = new Candidato("André");
        
        Candidato votoNulo = new Candidato("Votos nulos");
        Candidato votoBrancos = new Candidato("Votos em branco");
        
        listaCandidatos.add(c1);
        listaCandidatos.add(c2);
        listaCandidatos.add(c3);
        listaCandidatos.add(c4);
        listaCandidatos.add(votoBrancos);
        listaCandidatos.add(votoNulo);
        
        int opcao, totalVotos = 0;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digíte:"
                    + "\n1 para votar em " + c1.getNome()
                    + "\n2 para votar em " + c2.getNome()
                    + "\n3 para votar em " + c3.getNome()
                    + "\n4 para votar em " + c4.getNome()
                    + "\n5 para votar nulo"
                    + "\n6 para votar em branco"
                    + "\n0 para finalizar os votos"
            ));
            
            switch(opcao){
                case 1:
                    c1.acrescentarVoto();
                    totalVotos++;
                    break;
                case 2:
                    c2.acrescentarVoto();
                    totalVotos++;
                    break;
                case 3:
                    c3.acrescentarVoto();
                    totalVotos++;
                    break;
                case 4:
                    c4.acrescentarVoto();
                    totalVotos++;
                    break;
                case 5:
                    votoNulo.acrescentarVoto();
                    totalVotos++;
                    break;
                case 6:
                    votoBrancos.acrescentarVoto();
                    totalVotos++;
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida !!");
            }
        }while(opcao != 0);
        
        for(Candidato c: listaCandidatos){
            c.calcularPorcentagem(totalVotos);
        }
        
        String s = "";
        for(Candidato c: listaCandidatos){
            s += c.toString();
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
