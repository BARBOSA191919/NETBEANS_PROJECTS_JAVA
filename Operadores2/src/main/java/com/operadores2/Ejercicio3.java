
package com.operadores2;

import java.util.Scanner;

//introducir 3 digitos y conbinarlos en uno
public class Ejercicio3 {
    
    public static void main(String[] args){
        
 Scanner entrada = new Scanner(System.in);
 
     
 int a,b,c;
 int n;
 int x,y,z;
 System.out.println("ingrese el primer digito");
 a = entrada.nextInt();
  System.out.println("ingrese el segudno digito");
 b = entrada.nextInt();
  System.out.println("ingrese el tercer digito");
  c = entrada.nextInt();
  
  x = a *10*10;
  y = b * 10;
  z = c * 1 ;
  n = x + y +z;
  System.out.println("El numero es:" +n);
 
 
    }
}

