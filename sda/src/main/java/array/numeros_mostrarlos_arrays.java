package array;
import java.util.Scanner;
// leer 5 numeros y mostrarlos en el mismo orden introducido
public class numeros_mostrarlos_arrays {
      public static void  main(String[]args ) {
 Scanner entrada = new Scanner(System.in);
     int [] array = new int [5];
     for (int c = 0 ; c< 5;c++)
     {
         System.out.println("ingerese un numero");
         array[c] = entrada.nextInt();
        
     }
     System.out.println("los numeros son");
     for (int c = 0; c <5; c++)
     {
      {
          System.out.println(array[c]);
      }
}
}
}