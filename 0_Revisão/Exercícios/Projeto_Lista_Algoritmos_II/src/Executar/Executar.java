package Executar;

import Resolucao.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Executar {
    
    public static void main(String[] args) {
        
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da questão para ve-la executar !!"
                    + "\nPara sair digíte -1."));
            
            switch (opcao){
                case 1:
                    Questao01 q01 = new Questao01();
                    q01.executar();
                    break;
                case 2:
                    Questao02 q02 = new Questao02();
                    q02.executar();
                    break;
                case 3:
                    Questao03 q03 = new Questao03();
                    q03.executar();
                    break;
                case 4:
                    Questao04 q04 = new Questao04();
                    q04.executar();
                    break;
                case 5:
                    Questao05 q05 = new Questao05();
                    q05.executar();
                    break;
                case 6:
                    Questao06 q06 = new Questao06();
                    q06.executar();
                    break;
                case 7:
                    Questao07 q07 = new Questao07();
                    q07.executar();
                    break;
                case 8:
                    Questao08 q08 = new Questao08();
                    q08.executar();
                    break;
                case 9:
                    Questao09 q09 = new Questao09();
                    q09.executar();
                    break;
                case 10:
                    Questao10 q10 = new Questao10();
                    q10.executar();
                    break;
                case 11:
                    Questao11 q11 = new Questao11();
                    q11.executar();
                    break;
                case 12:
                    Questao12 q12 = new Questao12();
                    q12.executar();
                    break;
                case 13:
                    Questao13 q13 = new Questao13();
                    q13.executar();
                    break;
                case 14:
                    Questao14 q14 = new Questao14();
                    q14.executar();
                    break;
                case 15:
                    Questao15 q15 = new Questao15();
                    q15.executar();
                    break;
                case -1:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida !!");
            }
        }while(opcao != -1);
        
    }
}
