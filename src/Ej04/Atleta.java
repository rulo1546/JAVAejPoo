/*
 Construir un programa para una competencia de atletismo, el programa 
debe gestionar una serie de atletas caracterizados por su número de atleta, 
nombre y tiempo de carrera, al final el programa debe mostrar los datos 
del atleta ganador de la carrera.
*/
package Ej04;
public class Atleta {
    //Atributos 
    
    private int numAtleta;
    private String nombre;
    private double tiempoDeCarrera;
    
    //metodos
    
    public Atleta (int numAtleta, String nombre, double tiempoDeCarrera){
        this.numAtleta=numAtleta;
        this.nombre=nombre;
        this.tiempoDeCarrera=tiempoDeCarrera;
    }
    
    public double getTiempoCarrera(){
        return tiempoDeCarrera;
    }
    
    public void mostrarDatosAtleta(){
        System.out.println("Numero de atleta: " + numAtleta );
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo de carrera: " + tiempoDeCarrera);
    }
}
