/*

*/
package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculos[]=new Vehiculo[4];
        
        vehiculos[0]=new Vehiculo("H2P7S", "Chevy", "2020F");
        vehiculos[1]=new VehiculoTurismo("N9P1S", "Toyota", "2015L", 2);
        vehiculos[2]=new VehiculoDeportivo("FAST", "Ferrari", "2021X", 500);
        vehiculos[3]=new VehiculoFurgoneta("PFTS", "A2", "1990", 500);
        
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("");
            vehiculos[i].mostrarDatos();
        }
        
        
        //upCasting sube 
        
        VehiculoTurismo vehiculoTurismo=new VehiculoTurismo("HF5R3", "Turismo", "2021", 2);
        //de objeto VehiculoTurismo
        //subio a objeto Vehiculo
        Vehiculo vehiculo=vehiculoTurismo;
        System.out.println("\nUpCasting");
        vehiculo.mostrarDatos();
        
        
        //downCasting
        
        //ahora vamos a bajar de Vehiculo a vehiculoTurismo
        
        VehiculoTurismo vehiculoTurismoD=(VehiculoTurismo)vehiculo;
        
        //paso de ser un vehiculo, a ser un vehiculoTurismo
    }
    
}
