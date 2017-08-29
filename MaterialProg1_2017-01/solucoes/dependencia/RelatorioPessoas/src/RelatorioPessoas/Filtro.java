/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelatorioPessoas;

/**
 *
 * @author 9584013
 */
public class Filtro {
    private int idadeMin;
    private int idadeMax;
    private char sexo;
    
    public Filtro() {
        idadeMin = Integer.MIN_VALUE;
        idadeMax = Integer.MAX_VALUE;
        sexo = 'x';
    }

    public int getIdadeMin() {
        return idadeMin;
    }

    public void setIdadeMin(int idadeMin) {
        this.idadeMin = idadeMin;
    }

    public int getIdadeMax() {
        return idadeMax;
    }

    public void setIdadeMax(int idadeMax) {
        this.idadeMax = idadeMax;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
