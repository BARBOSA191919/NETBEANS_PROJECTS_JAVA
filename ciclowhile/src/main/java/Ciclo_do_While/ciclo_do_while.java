package Ciclo_do_While;
import java.util.Scanner;
// numeros naturales
public class ciclo_do_while {
     public static void main (String[]args) {
     Scanner entrada = new Scanner (System.in);
     int n;
     int c=0;
     System.out.println("ingrse un numero:");
     n = entrada.nextInt();
     do{
         System.out.println(c+".");
         c++;
     } while (c<n);
      
     
     }
     
}
