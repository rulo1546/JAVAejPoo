/*

*/
package Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
    private int carga;
    
    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga){
        super(matricula, marca, modelo);
        this.carga=carga;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo" + modelo);
        System.out.println("Carga: " + carga);
    }
    
}
