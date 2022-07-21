/*

*/
package ClasesyObjetos2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a,b;
        
        System.out.print("Digita un numero: ");
        a=sc.nextInt();
        System.out.print("Digita otro numero: ");
        b=sc.nextInt();
        
        Operacion op=new Operacion();
        
        op.sumar(a, b);
        op.restar(a, b);
        op.multiplicar(a, b);
        op.dividir(a, b);
        op.mostrarResultados();
    }
    
}
