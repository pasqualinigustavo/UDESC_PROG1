package Calculadora;

public class AreaTrapezio {
    private double baseMenor;
    private double baseMaior;
    private double altura;

    public double calcula() {
        //A = [(baseMaior + baseMenor) * altura] / 2        
        return (((baseMaior + baseMenor) * altura) / 2);
    }
    
    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
