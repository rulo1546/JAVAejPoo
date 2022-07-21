/*
Ejercicio 9: Hacer un programa para calcular el área de Polígonos
(Triángulos y Rectángulos) el programa debe ser capaz de almacenar en 
un arreglo N triángulos y rectángulos, y al final mostrar el área y los 
datos de cada uno. Para ello se tendrá lo siguiente: 
-Una super clase llamada polígono.
-Una sub clase llamada Rectángulo.
-Una sub clase llamada Triángulo.
*/
package Ej09_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    
    
    public static void main(String[] args) {
        ejecutarPrograma();
    }
    
    
    public static void pedirPoligonos(){
        int opcion;
        char respuesta;
        do {
                System.out.println("\n\t.:MENU:.");
                System.out.println("1. Agregar un Triangulo");
                System.out.println("2. Agregar un Rectangulo");
                System.out.print("Opcion: ");
                opcion=sc.nextInt();
                
                switch (opcion) {
                    case 1://agregar un triangulo
                        pedirTriangulo();
                        break;
                    case 2://agregar un rectangulo
                        pedirRectangulo();
                        break;
                }
            System.out.println("\n\tIngresar otro poligono? (s/n)");
            respuesta=sc.next().charAt(0);
        } while (respuesta=='s' || respuesta=='S');
        
    }
    
    public static void pedirTriangulo(){
        double lado1,lado2,lado3;
        System.out.print("Digite el lado 1: ");
        lado1=sc.nextDouble();
        System.out.print("Digite el lado 2: ");
        lado2=sc.nextDouble();
        System.out.print("Digite el lado 3: ");
        lado3=sc.nextDouble();
        
        Triangulo triangulo=new Triangulo(lado1, lado2, lado3);
        
        poligonos.add(triangulo);
    }
    
    public static void pedirRectangulo(){
        double base, altura;
        System.out.print("Digite la base: ");
        base=sc.nextDouble();
        System.out.print("Digite la altura: ");
        altura=sc.nextDouble();
        
        Rectangulo rectangulo=new Rectangulo(base, altura);
        
        poligonos.add(rectangulo);
    }
    
    public static void mostrarPoligonos(){
        System.out.println("\n\tMostrando todos los poligonos:");
        for(Poligono figuras: poligonos){
            System.out.println(figuras.toString());
            System.out.println("Area: " +figuras.getArea());
        }
    }
    
    public static void ejecutarPrograma(){
        pedirPoligonos();
        mostrarPoligonos();
    }
}
