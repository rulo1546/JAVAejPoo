/*
Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados
por su marca, modelo y precio, imprima las propiedades del vehículo más barato.
Para ello, se deberán leer por teclado las características de cada vehículo
y crear una clase que represente a cada uno de ellos.
*/
package Ej03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int numVehiculos;
        String marca,modelo;
        double precio;
        double precioMin;
        
        System.out.print("Vehiculos a introducir: ");
        numVehiculos=sc.nextInt();
        System.out.println("");
        Vehiculo vehiculos[]=new Vehiculo[numVehiculos];
        
        for (int i = 0; i < numVehiculos; i++) {
            System.out.println("\nAuto n." + (i+1));
            System.out.print("Digite la marca: ");
            sc.nextLine();
            marca=sc.nextLine();
            System.out.print("Digite el modelo: ");
            modelo=sc.nextLine();
            System.out.print("Digite el precio: ");
            precio=sc.nextDouble();
            vehiculos[i]=new Vehiculo(marca, modelo, precio);
        }
        
        precioMin=vehiculos[0].getPrecio();
        int pos=0;
        
        for (int i = 0; i < numVehiculos; i++) {
            if (vehiculos[i].getPrecio()<precioMin) {
                precioMin=vehiculos[i].getPrecio();
                pos=i;
            }
        }
        System.out.println("\nCaracteristicas del vehiculo con menor precio: ");
        vehiculos[pos].mostrarCaracteristicas();
    }
}
