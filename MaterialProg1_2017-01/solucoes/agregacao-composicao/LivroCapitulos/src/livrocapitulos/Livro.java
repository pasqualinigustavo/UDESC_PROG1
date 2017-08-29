/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrocapitulos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class Livro {
    private List<Capitulo> caps = new ArrayList<Capitulo>();

    public void addCapitulo(int numero, String titulo) {
        Capitulo c = new Capitulo();
        c.setNumero(numero);
        c.setTitulo(titulo);
        caps.add(c);
    }

    public List<Capitulo> getCaps() {
        return caps;
    }
}
