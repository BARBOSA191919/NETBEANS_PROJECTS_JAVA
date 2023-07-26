package ciclo_for;
import java.util.Scanner;

//contar numeros de 5 en 5
public class numeros_de_5_5 {
      public static void main (String[]args) {
Scanner entrada = new Scanner (System.in);
      
      int n; 
          System.err.println("Ingrese un numero:");
          n = entrada.nextInt();
          for (int c=0; c<=n;c+=5)
          {
          System.out.println(c);
          }
      
}
}
