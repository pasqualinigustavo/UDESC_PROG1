/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnvioFormulario;

import javax.swing.JOptionPane;

/**
 *
 * @author 9584013
 */
public class Aplicacao {
    
    public void run() {
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        String email = JOptionPane.showInputDialog("Informe seu email");
        String mensagem = JOptionPane.showInputDialog("Digite a mensagem");
        
        Sender sender = new Sender();
        
        Formulario form = new Formulario();
        form.setNome(nome);
        form.setEmail(email);
        form.setMensagem(mensagem);
        form.enviar(sender);
    }
}
