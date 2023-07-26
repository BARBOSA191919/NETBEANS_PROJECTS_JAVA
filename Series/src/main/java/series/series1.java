package series;
import java.util.Scanner;
//generar 4,7,10,13
public class series1 {
    public static void  main(String[]args )  {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
    int n;
    n = entrada.nextInt();
    int c1=1;
    int c2 =4;
    while (c1<=n) 
    {
    System.out.println(c2);
    c1++;
    c2+=3;
    }
}
}
