import java.util.Scanner;

public class Reto_7 {
    public static void main(String[] args) {
          
       //declarar variables
        int cantidadDinero=0;
        int cantidadVecesJuego=0;

        //instanciar clase
        Scanner leer=new Scanner(System.in);

        //solicitar datos 
        System.out.println("Ingrese cantidad de dinero");
        //capturar datos
        cantidadDinero=Scanner.nextInt();

        //Ciclo
        while (cantidadVecesJuego>=0) {
            if (cantidadVecesJuego == Gano) {
               System.out.println("Usted gano"+cantidadDinero++);
            }else:
            System.out.println("Usted perdio"+cantidadDinero--);
            
        }
    }
}
