/*
Ejercicio 8: Una empresa de envío de paquetes tiene varias sucursales 
en todo el país. Cada sucursal esta definida por su número de sucursal, 
dirección y ciudad. Para calcular el precio que cuesta enviar cada paquete,
las sucursales tienen en cuenta el precio del paquete y la prioridad, 
sabiendo que se cobra un dólar por kilo, 10 dólares más si la prioridad es
alta y 20 si es express. Cada paquete enviado tendrá un número de referencia
y el DNI de la persona que lo envía.
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
