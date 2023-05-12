import java.util.Random;
import java.util.Scanner;

public class Reto_3 {
    public static void main(String[] args) {
       
    //declarar variables 
    string moneda;

    // simulacion del lanzaminto de la moneda
    int numeroAleatorio=Random.nextInt(2);//genera numero aleatorio
    String resultado=(numeroAleatorio==0) "cara" : " sello";
          System.out.println("Resultado" + resultado);

   //declarar instancia de clase
   Scanner leer=new Scanner(System.in);

   // declarar la clase random
     Random random=new Random();
      //solicitar datos
     System.out.println("Elija cara o sello");
     //captura datos
     moneda=Scanner.next();


     // condicion
     //equalsIgnoreCase compara dos cadenas de texto ignorando las mayúsculas y minúsculas.
     if (moneda.equalsIgnoreCase(resultado)){
        System.out.println("¡Ganaste!");
    } else {
        System.out.println("¡Perdiste!");
    }


}
}