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
public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
    public Persona(String nombre, String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    
    public void viajar(){
        System.out.println("Soy del equipo y Estoy viajando");
    }
    
    public abstract void partidoFutbol();
    public abstract void entrenamiento();
}
