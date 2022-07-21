/*

*/
package ClassYMetAbstract;


public class Main {
    public static void main(String[] args) {
        //SerVivo servivo=new SerVivo(); no se puede porque es una clase abstracta
        Planta planta=new Planta();
        
        //Animal animal=new Animal(); no se puede porque es una clase abstracta
        
        AnimalCarnivoro animalC=new AnimalCarnivoro();
        
        
        
        AnimalHerbivoro animalH=new AnimalHerbivoro();
        
        animalC.alimentarse();
        
        animalH.alimentarse();
        
        planta.alimentarse();
    }
    
}
