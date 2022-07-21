/*
Ejercicio 9: Hacer un programa para calcular el área de Polígonos
(Triángulos y Rectángulos) el programa debe ser capaz de almacenar en 
un arreglo N triángulos y rectángulos, y al final mostrar el área y los 
datos de cada uno. Para ello se tendrá lo siguiente: 
-Una super clase llamada polígono.
-Una sub clase llamada Rectángulo.
-Una sub clase llamada Triángulo.
*/
package Ej09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int nPoligonos, contador=0, opcion;
        double base, altura, lado1, lado2, lado3;
        
        System.out.print("Poligonos a digitar: ");
        nPoligonos=sc.nextInt();
        
        Poligono misPoligonos[]=new Poligono[nPoligonos];
        
        do {
            System.out.println("\n\t.:MENU:.");
            System.out.println("1. Ingresar un rectangulo");
            System.out.println("2. Ingresar un triangulo");
            System.out.print("Opcion: ");
            opcion=sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Digita la base: ");
                    base=sc.nextDouble();
                    System.out.print("Digita la altura: ");
                    altura=sc.nextDouble();
                    misPoligonos[contador]=new Rectangulo(base, altura);
                    System.out.println("El area es: " + misPoligonos[contador].getArea());
                    contador++;
                    break;
                case 2:
                    System.out.print("Digite el lado 1: ");
                    lado1=sc.nextDouble();
                    System.out.print("Digite el lado 2: ");
                    lado2=sc.nextDouble();
                    System.out.print("Digite el lado 3: ");
                    lado3=sc.nextDouble();
                    misPoligonos[contador]=new Triangulo(lado1, lado2, lado3);
                    System.out.println("El area es: " + misPoligonos[contador].getArea());
                    contador++;
                    
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            
        } while (contador<nPoligonos);
        
        System.out.println("\n\tMostrando todos los poligonos: ");
        
        for (int i = 0; i < contador; i++) {
            System.out.println(misPoligonos[i].toString());
        }
        
        

    }
}
