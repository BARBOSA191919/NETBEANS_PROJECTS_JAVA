
 //pedir dos numeros y decir cual es el mayor o si son iguales.
package Estructura_de_datos;
import java.util.Scanner;

public class Ejemplo3 {
       public static void  main(String[]args ) {
        Scanner entrada = new Scanner(System.in);
       int n1,n2;
       System.out.println("Ingrese el primer numero");
       n1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
       n2 = entrada.nextInt();
       
       if(n1 == n2)
       {
       System.out.println("Son iguales");     
       }
       else    
       {
        if(n1 > n2)
               {
            System.out.println(n1+" es mayor que "+n2);
               }
               else
               {
               System.out.println(n2+" es mayor que "+n1);
               }
               
               }
               
       
       }
       }
       
       

