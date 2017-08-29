/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radarsensor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Aplicacao {
    
    public void run() {
        List<Radar> listaRadares = criaRegistros();
        
        String resultado = "";
        for(Radar r: radaresPrecisaoMinima(listaRadares, 85)) {
            resultado += "Radar com velocidade máxima de " + r.getVelocidadeMaxima() + " km/h e precisão " + r.getSensor().getPrecisao() + ".\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    private List<Radar> radaresPrecisaoMinima(List<Radar> radares, double precisao) {
        List<Radar> result = new ArrayList<Radar>();
        
        for(Radar r: radares) {
            if(r.getSensor().getPrecisao() >= precisao)
                result.add(r);
        }
        
        return result;
    }
    
    private List<Radar> criaRegistros() {
        List<Radar> radares = new ArrayList<Radar>();
        
        radares.add(new Radar(50, new SensorVelocidade(80)));
        radares.add(new Radar(40, new SensorVelocidade(90)));
        radares.add(new Radar(50, new SensorVelocidade(93)));
        radares.add(new Radar(60, new SensorVelocidade(78)));
        
        return radares;
    }
}
