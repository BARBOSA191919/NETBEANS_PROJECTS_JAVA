
package com.operadores2;
import java.util.Scanner;

public class Sentencia_switch {
     public static void  main(String[]args ) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("calculadora");
        System.out.println("a.suma");
        System.out.println("b.resta");
        System.out.println("c.multipliacion");
        System.out.println("d.division");
     
   char menu;
   menu = entrada.next().charAt(0);
     double n1,n2,s,r,m,d ;
     switch(menu)
     {
         case 'a':
             System.out.println("suma");
             System.out.println("Ingrese un numero: ");
             n1=entrada.nextDouble();
             System.out.println("ingrese otro numero:");
             n2=entrada.nextDouble();
             s = n1 +n2 ;
             System.out.println("respuesta: "+s);
             break;
             case 'b':
             System.out.println("resta");
             System.out.println("Ingrese un numero: ");
             n1=entrada.nextDouble();
             System.out.println("ingrese otro numero:");
             n2=entrada.nextDouble();
             r = n1 - n2 ;
             System.out.println("respuesta: "+r);
             break;
              case 'c':
             System.out.println("multiplicacion");
             System.out.println("Ingrese un numero: ");
             n1=entrada.nextDouble();
             System.out.println("ingrese otro numero:");
             n2=entrada.nextDouble();
             m = n1 * n2 ;
             System.out.println("respuesta: "+m);
             break;
              case 'd':
             System.out.println("division");
             System.out.println("Ingrese un numero: ");
             n1=entrada.nextDouble();
             System.out.println("ingrese otro numero:");
             n2=entrada.nextDouble();
             d = n1 / n2 ;
             System.out.println("respuesta: "+d);
             break;
     }
     }
}
