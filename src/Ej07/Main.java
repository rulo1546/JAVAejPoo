/*
Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un banco 
para lo cual tendremos 2 clases (Cliente y Cuenta). Considerar que un cliente
se caracteriza por su nombre, apellido y DNI. El cliente puede consultar
saldo, asi como ingresar y retirar dinero de sus cuentas. Además cada cuenta se
caracteriza por un número de cuenta y un saldo.
*/
package Ej07;

import java.util.Scanner;

public class Main {

    public static int buscarCuenta(Cuenta cuentas[], int numCuenta){
        
        int indiceCuenta=-1;
        
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i].getNumeroCuenta()==numCuenta) {
                indiceCuenta=i;
            }
        }
        return indiceCuenta;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nCuentas, opcion, numCuenta, indice;
        double saldo, ingreso, retiro;
        String nombre; 
        String apellido;
        String DNI;
        
        System.out.print("Nombre: ");
        nombre=sc.nextLine();
        
        System.out.print("Apellido: ");
        apellido=sc.nextLine();
        
        System.out.print("DNI: ");
        DNI=sc.nextLine();
        
        System.out.print("Numero de cuentas: ");
        nCuentas=sc.nextInt();
        
        //Creacion objeto cuentas
        Cuenta cuentas[]=new Cuenta[nCuentas];
        
        //Creacion objeto cliente
        Cliente cliente=new Cliente(nombre, apellido, DNI, cuentas);
        
        //llenando las cuentas del cliente
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\t"+(i+1) + ".");
            System.out.print("Digite el numero de cuenta: ");
            numCuenta=sc.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo=sc.nextDouble();
            
            cuentas[i]=new Cuenta(numCuenta, saldo);
        }
        
        do {
            System.out.println("\n\tMenu"); 
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion=sc.nextInt();
            System.out.println("");
            
            switch (opcion) {
                case 1://ingresar dinero 
                    
                    System.out.print("Digite el numero de cuenta: ");
                    numCuenta=sc.nextInt();
                    indice=buscarCuenta(cuentas, numCuenta);

                    if (indice!=-1) {
                        System.out.print("Digite el saldo a ingresar: ");
                        ingreso=sc.nextDouble();
                        cliente.ingresarDinero(indice, ingreso);
                        System.out.print("Saldo: " + cliente.consultarSaldo(indice));
                    }else{
                        System.out.println("La cuenta no existe");
                    }
                    
                    break;
                case 2://retirar dinero
                    System.out.print("Digite el numero de cuenta: ");
                    numCuenta=sc.nextInt();
                    indice=buscarCuenta(cuentas, numCuenta);
                    
                    if (indice!=-1) {
                        System.out.print("Digite el saldo a retirar: ");
                        retiro=sc.nextDouble();
                        if (cliente.consultarSaldo(indice)<retiro) {
                            System.out.println("Saldo insuficiente");
                        }else{
                            cliente.retirarDinero(indice, retiro);
                            System.out.print("Saldo: " + cliente.consultarSaldo(indice));
                        }
                    }else{
                        System.out.println("La cuenta no existe.");
                    }
                    break;
                case 3://consultar saldo
                    System.out.print("Digite el numero de cuenta: ");
                    numCuenta=sc.nextInt();
                    indice=buscarCuenta(cuentas, numCuenta);
                    
                    if (indice!=-1) {
                        System.out.print("Saldo: " + 
                                cliente.consultarSaldo(indice));
                    }else{
                        System.out.println("La cuenta no existe.");
                    }
                    break;
                case 4://salir
                    
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
            
        } while (opcion!=4);
        
    }
    
}
