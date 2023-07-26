
package com.operadores2;

import java.util.Scanner;
//dividir un numero de 3 digitos y asignar posicon
public class Ejercicio4 {
    public static void  main(String[]args )  {
        //dp primer digito
        //dm digito intermedio
        //du ultimo digito
        //n numero
        Scanner entrada = new Scanner(System.in);
    int n,dp,dm,du;
    System.out.println("Ingrese un numero: ");
    n = entrada.nextInt();
    
    du = n % 10;
    n = n / 10;
    dm = n % 10;
    n = n / 10;
    dp = n % 10;
    n = n /10;

System.out.println("digito primero" + dp);
System.out.println("digito intermedio" + dm);
System.out.println("ultimo digito" + du);
    
    
    
    
    }
}
