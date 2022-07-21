/*

*/
package Ej07;

public class Cuenta {
//Atributos
    private int numeroCuenta;
    private double saldo;
    
    //metodos
    //constructor, get n cuenta, get saldo, ingresar dinero, retirar dinero
    public Cuenta(int numeroCuenta, double saldo){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }
    
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void ingresarDinero(double ingreso){
        saldo+=ingreso;
    }
    
    public void retirarDinero(double retiro){
        if (retiro<=saldo) {
            saldo-=retiro;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
