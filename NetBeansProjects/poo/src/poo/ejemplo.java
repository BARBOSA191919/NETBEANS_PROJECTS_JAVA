/*El sistema meteorológico local requiere un sistema para capturar 
la temperatura promedio de un periodo de dias escogidos por el usuario, 
entre semana(7), quincena(15), mes(30), bimestre(60), trimestre (90), 
semestre(180) o año(360). 
Con los datos capturados, y calcular:
- El día y el valor de la tempertura más alta.
- El día y el valor de la tempertura más baja.
- El promedio mensual de temraturas.
e imprimir el nombre del día y un mensaje
de la percepción de la temperatura de acuerdo con el valor capturado según la
siguiente tabla:
*/
package poo;

import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        int ndias=0,op,posMin,posMax;
        float[] temps = new float[360];
        float maxT,minT,promT,acumT=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Menú Opciones - Seleecione la cantidad de dias a procesar...");
        System.out.println("1. Semana");
        System.out.println("2. Quincena");
        System.out.println("3. Mes");
        System.out.println("4. Bimestre");
        System.out.println("5. Trimestre");
        System.out.println("6. Semestre");
        System.out.println("7. Año");
        System.out.println("0. Salir...");
        System.out.print("Seleccione la opción: ");
        op=s.nextInt();
        int[] ndiasA={7,15,30,60,90,180,360};
        switch(op){
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5:
            case 6: 
            case 7:
                ndias=ndiasA[op-1];
                break;                    
            case 0: 
                System.out.println("Gracias por utilizar nuestro programa...");
                break;
            default:
                System.out.println("Error... intente nuevamente");
        }
        //Captura de datos
        for (int i = 0; i < ndias; i++) {
            //System.out.print("Temperatura Dia No. "+ (i+1)+": ");
            //temps[i]=s.nextFloat();
            //Generando temperaturas entre 10 y 40 Grados
            int min = 10;
            int max = 40;
            temps[i] = (float)((Math.random() * (max - min)) + min);
        }
        for (int i = 0; i < ndias; i++) {
            System.out.println("temps["+ (i)+"]= "+temps[i]);
            //temps[i]=s.nextFloat();
        }
        minT=temps[0];
        posMin=0;
        maxT=temps[0];
        posMax=0;
        for (int i = 0; i < ndias; i++) {
            if(temps[i]<minT){
                minT=temps[i];
                posMin=i;
            }
            if(temps[i]>maxT){
                maxT=temps[i];
                posMax=i;
            }
            acumT+=temps[i];
        }
        promT=acumT/ndias;
        System.out.println("Min: "+minT+" Pos: "+ posMin);
        System.out.println("Max: "+maxT+" Pos: "+ posMax);
        System.out.println("Prom: "+promT);
            
        
    }
    
    
}