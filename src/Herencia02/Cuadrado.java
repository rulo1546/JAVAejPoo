/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia02;

/**
 *
 * @author rulo2
 */
public class Cuadrado extends FiguraCerrada{
    private double area;
    
    public Cuadrado(double tama�o, int nLados, double area){
        super(tama�o, nLados);
        this.area=area;
    }
    
    public void dibujar(){
        System.out.println("Dibujando un cuadrado.");
    }
}
