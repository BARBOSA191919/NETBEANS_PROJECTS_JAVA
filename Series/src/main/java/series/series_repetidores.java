package series;
import java.util.Scanner;
// generar 765765765765....
public class series_repetidores {
    public static void  main(String[]args ) {
        Scanner entrada = new Scanner(System.in);
    int n;
     n=entrada.nextInt();
     int c = 0;
     int w = 7; //interreuptor
     while (c<=n)
     {
     System.out.println(w);
     if (w>5)
     {
    w--;
    }
     else
     {
         w = 7;
     }
     c++;
}    
}
}
