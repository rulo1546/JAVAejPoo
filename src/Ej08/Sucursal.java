/*
Ejercicio 8: Una empresa de env�o de paquetes tiene varias sucursales 
en todo el pa�s. Cada sucursal esta definida por su n�mero de sucursal, 
direcci�n y ciudad. Para calcular el precio que cuesta enviar cada paquete,
las sucursales tienen en cuenta el precio del paquete y la prioridad, 
sabiendo que se cobra un d�lar por kilo, 10 d�lares m�s si la prioridad es
alta y 20 si es express. Cada paquete enviado tendr� un n�mero de referencia
y el DNI de la persona que lo env�a.
*/
package Ej08;

public class Sucursal {
    //Atributos
    private int numeroSucursal;
    private String direccion;
    private String ciudad;
    
    //metodos

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String mostrarDatosSucursal(){
        return "\nNumero de sucursal: " + numeroSucursal + 
                "\nDireccion: " + direccion + 
                "\nCiudad: " + ciudad;
    }
    
    public double calcularPrecioPaquete(Paquete p){
        //prioridad normal=0    prioridad alta=+10  prioridad express+20
        double precioPaquete=p.getPeso();
        if (p.getPrioridad()==1) {
            precioPaquete+=10;
        }
        if (p.getPrioridad()==2) {
            precioPaquete+=20;
        }
        return precioPaquete;
    }
    
}
