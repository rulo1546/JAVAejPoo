/*

*/
package Ej02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int x,y;
        
        System.out.print("Digite la posicion inicial en X: ");
        x=sc.nextInt();
        
        System.out.print("Digite la posicion inicial en Y: ");
        y=sc.nextInt();
        
        Objeto ob1 = new Objeto(x, y);
        int opcion, mover;
        
        //Menu: 
        do {
            System.out.println("\nDigite: \n1. Mover arriba\n2. Mover abajo"
                    + "\n3. Mover Izquierda\n4. Mover derecha\n5. Salir");
            opcion=sc.nextInt();
            
            switch (opcion) {
                case 1://mover arriba
                    System.out.print("Espacios a mover: ");
                    mover=sc.nextInt();
                    ob1.moverArriba(mover);
                    break;
                case 2://mover abajo
                    System.out.print("Espacios a mover: ");
                    mover=sc.nextInt();
                    ob1.moverAbajo(mover);
                    break;
                case 3://mover izquierda
                    System.out.print("Espacios a mover: ");
                    mover=sc.nextInt();
                    ob1.moverIzquierda(mover);
                    break;
                case 4://mover derecha
                    System.out.print("Espacios a mover: ");
                    mover=sc.nextInt();
                    ob1.moverDerecha(mover);
                    break;
                case 5: 
                    System.out.println("Salir.");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            ob1.mostrarPoscicion();
        } while (opcion!=5);
    }
    
}
