/*
Ejercicio 1: Construir un programa que calcule el área y el perímetro de un 
cuadrilátero dada la longitud de sus dos lados. Los valores de la longitud
deberán introducirse por línea de ordenes. Si es un cuadrado, sólo se 
proporcionará la longitud de uno de los lados al constructor.
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
