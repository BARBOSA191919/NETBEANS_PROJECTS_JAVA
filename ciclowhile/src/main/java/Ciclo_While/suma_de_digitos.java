package  Ciclo_While;
import java.util.Scanner;
/**
 *suma de digitos
 */

public class suma_de_digitos {
     public static void main (String[]args) {
     Scanner entrada = new Scanner (System.in);
int n,d;
int s = 0; //s (contador)suma
System.out.println("Ingrese un numero");
n = entrada.nextInt();
while (n>0)
{
d = n % 10;
n = n /10;
s = s + d;

}
         System.out.println("la suma de los difitos es:"+s);
     }


}