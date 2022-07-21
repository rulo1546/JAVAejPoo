/*
Construir un programa para una competencia de atletismo, el programa 
debe gestionar una serie de atletas caracterizados por su número de atleta, 
nombre y tiempo de carrera, al final el programa debe mostrar los datos 
del atleta ganador de la carrera.
*/
package Ej04;

import java.util.Scanner;

public class Main {
    
    public static int buscarIndiceMenorTiempo(Atleta a[]){
        double tiempoMin=a[0].getTiempoCarrera();
        int indice=0;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i].getTiempoCarrera()<tiempoMin) {
                indice=i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int numeroAtleta;
        String nombre;
        double tiempoDeCarrera;
        int numDeAtletas;
        
        System.out.print("Numero de atletas: ");
        numDeAtletas=sc.nextInt();
        
        Atleta atletas[]=new Atleta[numDeAtletas];
        
        for (int i = 0; i < numDeAtletas; i++) {
            System.out.println("\nAtleta " + (i+1) + ": ");
            System.out.print("Numero de atleta: ");
            numeroAtleta=sc.nextInt();
            System.out.print("Nombre: ");
            sc.nextLine();
            nombre=sc.nextLine();
            System.out.print("Tiempo de carrera: ");
            tiempoDeCarrera=sc.nextDouble();
            
            atletas[i]=new Atleta(numeroAtleta, nombre, tiempoDeCarrera);
            
        }
        
        System.out.println("\nEl atleta ganador es: ");
        
        atletas[buscarIndiceMenorTiempo(atletas)].mostrarDatosAtleta();
        System.out.println("");
    }
}
