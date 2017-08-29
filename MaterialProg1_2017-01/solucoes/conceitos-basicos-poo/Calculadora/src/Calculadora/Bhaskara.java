package Calculadora;

public class Bhaskara {
    private double a;
    private double b;
    private double c;
    
    public String calcula() {
        double delta = (b * b) + (-4 * (a * c));
        
        if(delta == 0) {
            double x = (-b / (2 * a));
            return "x = " + x;
        } else if (delta >= 0) {
            double x1 = ((-(b) + Math.sqrt(delta)) / (2 * a));
            double x2 = ((-(b) - Math.sqrt(delta)) / (2 * a));
            return "x1 = " + x1 + "\n x2 = " + x2;
        } else {
            return "Delta não possui raiz!";
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
