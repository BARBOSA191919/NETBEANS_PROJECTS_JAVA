package Ciclo_While;
 import java.util.Scanner;
/**
 *generar numeros hasta el valor de 5
 
 */
public class Ciclo_WHILE {
    public static void main (String[]args) {
        Scanner entrada = new Scanner (System.in);
        int contador = 0;
        int limite = 50;
        while (contador < limite)
        {            
        System.out.println("numero = " +contador) ; 
        contador++;
        }
    }
    
}
