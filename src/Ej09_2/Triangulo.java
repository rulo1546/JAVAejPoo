/*

*/
package Ej09_2;


public class Triangulo extends Poligono{
    
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(double lado1, double lado2, double lado3){
        super(3);
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }
    
    @Override
        public double getArea(){
        double perimetro;
        perimetro=lado1+lado2+lado3;
        double s=(perimetro/2);
        double area;
        area=Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return area;
    }

    @Override
    public String toString() {
        return "\nTriangulo: " +"\n" +super.toString()+ "\nlado1=" + lado1 + "\nlado2=" + lado2 + "\nlado3=" + lado3;
    }
        
        
}
