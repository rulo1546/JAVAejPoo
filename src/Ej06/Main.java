/*
Ejercicio 6: Construir un programa para trabajar con 2 números complejos,
implemente el siguiente menú:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. Comprar 2 números complejos (iguales o no) 
4. Multiplicar un número complejo por un entero
*/
package Ej06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        numeroC num1,num2;
        int entero, a, bi;
        
        do {
            System.out.println("\n\tDigite una opcion: ");
            System.out.println("1. Sumar dos números complejos");
            System.out.println("2. Multiplicar 2 números complejos");
            System.out.println("3. Comprar 2 números complejos (iguales o no)");
            System.out.println("4. Multiplicar un número complejo por un entero");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion=sc.nextInt();
            
            switch (opcion) {
                case 1://Sumar dos números complejos
                    System.out.print("Digite la parte real del primer numero: ");
                    a=sc.nextInt();
                    System.out.print("Digite la parte imaginaria del primer numero: ");
                    bi=sc.nextInt();
                    num1=new numeroC(a, bi);
                    System.out.print("Digite la parte real del primero numero: ");
                    a=sc.nextInt();
                    System.out.print("Digite la parte imaginaria del primer numero: ");
                    bi=sc.nextInt();
                    num2=new numeroC(a, bi);
                    num1.sumar(num2);
                    System.out.print("La suma es: ");
                    num1.mostrarValor();
                    break;
                case 2://Multiplicar 2 números complejos
                    System.out.print("Digite la parte real del primero numero: ");
                    a=sc.nextInt();
                    System.out.print("Digite la parte imaginaria del primer numero: ");
                    bi=sc.nextInt();
                    num1=new numeroC(a, bi);
                    System.out.print("Digite la parte real del primero numero: ");
                    a=sc.nextInt();
                    System.out.print("Digite la parte imaginaria del primer numero: ");
                    bi=sc.nextInt();
                    num2=new numeroC(a, bi);
                    num1.multiplicar(num2);
                    System.out.print("La multiplicacion es: ");
                    num1.mostrarValor();
                    break;
                case 3://Comprar 2 números complejos (iguales o no)");
                    System.out.print("Digite la parte real del primero numero: ");
                    a=sc.nextInt();
                    System.out.print("Digite la parte imaginaria del primer numero: ");
                    bi=sc.nextInt();
                    num1=new numeroC(a, bi);
                    System.out.print("Digite la parte real del primero numero: ");
                    a=sc.nextInt();
                    System.out.print("Digite la parte imaginaria del primer numero: ");
                    bi=sc.nextInt();
                    num2=new numeroC(a, bi);
                    if (num1.comprar(num2)==true) {
                        System.out.println("Los numeros son iguales");
                    }else{
                        System.out.println("Los numeros son diferentes.");
                    }
                    break;
                case 4://Multiplicar un número complejo por un entero
                    System.out.print("Digite la parte real :");
                    a=sc.nextInt();
                    System.out.print("Digite la parte imaginaria :");
                    bi=sc.nextInt();
                    num1=new numeroC(a, bi);
                    System.out.print("Digite el entero: ");
                    entero=sc.nextInt();
                    num1.multiplicarXentero(entero);
                    System.out.print("El resultado es: ");
                    num1.mostrarValor();
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion!=5);
        
    }
   
}
