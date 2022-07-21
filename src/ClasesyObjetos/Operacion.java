/*

*/
package ClasesyObjetos;

import java.util.Scanner;

public class Operacion {
    Scanner sc=new Scanner(System.in);
    
    //Atributos
    
    double num1;
    double num2;
    double suma;
    double resta;
    double multiplicacion;
    double division;
    
    //metodos
    
    public void leerNumeros(){
        System.out.print("Digita un numero: ");
        num1=sc.nextInt();
        System.out.print("Digita otro numero: ");
        num2=sc.nextInt();
    }
    
    public void sumar(){
        suma=num1+num2;
    }
    
    public void restar(){
        resta=num1-num2;
    }
    
    public void multiplicar(){
        multiplicacion=num1*num2;
    }
    
    public void dividir(){
        division=num1/num2;
    }
    
    public void mostrarResultados(){
        System.out.print("La suma es: " + suma);
        System.out.print("\nLa resta es: " + resta);
        System.out.print("\nLa multiplicacion es: " + multiplicacion);
        System.out.print("\nLa division es: " + division);
    }
    
}
