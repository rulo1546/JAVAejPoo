/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia02;

/**
 *
 * @author rulo2
 *///Si le pones final a esta clase, ya no puede tener hijas :C 
/*final*/ public class FiguraCerrada extends Figura{
    private int nLados;
    
    public FiguraCerrada(double tamaño, int nLados){
        super(tamaño);
        this.nLados=nLados;
    }
    
    public /*final*/ void dibujar(){
        System.out.println("Dibujo figura cerrada");
    }//si le pones final a este metodo, su hija (cuadrado) no podra 
    //implementar el metodo con el mismo nombre
    //se tendria que llamar dibujar2 
}
