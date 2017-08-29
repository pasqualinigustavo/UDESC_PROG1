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
public class SensorVelocidade {
    private double precisao;

    public SensorVelocidade(double precisao) {
        this.precisao = precisao;
    }

    public double getPrecisao() {
        return precisao;
    }

    public void setPrecisao(double precisao) {
        this.precisao = precisao;
    }
}
