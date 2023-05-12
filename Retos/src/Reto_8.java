import java.util.Scanner;

public class Reto_8 {
    public static void main(String[] args) {
        //declarar variables
        int nJuegosGanados=0;
        int nJuegosJugados; 
        String maquina;
        //declara instancia de la clase
        Scanner leer=new Scanner(System.in);

         //solicitar datos
        System.out.println("Por favor ingresa tu elección:");
        System.out.println("1 - Piedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tijera");

        //capturar datos
        =Scanner.next();

        //condicion
        switch (maquina):
              case 1:
                 maquina ="Papel";
               break;
               
               case 2:
                 maquina = "Piedra";
                 break;

                 case 3:
                 maquina = "Tijeras";
                 break;

              System.out.println("la maquina elijio"+ maquina);

              //ciclo
              do{
                 System.out.println("Vover a jugar");
              }while(nJuegosJugados<3)
    }
}
