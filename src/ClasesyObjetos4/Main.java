/*

*/
package ClasesyObjetos4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Digite un nombre: ");
        nombre=sc.nextLine();
        
        System.out.print("Digite una edad: ");
        edad=sc.nextInt();
        Persona p1=new Persona(nombre, edad);
        
        p1.mostrarDatos();
    }
}
