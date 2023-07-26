
package com.operadores2;
import java.util.Scanner;

//obtener el ultimo digito de un número
public class Ejercicio1 {
    //n = numero
    //u = ultimo digito
    public static void  main(String[]args )  {
        Scanner entrada = new Scanner(System.in);
        
        int n, u;
        System.out.println("digite un numero");
        n = entrada.nextInt();
        u = n % 10;
        System.out.println("el ultimo digito es:" +u);
    }
}

