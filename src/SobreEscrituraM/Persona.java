/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobreEscrituraM;

/**
 *
 * @author rulo2
 */
public class Persona extends Animal{
    
    //se sobre escribio un metodo, mismo nombre, pero hace cosas diferentes
    @Override
    public void comer(){
        System.out.println("Estoy comiendo en la mesa con cubiertos");
    }
}
