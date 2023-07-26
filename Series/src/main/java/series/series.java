
package series;
import java.util.Scanner;
//generar impares
public class series {
     public static void  main(String[]args ) 
    {
        Scanner entrada = new Scanner(System.in);
        int n;
     System.out.println("Ingrese un numero:");
     n = entrada.nextInt();
     int c=1;
     int i = 0;
     while (c<=n)
     {
     i = 2 * c - 1;
     System.out.println(i);
     c++;
     
     }
}
}
