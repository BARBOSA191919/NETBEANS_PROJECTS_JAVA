/*
//introduce un numero y decir si es multiplo de 3
*/

package Estructura_de_datos;
import java.util.Scanner;

public class Ejemplo2 {
      public static void  main(String[]args ) {
        Scanner entrada = new Scanner(System.in);
        int n, m ;
        System.out.println("iNGRESE UN NUMERO:");
        n = entrada.nextInt();
         System.out.println("INGRESE UN MULTIPLO:");
        m = entrada.nextInt();
        
        if( n % m == 0)
        {
        System.out.println("es multiplo");
    }
        else{
            System.out.println("no es multiplo");
        }
                    
        }
    
}
