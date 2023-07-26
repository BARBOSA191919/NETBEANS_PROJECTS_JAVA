package Ciclo_do_While;
import java.util.Scanner;
// numeros impares
public class numero_pares {
     public static void main (String[]args) {
     Scanner entrada = new Scanner (System.in);
     int n;
     int c=1;
     int p; // pares
     System.out.println("Ingrese un numero:");
     n = entrada.nextInt();
     do{
         p = 2 * c - 2;
         System.out.println(p+".");
         c++;
     } while (c<=n);
     
     }
     
     }