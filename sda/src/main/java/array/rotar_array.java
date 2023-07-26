package array;
import java.util.Scanner;
// Escribe un programa que lea 8 numeros por teclado y que los almacene en un
// array. rota los elementos de ese array, es decir, el elemento de la posicion 0
// debe pasar a la posicion 1, el de la 1 a la 2, etc. El número que se encuentre en
// la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
// del array
public class rotar_array {
     public static void  main(String[]args ) {
 Scanner entrada = new Scanner(System.in);
int [] numero =  new int [8];
int c; 
System.out.println("Ingrese 8 numeros");
for(c=0; c<8;c++)
{
    numero [c] = entrada.nextInt();
}
System.out.println(" array original ");
for (c=0; c<8;c++)
{
    System.out.printf(" | "+c);
}
System.out.println(" | ");
for (c=0; c<25;c++)
{
    System.out.print(" - ");
}
    System.out.println(" - ");
 for (c=0; c<8;c++)
 {
    System.out.printf(" | "+numero[c]);
   
 }
         System.out.println(" | ");
         //rotar posicion
         int aux = numero [7];
         for (c = 7; c>0;c--)
         {
             numero [c] = numero[c-1];
         }
         numero [0] = aux;
         
         // array recorrido
         System.out.println("array recorrido");
         for(c=0; c<8;c++)
         {
             System.out.printf(" | "+c);
         }
         System.out.println(" | ");
         for (c=0; c<25;c++)
             {
             System.out.printf("  -  ");
             }
              System.out.println("  -  ");
              
           for(c=0; c<8;c++)
         {
             System.out.printf(" | "+numero[c]);
         }
         System.out.println(" | ");
         
         //rotar de posicion
         
}
}


