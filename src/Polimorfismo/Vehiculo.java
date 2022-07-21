/*

*/
package Polimorfismo;


public class Vehiculo {
    
    //Atributos
    protected String matricula;
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String matricula, String marca, String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
    }
    
    public void mostrarDatos(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo" + modelo);
    }
    
}
