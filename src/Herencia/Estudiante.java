/*

*/
package Herencia;


public class Estudiante extends Persona{
    private String codigoEstudiante;
    private double calificacion;
    
    public Estudiante(String nombre, String apellido, int edad, String codigoEstudiante, double calificacion){
       super(nombre, apellido, edad);
       this.codigoEstudiante=codigoEstudiante;
       this.calificacion=calificacion;
    }
    
    public String getCodigoEstudiante(){
        return codigoEstudiante;
    }
    
    public double getCalificacion(){
        return calificacion;
    }
    
    public String mostrarDatos(){
        return "Nombre: " + getNombre() +
                "\nApellido: " + getApellido()
                + "\nEdad: " + getEdad()
                + "\nCodigo de estudiante: " + codigoEstudiante
                + "\nCalificacion: " + calificacion;
    }
}
