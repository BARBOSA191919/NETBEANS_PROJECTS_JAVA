package ciclo_for;
 import java.util.Scanner;
//generar pares
public class numeros_pares {
    public static void main (String[]args) {
Scanner entrada = new Scanner (System.in);

int n; //limite
int c =1; //contador
int p;
System.out.println("ingrese un numero:");
n = entrada.nextInt();
for(c=1; c<=n;c++)
{
    p = 2* c-2;
    System.out.println("numero ="+p);
}

    }
}