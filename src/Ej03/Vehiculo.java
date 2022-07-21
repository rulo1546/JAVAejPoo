/*
Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados
por su marca, modelo y precio, imprima las propiedades del vehículo más barato.
Para ello, se deberán leer por teclado las características de cada vehículo
y crear una clase que represente a cada uno de ellos.
*/
package Ej03;

public class Vehiculo {
    //atributos 
    private String marca;
    private String modelo;
    private double precio;
    
    //metodos
    
    public Vehiculo(String marca, String modelo, double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void mostrarCaracteristicas(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
    }
}
