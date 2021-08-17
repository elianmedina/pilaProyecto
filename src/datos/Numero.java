/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author elian.medina
 */
public class Numero {

    private int dado1;
    
    private int dado2;

    /**
     * Get the value of dado2
     *
     * @return the value of dado2
     */
    public int getDado2() {
        return dado2;
    }

    /**
     * Set the value of dado2
     *
     * @param dado2 new value of dado2
     */
    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }


    public Numero() {
    }

    public Numero(int numero) {
        this.dado1 = numero;
        this.dado2 = numero;
    }

    
    /**
     * Get the value of dado1
     *
     * @return the value of dado1
     */
    public int getNumero() {
        return dado1;
    }

    /**
     * Set the value of dado1
     *
     * @param numero new value of dado1
     */
    public void setNumero(int numero) {
        this.dado1 = numero;
    }

    @Override
    public String toString() {
        return "Dado izquierdo" + dado1  + "Dado derecho" + dado2;
    }
    
    
}
