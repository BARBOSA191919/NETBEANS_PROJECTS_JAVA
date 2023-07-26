package series;
import java.util.Scanner;
// geberar 21131141115...

public class series_con_ciclo {
      public static void  main(String[]args ) {
        Scanner entrada = new Scanner(System.in);
      int n;
      n = entrada.nextInt();
      int c1 = 0;
      int c2 = 0;
      int uno = 2;
      int t = 2;
      while (c1<=n)
      {
          System.out.print(t);
          if (c2<uno)
          {
              t=1;
              c2++;
          }
          else{
              uno++;
              t = uno;
              c2 =0;
          }
          c1++;
      }
 }
}
