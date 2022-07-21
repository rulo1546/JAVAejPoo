/*
Ejercicio 5: Dise�ar un programa para trabajar con triangulos is�celes. 
Para ello defina los atributos necesarios que se requieren, proporcione
m�todos de consulta, un m�todo constructor e implemente m�todos para calcular
el per�metro y el �rea de un tri�ngulo, adem�s implementar un m�todo que a
partir de un arreglo de tri�ngulos devuelva el �rea del tri�ngulo de mayor 
superficie.
*/
package Ej05;

import java.util.Scanner;

public class Main {
    
        public static int getMayor(Triangulo[] array){
        double areaMayor=array[0].getArea();
        int indice=0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].getArea()>areaMayor) {
                areaMayor=array[i].getArea();
                indice=i;
            }
        }
         return indice;   
                
    }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base, lado;
        int numTriangulos;
        
        System.out.print("Triangulos a ingresar: ");
        numTriangulos=sc.nextInt();
        
        Triangulo arreglo[]=new Triangulo[numTriangulos];
        
        for (int i = 0; i < numTriangulos; i++) {
            System.out.println("\nTriangulo N." + (i+1) + " ");
            System.out.print("Digite la base: ");
            base=sc.nextDouble();
        
             System.out.print("Digite un lado: ");
            lado=sc.nextDouble();
            
            arreglo[i]=new Triangulo(base, lado);
            System.out.print("Area: " + arreglo[i].getArea());
            System.out.println("\nPerimetro: " + arreglo[i].getPerimetro());
        }
        
        int f=getMayor(arreglo);
        System.out.println("\n\tTriangulo de mayor superficie.\n" + 
                "Lado: " + arreglo[f].getLado() + 
                "\nBase: " + arreglo[f].getBase() + 
                "\nArea: " + arreglo[f].getArea() +
                "\nPerimetro: " + arreglo[f].getPerimetro());
    }
}
