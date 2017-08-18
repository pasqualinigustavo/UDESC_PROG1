package Modelos;

/**
 *
 * @author Tiago Funk
 */
public class Candidato {
    
    private String nome;
    private int numeroVotos;
    private double porcentagem;

    public void acrescentarVoto(){
        numeroVotos++;
    }
    
    public void calcularPorcentagem(int totalVotos){
        porcentagem = ( ( (double) numeroVotos) / totalVotos ) * 100;
    }
    
    public Candidato(String nome) {
        this.nome = nome;
        numeroVotos = 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }
    
    @Override
    public String toString() {
        return nome + ", Votos=" + numeroVotos + ", " + porcentagem + " %\n";
    }
    
    
}
