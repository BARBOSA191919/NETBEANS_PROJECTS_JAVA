package Ciclo_While;
import java.util.Scanner;
/**
 *generar numeros pares
 
 */

public class numeros_pares {
     public static void main (String[]args) {
     Scanner entrada = new Scanner (System.in);
     int n,p;
     int c=0;
     System.out.println("ingrese un numero:");
     n=entrada.nextInt();
     while (c<=n)
     {
     p = 2* c - 2;
     System.out.println(p+".");
     c++;
      
     }
             
     }
}