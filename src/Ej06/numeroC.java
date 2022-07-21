/*
Ejercicio 6: Construir un programa para trabajar con 2 números complejos,
implemente el siguiente menú:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. Comprar 2 números complejos (iguales o no) 
4. Multiplicar un número complejo por un entero
*/
package Ej06;


public class numeroC {
    //Atributos
    private int a;
    private int bi;
    
    //metodos
    public numeroC(int a, int bi){
        this.a=a;
        this.bi=bi;
    }
    
    public int getA(){
        return a;
    }
    
    public int getBi(){
        return bi;
    }
    
    //Sumar 2 numeros complejos.
    public void sumar(numeroC num){
        a+=num.a;
        bi+=num.bi;
    }
    
    //multiplicar 2 numeros complejos
    //numero 1 = 3 + 4i
    //numero 2 = 2 + 5i 
    //mult = (3*2 - 4*5) + (3*5 + 4*2)
    
    public void multiplicar(numeroC num){
        a=(a*num.a)-(bi*num.bi);
        bi=(a*num.bi)+(bi*num.a);
    }
    
    //comprar 2 numeros complejos iguales o no 
    public boolean comprar(numeroC num){
        boolean iguales=false;
        if (a==num.a && bi==num.bi) {
            iguales=true;
        }else{
            iguales=false;
        }
        return iguales;
    }
    
    //Multiplicar un número complejo por un entero
    
    public void multiplicarXentero(int entero){
        a*=entero;
        bi*=entero;
    }
    
    public void mostrarValor(){
        System.out.println(a + " + " + bi + "i");
    }


}
