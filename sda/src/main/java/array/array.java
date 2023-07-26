package array;
import java.util.Scanner;

public class array {

     public static void  main(String[]args ) {
 Scanner entrada = new Scanner(System.in);
     
 int[] numero = new  int[5];
  numero[0] = 1 ;
  numero[1] = 2 ;
  numero[2] = 3 ;
  numero[3] = 4 ;
  numero[4] = 5 ;
  System.out.println(numero[2]);
  
  for(int c=0; c <5;c++)
  {
      System.out.println(numero[c]);
  }
     
     }
}
