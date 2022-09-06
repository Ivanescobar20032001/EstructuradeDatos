/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3;

import java.util.ArrayList;

/**
 *
 * @author ElTioWaffles
 */
public class Arreglo <T>{
    int tamanio;
    ArrayList<T> datos;
    
    public Arreglo (int tam){
    this.tamanio = tam;
    datos = new ArrayList();
        for (int i = 0; i < this.tamanio; i++) {
            datos.add(null);
        }
    }
    
    public T getElemento (int indice) throws IndexOutOfBoundsException{
        return datos.get(indice);
    }
    
    public void setElemento (int indice, T dato) throws IndexOutOfBoundsException{
        this.datos.set(indice,dato);
    }

    public Arreglo(int tamanio, ArrayList<T> datos) {
        this.tamanio = tamanio;
        this.datos = datos;
    }

     public int getTamanio() {
        return tamanio;
    }
    
    public void limpiar(T dato){
        for (int i = 0; i < datos.size(); i++) {
            datos.set(i, dato);
        }
    }
    
    @Override
    public String toString() {
        String estado = "";
        for (T dato : datos) {
            if(dato != null)
            estado += dato.toString() +"\n";
        }
        return estado;
    }
}
