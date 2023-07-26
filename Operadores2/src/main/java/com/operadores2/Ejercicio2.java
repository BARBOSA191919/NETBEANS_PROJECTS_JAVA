package com.operadores2;
import java.util.Scanner;

//obtener el primr digito de un número
public class Ejercicio2 {
    //n = numero
    //u = primer digito
    public static void  main(String[]args )  {
        
 //primer digito
        Scanner entrada = new Scanner(System.in);
        int n, p ;
        System.out.println("ingrese un numero:");
        n = entrada.nextInt();
        
        p = n / 10;
                System.out.println("El primer digito es:" +p);
        
          }
}