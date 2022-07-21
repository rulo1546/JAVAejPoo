/*

*/
package Ej09;


public class Rectangulo extends Poligono{
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        super(2);
        this.base=base;
        this.altura=altura;
    }
    
    @Override
    public double getArea(){
        double area;
        area=base*altura;
        return area;
    }
    
    public String toString(){
        return "\nRectangulo:\nBase: " + base + "\nAltura: " + altura + "\nArea: " + getArea() +"\n"+ super.toString();
    }
    
    
}
