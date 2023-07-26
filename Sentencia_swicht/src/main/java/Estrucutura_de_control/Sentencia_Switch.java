
package Estrucutura_de_control;
import java.util.Scanner;



public class Sentencia_Switch {
      public static void  main(String[]args ) {
        Scanner entrada = new Scanner(System.in);
      
      System.out.println("Ingrese un numero");
      int semana = 7;
      
      String dia;
      switch (semana)
      {
      
          case 1:
              dia = "domingo";
              break; 
              case 2:
              dia = "Lunes";
              break; 
              case 3:
              dia = "Martes";
              break; 
              case 4:
              dia = "Miercoles";
              break; 
              case 5:
              dia = "Jueves";
              break; 
              case 6:
              dia = "Viernes";
              break; 
              case 7:
              dia = "Sabado";
              break; 
              default:
                  dia="no existe es de día";
                 
      }
      
      System.out.println("el dia "+semana+", es "+ dia);
      
      }
    
}
