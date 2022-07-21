/*
 
*/
package Polimorfismo;

public class VehiculoTurismo extends Vehiculo{
    private int nPuertas;
    
    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas){
        super(matricula, marca, modelo);
        this.nPuertas=nPuertas;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo" + modelo);
        System.out.println("Numero de puertas: " + nPuertas);
    }
}
