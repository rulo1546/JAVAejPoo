/*
Ejercicio 8: Una empresa de envío de paquetes tiene varias sucursales 
en todo el país. Cada sucursal esta definida por su número de sucursal, 
dirección y ciudad. Para calcular el precio que cuesta enviar cada paquete,
las sucursales tienen en cuenta el precio del paquete y la prioridad, 
sabiendo que se cobra un dólar por kilo, 10 dólares más si la prioridad es
alta y 20 si es express. Cada paquete enviado tendrá un número de referencia
y el DNI de la persona que lo envía.
*/
package Ej08;

import java.util.Scanner;

public class Main {
    
    public static int buscarPaquete(Paquete p[], int numeroPaquete, int contadorPaquete){
        int indice=0;
        boolean encontrado=false;
        
        for (int i = 0; i < contadorPaquete; i++) {
            if (p[i].getNumeroPaquete()==numeroPaquete) {
                indice=i;
                encontrado=true;
            }
        }
        if (encontrado==false) {
            indice=-1;
        }
        return indice;
    }
    
    public static int buscarSucursal(Sucursal s[], int numeroSucursal, int contadorSucursal){
        int indice=0;
        boolean encontrado=false;
        
        for (int i = 0; i < contadorSucursal; i++) {
            if (s[i].getNumeroSucursal()==numeroSucursal) {
                indice=i;
                encontrado=true;
            }
            if (encontrado==false) {
                indice=-1;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
             int numeroSucursal, prioridad, numeroPaquete, opcion,
                     contadorSucursal=0, contadorPaquete=0;
             String direccion, ciudad, dni;
             double peso, precioPaquete;
             
             Sucursal sucursales[]=new Sucursal[3];
             Paquete paquetes[]=new Paquete[20];
             
             do {
                 System.out.println("\n\t.:MENU:.");
                 System.out.println("1. Crear una sucursal");
                 System.out.println("2. Enviar un paquete");
                 System.out.println("3. Consultar sucursal");
                 System.out.println("4. Consultar paquete");
                 System.out.println("5. Mostrar todas las sucurles");
                 System.out.println("6. Mostrar todos los paquetes");
                 System.out.println("7. Salir");
                 System.out.print("Opcion: ");
                 opcion=sc.nextInt();
                 
                 switch (opcion) {
                     case 1://Crear una sucursal
                         System.out.print("\nNumero de sucursal: ");
                         numeroSucursal=sc.nextInt();
                         sc.nextLine();
                         System.out.print("Direccion: ");
                         direccion=sc.nextLine();
                         System.out.print("Ciudad: ");
                         ciudad=sc.nextLine();
                         
                         sucursales[contadorSucursal]=new Sucursal(numeroSucursal, direccion, ciudad);
                         contadorSucursal++;
                         break;
                     case 2://Enviar un paquete
                         System.out.print("Digite el numero de sucursal: ");
                         numeroSucursal=sc.nextInt();
                         int indice;
                         indice=buscarSucursal(sucursales, numeroSucursal, contadorSucursal);
                         if (indice!=-1) {
                             System.out.print("Numero de paquete: ");
                             numeroPaquete=sc.nextInt();
                             System.out.print("Digite el DNI de la persona que mando el paquete: ");
                             sc.nextLine();
                             dni=sc.nextLine();
                             System.out.print("Digite el peso del paquete: ");
                             peso=sc.nextDouble();
                             System.out.print("Digite la prioridad del paquete (0=normal, 1=alta, 2=express): ");
                             prioridad=sc.nextInt();
                             
                             paquetes[contadorPaquete]= new Paquete(numeroPaquete, dni, peso, prioridad);
                             
                             precioPaquete=sucursales[indice].calcularPrecioPaquete(paquetes[contadorPaquete]);
                             System.out.print("El precio del paquete es: " + precioPaquete + " $");
                             contadorPaquete++;
                         }else{
                             System.out.println("La sucursal no existe");
                         }
                         
                         break;
                     case 3: //Consultar sucursal
                         System.out.print("Digite el numero de sucursal: ");
                         numeroSucursal=sc.nextInt();
                         
                         indice=buscarSucursal(sucursales, numeroSucursal, contadorSucursal);
                         if (indice!=-1) {
                             System.out.print("Datos de la sucursal: ");
                             System.out.println(sucursales[indice].mostrarDatosSucursal());
                         }
                         
                         break;
                     case 4: //Consultar paquete
                         System.out.print("Digite el numero de paquete: ");
                         numeroPaquete=sc.nextInt();
                         indice=buscarPaquete(paquetes, numeroPaquete, contadorPaquete);
                         if (indice!=-1) {
                             System.out.println("Los datos del paquete son: ");
                             System.out.println(paquetes[indice].mostrarDatosPaquete());
                         }
                         
                         break;
                     case 5:// Mostrar todas las sucurles
                         System.out.println("Todas las sucursales: ");
                         for (int i = 0; i < contadorSucursal; i++) {
                             System.out.println("Sucursal N." + (i+1) + ":");
                             System.out.println(sucursales[i].mostrarDatosSucursal());
                         }
                         
                         break;
                     case 6://Mostrar todos los paquetes
                         System.out.print("Todos los paquetes: ");
                         for (int i = 0; i < contadorPaquete; i++) {
                             System.out.println("Paquete N." + (i+1) + ":");
                             System.out.println(paquetes[i].mostrarDatosPaquete());
                         }
                         
                         break;
                     case 7:
                         System.out.println("Salir.");
                         break;
                     default:
                         System.out.println("Elige otra opcion.");
                 }
                 
                 
            
        } while (opcion!=7);
        
    }
    
}
