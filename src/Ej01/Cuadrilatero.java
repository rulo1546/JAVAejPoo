/*
Ejercicio 1: Construir un programa que calcule el �rea y el per�metro de un 
cuadril�tero dada la longitud de sus dos lados. Los valores de la longitud
deber�n introducirse por l�nea de ordenes. Si es un cuadrado, s�lo se 
proporcionar� la longitud de uno de los lados al constructor.
*/
package Ej01;

public class Cuadrilatero {
    //Atributos 
    private double ladoA;
    private double ladoB;
    private double area;
    private double perimetro;
    
    //metodos 
    public Cuadrilatero(double ladoA, double ladoB){
        this.ladoA=ladoA;
        this.ladoB=ladoB;
    }
    
    public Cuadrilatero(double ladoA){
        this.ladoA=ladoA;
        this.ladoB=ladoA;
    }
    
    public void calcularArea(){
        area=ladoA*ladoB;
    }
    
    public void calcularPerimetro(){
        perimetro=2*(ladoA+ladoB);
    }
    
    public void mostrarResultados(){
        System.out.println("El area es: " + area + "\nEl perimetro es: " + perimetro);
    }
}
