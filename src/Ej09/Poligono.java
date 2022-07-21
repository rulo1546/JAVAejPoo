/*

*/
package Ej09;

public abstract class Poligono {
    protected int nLados;
    
    public Poligono(int nLados){
        this.nLados=nLados;
    }
    public abstract double getArea();

    @Override
    public String toString() {
        return "Numero de lados: " + nLados;
    }

}
