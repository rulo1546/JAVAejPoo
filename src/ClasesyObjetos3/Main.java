/*

*/
package ClasesyObjetos3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.print("Digita un numero: ");
        a=sc.nextDouble();
        System.out.print("Digita otro numero: ");
        b=sc.nextDouble();
        
        Operacion op=new Operacion();
        double suma=op.sumar(a, b);
        System.out.println("La suma es: "+ suma);
        
        System.out.println("La resta es: " + op.restar(a, b));
        
        double multiplicacion=op.multiplicar(a, b);
        System.out.println("La multiplicacion es: " + multiplicacion);
        
        System.out.println("La division es: " + op.dividir(a, b));
        
    }
    
}
