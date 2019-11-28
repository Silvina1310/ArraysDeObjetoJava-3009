
package arraysdeobjetojava.pkg3009;
import java.util.Scanner;


public class ArraysDeObjetoJava3009 {

    
    public static void main(String[] args) {
        //Variables
        String Nombre, Apellido;
        int Clave;
        
        //Define el tamaño del array
        System.out.println("Tamaño");
        Scanner read0 = new Scanner(System.in);
        int Tamaño = read0.nextInt();
        
        //Construye el array según el tamaño definido por el usuario
        Persona [] Personas = new Persona [Tamaño];
        
        //Llenamos el array
        for (int i = 0; i<Personas.length;i++){
            Scanner read = new Scanner(System.in);
            System.out.println("Nombre:");
            Nombre = read.nextLine();
            System.out.println("Apellido:");
            Apellido = read.nextLine();
            System.out.println("Clave:");
            Clave = read.nextInt();
            Personas[i] = new Persona(Nombre, Apellido, Clave);
        }
        
        for (int i = 0; i<Personas.length;i++){
           /**System.out.println(Personas[i].getNombre() + " " +
                   Personas[i].getApellido() + " " + 
                   Personas[i].getClave());**/
            System.out.println(Personas[i].toString()); 
            //esto invoca al método toString
        }
            
        
        
        
    }
    
}
