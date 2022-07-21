/*

*/
package Ej09_2;

public abstract class Poligono {
    //Atributos
    protected int nLados;
    
    public Poligono(int nLados){
        this.nLados=nLados;
    }

    @Override
    public String toString() {
        return "Numero de lados: " + nLados;
    }
    
    public abstract double getArea();
    
    
}
