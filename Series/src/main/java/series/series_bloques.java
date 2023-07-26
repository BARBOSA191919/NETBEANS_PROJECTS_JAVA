package series;
import java.util.Scanner;
//generar 12345
// 1234
// 123
// 12
// 1
public class series_bloques {
      public static void  main(String[]args ) {
 Scanner entrada = new Scanner(System.in);
 int n,L;
          System.out.println("numero limite:");
          L = entrada.nextInt();
          for ( int c = 0; c<=L;c++)
          {
              n = c+1;
              while (n<= L)
              {
                  System.out.println(n - c);
                  n++;
              }
              System.out.println(" ");
}
}
}
