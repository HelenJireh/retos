import java.util.Scanner;

public class Reto_6 {
     public static void main(String[] args) {
          //declarar variables
          int cantidadProductos;
          int totalProductos;
     
          //instanciar clase
          Scanner leer=new Scanner(System.in);

          //solicitar datos
          System.out.println("Ingrese la cantidad de productos");
          //capturar datos
          cantidadProductos=Scanner.nextInt();

          //ciclo
          for(int i= 0; i<=cantidadProductos;i++){
            System.out.print("Ingrese el precio del producto " + i + ": ");
            totalProductos+=precio;
          }
         System.out.println("El tota de la compra es:"+totalProductos);
        
    }
}
