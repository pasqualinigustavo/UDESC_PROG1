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
public class Sender {
    public void enviar(String[] dados) {
        String envio = "ENVIO DO FORMULÁRIO\n";
        for(String dado: dados)
            envio += dado + "\n";
        JOptionPane.showMessageDialog(null, envio);
    }
}
