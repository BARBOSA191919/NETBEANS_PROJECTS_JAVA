/*
introduce un numero y verificar si es par o impar
*/
package Estructura_de_datos;
import java.util.Scanner;

public class Ejemplo1 {
    
     public static void  main(String[]args ) 
    {
        Scanner entrada = new Scanner(System.in);
        int n ;
        System.out.println("Ingrese un numero");
        n = entrada.nextInt();
        if(n % 2 == 0)
        {
        System.out.println("Es par");
        }
        else {
                System.out.println("es impar");
                }
        }
        
        }
            

