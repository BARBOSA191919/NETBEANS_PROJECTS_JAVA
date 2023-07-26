package ciclo_for;
import java.util.Scanner;
//pedir un numero (que debe estar entre 0 y 10)
// y mostrar la tabla de multiplicar de dicho numero

public class numero_0_10 {
     public static void main (String[]args) {
Scanner entrada = new Scanner (System.in);
int n ;
do {
  System.out.println("Ingrese un numero(0 a 10)");
  n = entrada.nextInt();
}while (!( 0 <= n && n <=10));
for (int c = 1; c <=10; c++)
{
    System.out.println(n+"x" +c+" = "+n * c);
}
     }
}
