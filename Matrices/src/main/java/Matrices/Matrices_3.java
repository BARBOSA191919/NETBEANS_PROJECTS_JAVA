package Matrices;
/*
genera una matriz con letras del alfabeto
mostrandola posteriormente en pantalla
*/

public class Matrices_3 {
     public static void  main(String[]args ) {
         int fil = 6;
         int col = 6;
         char [] [] alfabeto = new char [fil] [col];
                 char letra = 'A';
                 
                 //cargar la matriz
                 for(int c1 =0; c1<fil;c1++)
                 {
                     for(int c2 =0;c2<col;c2++)
                     {
                         alfabeto[c1][c2]= letra;
                         letra++;
                     }
                 }
                 //mostra elementos de la matriz
                 for(int c1=0; c1<fil;c1++)
                 {
                     for(int c2 =0; c2<col;c2++)
                     {
                         
                     System.out.print("  " +alfabeto[c1][c2]);
     }
                 System.out.println(" ");
 }
}
}

