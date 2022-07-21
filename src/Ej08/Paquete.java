/*
Ejercicio 8: Una empresa de env�o de paquetes tiene varias sucursales 
en todo el pa�s. Cada sucursal esta definida por su n�mero de sucursal, 
direcci�n y ciudad. Para calcular el precio que cuesta enviar cada paquete,
las sucursales tienen en cuenta el precio del paquete y la prioridad, 
sabiendo que se cobra un d�lar por kilo, 10 d�lares m�s si la prioridad es
alta y 20 si es express. Cada paquete enviado tendr� un n�mero de referencia
y el DNI de la persona que lo env�a.
*/
package Ej08;
public class Paquete {
    //Atributos 
    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad;

    public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    public String mostrarDatosPaquete(){
        return "\nNumero de paquete: " + numeroPaquete + 
                "\nDNI: " + dni + 
                "\nPeso: " + peso + 
                "\nPrioridad: " + prioridad;
    }
    
}
