package Ciclo_do_While;
import java.util.Scanner;
// sumar los digitos
public class suma_de_digitos {
     public static void main (String[]args) {
     Scanner entrada = new Scanner (System.in);
 int n;
 int s=0;
 int d; // digito
 System.out.println("ingrese un numero");
 n = entrada.nextInt();
 do{
     d= n% 10;
     s = s + d;
     n = n / 10;
     
 } while(n>0);
 System.out.println("la suma de los digitos es:" +s);
     }
}