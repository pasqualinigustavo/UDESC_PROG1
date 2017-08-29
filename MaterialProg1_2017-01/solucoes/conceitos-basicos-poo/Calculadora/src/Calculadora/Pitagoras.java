package Calculadora;

public class Pitagoras {
    private double b;
    private double c;

    public double calcula() {
        //a^2 = b^2 + c^2
        b *= b;
        c *= c;
        return Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
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
