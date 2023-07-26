
package Ciclo_While;
import java.util.Scanner;
/**
 *generar numeros naturales
 
 */

public class numeros_naturales {
     public static void main (String[]args) {
     Scanner entrada = new Scanner (System.in);

int n; //numero
int c=0;//contador
System.out.println("ingrese un numero:");
n = entrada.nextInt();
while (c<n)
{
System.out.println(c+".");
c++;
}
     
     }
    
}
