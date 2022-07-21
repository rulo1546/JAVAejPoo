/*

*/
package ClasesyObjetos5;

public class Persona {

    //Atributos 
    
    String nombre;
    int edad;
    String apodo;
    
    //Metodos
    
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public Persona(String apodo){
        this.apodo=apodo;
    }
    
    public void correr(){
        System.out.println("Me llamo " + nombre + " tengo " + edad + 
                " años y estoy corriendo");
    }
    
    public void correr(int km){
        System.out.println("Estoy corriendo " + km + " km ");
    }
}
