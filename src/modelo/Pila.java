/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author elian.medina
 */
public class Pila <T extends Base>{
    private LinkedList<T> tope;

    public Pila() {
        tope=new LinkedList<>();
    }
    
    public void apilar(T elemento){
        tope.addFirst(elemento);
    }
    public T desapilar(){
        return tope.removeFirst();
    }
    public boolean estaVacia(){
        return tope.isEmpty();
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder("[");
        for (T e : tope) {
            sb.append(" ").append(e.toString());
        }
        sb.append("]");

        return sb.toString();
            }
    }
    
    

