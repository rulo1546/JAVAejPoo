/*

*/
package Ej07;

public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private String DNI;
    private Cuenta cuentas[];
    
    //metodos
    
    public Cliente(String nombre, String apellido, String DNI, Cuenta cuentas[]){
        this.nombre=nombre;
        this.apellido=apellido;
        this.DNI=DNI;
        this.cuentas=cuentas;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getDNI(){
        return DNI;
    }
    
    public double consultarSaldo(int indiceCuenta){
        double saldo;
        saldo=cuentas[indiceCuenta].getSaldo();
        return saldo;
    }
    
    public void ingresarDinero(int numeroCuenta, double ingreso){
        cuentas[numeroCuenta].ingresarDinero(ingreso);
    }
    
    public void retirarDinero(int indiceCuenta, double retiro){
        cuentas[indiceCuenta].retirarDinero(retiro);
    }
}
