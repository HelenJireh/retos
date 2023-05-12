public class Reto_4 {
    public static void main(String[] args) {
        // declarar variables
        String juego;
        String maquina

        //declarar instancia de clase para usuario
        Scanner leer=new Scanner(System.in);
        
        // clase random para maquina
        Random random=new Random();

        // capturar datos maquina
        int maquina = random.nextInt();

        System.out.println("Escribir Papel, Piedra o Tijeras");
       
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
              
             
    }
    
}
