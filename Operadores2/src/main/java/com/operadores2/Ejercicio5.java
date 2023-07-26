package com.operadores2;

import java.util.Scanner;
//area de un circulo

public class Ejercicio5 {
    public static void  main(String[]args )  {
      
        Scanner entrada = new Scanner(System.in);
        
        double A,r;
        System.out.println("Ingrese el valor del radio");
        r = entrada.nextDouble();
        A = Math.PI * Math.pow(r, 2);
        System.out.println("El area del circulo es" +A);
        
    }

}
