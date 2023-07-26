package ciclo_for;
import java.util.Scanner;

//pedir 5 numeros y escribir la suma total
    public class suma_numeros_5 {
      public static void main (String[]args) {
Scanner entrada = new Scanner (System.in);
      
      int n = 0;
      int s=0;
      for(int c=1; c<=5;c++)
      {
      System.out.println("Ingrese un numero");
      n =entrada.nextInt();
         s = s+ n;
      }
   System.out.println("Suma total es"+s);
      }
    }

 