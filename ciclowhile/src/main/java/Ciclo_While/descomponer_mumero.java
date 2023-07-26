package  Ciclo_While;
import java.util.Scanner;
/**
 *descomponer numero
 
 */

public class descomponer_mumero {
     public static void main (String[]args) {
     Scanner entrada = new Scanner (System.in);
     
     int n,d;
     int c = 0;
     System.out.println("ingrese un numero:");
     n =  entrada.nextInt();
     while (n>0)
     {
     d = n % 10;
     n = n / 10;
     c++;
     
     }
     System.out.println("numero de digitos es:" +c);
    
     }
     }