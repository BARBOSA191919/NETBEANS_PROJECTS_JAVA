package Estructura_de_datos;
import java.util.Scanner;

// verificar si el numero es positivo o negativo
public class Ejemplos_if_else {
   
    public static void  main(String[]args ) 
    {
        Scanner entrada = new Scanner(System.in);
        int n;  //numero
         System.out.println("ingrese un numero:");
         
        n = entrada.nextInt();
        
        if( n > 0 )
        {
        System.out.println("el numero es Positivo");
     
        }
        else
        {
        System.out.println("el numero es negativo");
        
        }
        
        
      
        
    }
   
}