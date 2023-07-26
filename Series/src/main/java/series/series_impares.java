package series;
import java.util.Scanner;

public class series_impares {
     public static void  main(String[]args ) {
 Scanner entrada = new Scanner(System.in);
 int n;
 n = entrada.nextInt();
 for(int c1 = 1; c1 <= n; c1++){
     for(int c2 = 1; c1 * 2 >= c2; c2++)
     {
         if ((c2 % 2) !=0)
         {
             System.out.println(c2);
     }
    
     }
 
 }
}
}

