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
public class Medico extends Persona{
    private String titulacion;
    private int a�osExperiencia;
    
    public Medico(String nombre, String apellidos, int edad, String titulacion, int a�osExperiencia){
        super(nombre, apellidos, edad);
        this.titulacion=titulacion;
        this.a�osExperiencia=a�osExperiencia;
    }
    
    public void curarLesion(){
        System.out.println("Soy medico y Curo la lesion");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Soy medico y Cuido a los jugadores en el partido");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Soy medico y Cuido a los jugadores en el entrenamiento");
    }
    
    
}
