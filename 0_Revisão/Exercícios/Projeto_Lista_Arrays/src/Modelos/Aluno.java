package Modelos;

/**
 *
 * @author Tiago Funk
 */
public class Aluno {
    
    private String nome;
    private String situacao;
    private double notas[];
    private double media;

    public Aluno(String nome) {
        this.nome = nome;
        notas = new double[3];
    }
    
    public void calcularMedia(){
        double soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        media = soma/notas.length;
        
        if(media >= 7){
            situacao = "APROVADO";
        }else{
            situacao = "REPROVADO";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        String s = "Nome: " + nome + "\nNotas: ";
        for(int i = 0; i < notas.length; i++){
            s += notas[i] + ", ";
        }
        s += "\nMédia: " + media;
        s += "\nSituação: " + situacao;
        return s;
    }
    
}
