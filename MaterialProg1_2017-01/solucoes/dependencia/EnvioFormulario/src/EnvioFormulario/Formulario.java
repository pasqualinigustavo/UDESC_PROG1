/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnvioFormulario;

/**
 *
 * @author 9584013
 */
public class Formulario {
    private String nome;
    private String email;
    private String mensagem;
    
    public void enviar(Sender sender) {
        String[] dados = new String[3];
        dados[0] = nome;
        dados[1] = email;
        dados[2] = mensagem;
        
        sender.enviar(dados);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
