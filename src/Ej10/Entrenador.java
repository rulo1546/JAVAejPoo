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
public class Entrenador extends Persona{
    private String estrategia;
    
    
    public Entrenador(String nombre, String apellidos, int edad, String estrategia){
        super(nombre, apellidos, edad);
        this.estrategia=estrategia;
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Soy el entrenador y Estoy planificando un entrenamiento");
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Soy el entrenador y Estoy dirigiendo el partido");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Soy el entrenador y Estoy dirigiendo y entrenando al equipo");
    }
    
}
