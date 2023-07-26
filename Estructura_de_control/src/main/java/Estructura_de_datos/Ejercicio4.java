//ingrese 3 numeros y ordenarlos 
package Estructura_de_datos;
import java.util.Scanner;

public class Ejercicio4 {
    
      public static void  main(String[]args ) {
        Scanner entrada = new Scanner(System.in);
      int a,b,c;
              System.out.println("Ingrese valor de a:");
              a = entrada.nextInt();
              System.out.println("Ingrese valor de b:");
              b = entrada.nextInt();
              System.out.println("Ingrese valor de c:");
              c = entrada.nextInt();
              
            if(a>b && b >c)
            {
            System.out.println(a+" , "+b+" , "+c);
            }
            else
            {
            if(a>c && c>b)
            {
              System.out.println(a+" , "+c+" , "+b);
            }
            else
            {
            if(a<b && c>a)
            
            {
            System.out.println(b+" , "+c+" , "+b);
            }
            else
            {
                if(b>a && b<c)
             
                {
             System.out.println(b+" , "+b+" , "+a);
            }
                else
                {
                  if(c>a && a>b)
   
                  {
                     System.out.println(a+" , "+b+" , "+a); 
                  }
                  
                  else
                  {
                      
                        if(b<c && c>a)
                        {
                      {
                   System.out.println(b+" , "+a+" , "+a); 
                   
                                 
                      }
                        }
                  }
                }
            }
            }
            }
      }
}
  