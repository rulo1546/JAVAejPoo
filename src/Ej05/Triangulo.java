/*
Ejercicio 5: Diseñar un programa para trabajar con triangulos isóceles. 
Para ello defina los atributos necesarios que se requieren, proporcione
métodos de consulta, un método constructor e implemente métodos para calcular
el perímetro y el área de un triángulo, además implementar un método que a
partir de un arreglo de triángulos devuelva el área del triángulo de mayor 
superficie.
*/
package Ej05;
public class Triangulo {
    //Atributos 
    private double base;
    private double lado;
    
    public Triangulo(double base, double lado){
        this.base=base;
        this.lado=lado;
    }
    
    public double getBase(){
        return base;
    }
    
    public double getLado(){
        return lado;
    }
    
    public double getPerimetro(){
        double perimetro=(2*lado)+base;
        return perimetro;
    }
    
    public double getArea(){
        double altura=Math.sqrt(Math.pow(lado, 2)-(Math.pow(base, 2)/4));
        double area=(base*altura)/2;
        return area;
    }
    

}
