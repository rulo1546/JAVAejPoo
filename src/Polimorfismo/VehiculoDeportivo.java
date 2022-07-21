/*

*/
package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;
    
    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada){
        super(matricula, marca, modelo);
        this.cilindrada=cilindrada;
    }
    
    public void mostrarDatos(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo" + modelo);
        System.out.println("Cilindrada: " + cilindrada);
    }
}
