/*

*/
package Ej01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double lado1,lado2;
        System.out.print("Digite el primer lado: ");
        lado1=sc.nextDouble();
        System.out.print("Digite el segundo lado: ");
        lado2=sc.nextDouble();
        
        Cuadrilatero c1;
        
        if (lado1!=lado2) {
            c1=new Cuadrilatero(lado1, lado2);
            c1.calcularArea();
            c1.calcularPerimetro();
            c1.mostrarResultados();
        }else{
            c1=new Cuadrilatero(lado2);
            c1.calcularArea();
            c1.calcularPerimetro();
            c1.mostrarResultados();
        }
        
    }
    
}
