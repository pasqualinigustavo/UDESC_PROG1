/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radarsensor;

/**
 *
 * @author marcelo
 */
public class Radar {
    private double velocidadeMaxima;
    private SensorVelocidade sensor;

    public Radar(double velocidadeMaxima, SensorVelocidade sensor) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.sensor = sensor;
    }

    public SensorVelocidade getSensor() {
        return sensor;
    }

    public void setSensor(SensorVelocidade sensor) {
        this.sensor = sensor;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
