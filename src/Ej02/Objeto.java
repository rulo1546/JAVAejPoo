/*
Ejercicio 2: Construir un programa que permita dirigir el movimiento de un 
objeto dentro de un tablero y actualice su posici�n dentro del mismo. Los 
movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada 
movimiento el programa mostrar� la nueva direcci�n elegida y las coordenadas
de situaci�n del objeto dentro del tablero.
*/
package Ej02;
public class Objeto {
    //Atributos
    private int x;
    private int y; 
    
    //metodos 
    public Objeto(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    //mover arriba
    public void moverArriba(int cantidad){
        y+=cantidad;
    }
    //mover abajo
    public void moverAbajo(int cantidad){
        y-=cantidad;
    }
    //mover izquierda
    public void moverIzquierda(int cantidad){
        x-=cantidad;
    }
    //mover derecha
    public void moverDerecha(int cantidad){
        x+=cantidad;
    }
    //Mostrar poscicion
    public void mostrarPoscicion(){
        System.out.println("Posicion actual: ( " + x + " , " + y + " )");
    }
}
