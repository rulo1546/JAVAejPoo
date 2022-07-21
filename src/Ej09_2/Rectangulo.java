/*

*/
package Ej09_2;


public class Rectangulo extends Poligono{
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        super(2);
        this.base=base;
        this.altura=altura;
    }
    
    public double getArea(){
        double area=base*altura;
        return area;
    }

    @Override
    public String toString() {
        return "\nRectangulo: " + super.toString() + "\nbase=" + base + "\naltura=" + altura;
    }
    
    
    
}
