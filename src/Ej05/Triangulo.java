/*
Ejercicio 5: Dise�ar un programa para trabajar con triangulos is�celes. 
Para ello defina los atributos necesarios que se requieren, proporcione
m�todos de consulta, un m�todo constructor e implemente m�todos para calcular
el per�metro y el �rea de un tri�ngulo, adem�s implementar un m�todo que a
partir de un arreglo de tri�ngulos devuelva el �rea del tri�ngulo de mayor 
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
