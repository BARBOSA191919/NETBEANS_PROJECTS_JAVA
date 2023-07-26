package array;
import java.util.Scanner;
//invertir el array
public class invertir_el_array {
       public static void  main(String[]args ) {
 Scanner entrada = new Scanner(System.in);
      int [] arreglo = new int [8];
      for ( int c = 0; c <8; c++)
      {
          
          arreglo [c] = entrada.nextInt();
      }
 System.out.println("invertido");
 for ( int c = 7; c>= 0 ; c--)
 {
     System.out.println(arreglo[c]);
 }
         
 }
}

