/*
Ejercicio 10: Crear un programa para simular un equipo de futbol (futbolista,
entrenador y doctor), para lo cual tendremos lo siguiente: 
-Una super clase Persona, que tendrá los siguientes datos:
    nombre, apellido, edad.
-La sub clase Futbolista tendrá los siguientes datos: 
    dorsal y posición.
-La sub clase Entrenador tendrá los siguientes datos: 
    Estrategia que utiliza.
-La sub clase Doctor tendrá los siguientes datos: 
    la titulacion y los años de experiencia.

Hacer un menú donde se tengan las siguientes opciones: Viaje de equipo,
entrenamiento, partido de futbol, planificar entrenamiento, entrevista y
curar lesión.
*/
package Ej10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Persona> persona=new ArrayList<Persona>();
    
    static Persona futbolista1= new Futbolista("Raul", "Rodriguez", 22, 25, "Delantero");
    static Persona futbolista2= new Futbolista("Rafa", "Marquez", 30, 33, "Delantero");
    static Persona entrenador=new Entrenador("Victor", "Jaime", 50, "Ataque");
    static Persona medico=new Medico("Chapatin", "Chabelo", 50, "Cirujano", 20);
    public static void main(String[] args) {
            persona.add(futbolista1);
            persona.add(futbolista2);
            persona.add(entrenador);
            persona.add(medico);
    
    
    
    
    int opcion;
    
        do {
            System.out.println("\n\t.:MENU:.");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Platinificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            System.out.print("Opcion: ");
            opcion=sc.nextInt();
            
            switch (opcion) {
                case 1://viaje de equipo
                   viajeDeEquipo();
                    break;
                case 2://entrenamiento
                    entrenamiento();
                    break;
                case 3://partido de futbol
                    partidoDeFutbol();
                    break;
                case 4://planificar entrenamiento
                    planificarEntrenamiento();
                    break;
                case 5://entrevista
                    entervista();
                    break;
                case 6://curar lesion
                    curarLesion();
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta");
            }
            
        } while (opcion!=7);
        
    }
    
    public static void viajeDeEquipo(){
        for(Persona p:persona){
            p.viajar();
            System.out.println("");
        }
    }
    
    public static void entrenamiento(){
        for(Persona p:persona){
            p.entrenamiento();
            System.out.println("");
        }
        
    }
    
    public static void partidoDeFutbol(){
        for(Persona p:persona){
            p.partidoFutbol();
        }
    }
    
    public static void planificarEntrenamiento(){
        ((Entrenador)(entrenador)).planificarEntrenamiento();
    }
    public static void entervista(){
        ((Futbolista)(futbolista1)).entrevista();
        ((Futbolista)(futbolista2)).entrevista();
        
    }
    public static void curarLesion(){
        ((Medico)(medico)).curarLesion();
    }
    
}
