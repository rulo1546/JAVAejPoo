/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej10;

/**
 *
 * @author rulo2
 */
public class Futbolista extends Persona{
    private int dorsal;
    private String posicion;
    
    public Futbolista(String nombre, String apellidos, int edad, int dorsal, String posicion){
        super(nombre, apellidos, edad);
        this.dorsal=dorsal;
        this.posicion=posicion;
    }
    
    public void entrevista(){
        System.out.println("Soy futbolista y Estoy dando una entrevista.");
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Soy futbolista y Estoy jugando un partido de futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Soy futbolista y Estoy entrenando.");
    }
}
