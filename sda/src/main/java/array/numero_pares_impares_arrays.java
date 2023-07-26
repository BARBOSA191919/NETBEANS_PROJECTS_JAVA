package array;
import java.util.Scanner;
// realiza un programa que pida 6 numeros enteros y queluego muestre esso 
//numeros junto con la palabra "par" o "impar" segun proceda.
public  class numero_pares_impares_arrays {
       public static void  main(String[]args ) {
 Scanner entrada = new Scanner(System.in);
 int [] numero = new int [6];
 System.out.println("ingrese 6 numeros:");
 for( int c=0; c <6; c++)
 {
     numero [c] = entrada.nextInt ();
 }
 for (int c = 0 ; c<6;c++)
 {
     if (numero[c]%2 == 0)    
 {
     System.out.println(numero[c]+" = par");
 }
 else
 
 { 
  
  System.out.println(numero [c]+ " = impar");       
         
 }
  }
 }
 }

