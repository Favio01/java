/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo.notas;
import java.util.Scanner;
/**
 *
 * @author note
 */
public class ArregloNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cantAlum;
        int cantNotas;
        int N = 1;
        double max = 0;
        double min = 70;
        double suma = 0;
        double prom = 0;
        double maxN = 0;
        double minN = 70;
        double sumaN = 0;
        double promN = 0;
        int blue = 0;
        int k = 0;
        double cantN_total;
        
        System.out.print("Ingrese la cantidad de alumnos: ");
        cantAlum = sc.nextInt();
        System.out.print("Ingrese cantidad de notas por alumno: ");
        cantNotas = sc.nextInt();
        double alumn [][] = new double [cantAlum][cantNotas];
        
            for (int i = 0; i < cantAlum; i++) {
                for (int j = 0; j < cantNotas; j++) {
                System.out.print("ingrese nota: ");
                alumn[i][j]= sc.nextDouble();
                    if ((alumn[i][j] > 3) && (alumn[i][j] < 8)) {
                       blue++;
                    }
                
                }    
            }
            System.out.println(" ");
            double azul[] = new double[blue];
            System.out.print("          |");
            for (int i = 1; i <= cantNotas; i++) {
            System.out.print("Nota " + i + "|");
            }
            for (int i = 0; i <1; i++) {
            System.out.print("Max |");
            System.out.print("Min |");
            System.out.println("Promedio |");
        }
            System.out.println("");
            for (int i = 0; i < cantAlum; i++) {
                System.out.print("Alumno " + N + ": |");
                for (int j = 0; j < cantNotas; j++) {
                    suma = suma + alumn[i][j];
                    prom = suma / cantNotas;
                    sumaN = sumaN + alumn[i][j];
                    cantN_total = cantNotas*cantAlum;
                    promN = sumaN / cantN_total;      
                    if (alumn[i][j]> max) {
                        max = alumn[i][j];
                    }
                    if (alumn[i][j] < min) {
                        min = alumn [i][j];
                    }
                    if (alumn[i][j]> maxN ) {
                        maxN = alumn[i][j];
                    }
                    if (alumn[i][j] < minN ) {
                        minN = alumn [i][j];
                    }
                    
                    System.out.print(alumn[i][j]+"   ");
                    System.out.print("|");
                    
                    }
                maxN = maxN + 0;
                minN = minN + 0;
                System.out.print("" + max + " | " + min  +"|");
                System.out.print("   "+prom+"   |");
                System.out.println(" ");
                suma = 0;
                max = 0;
                min = 70;
                N++;
            }
            System.out.println("-----------------------------------------------");
            System.out.println("Promedio  |" + promN + "|");
            System.out.println("Max       |" + maxN + "|");
            System.out.println("Min       |" + minN + "|");
            System.out.println("");
            N = 1;
            System.out.println("Notas azules");
            for (int i = 0; i < cantAlum; i++) {
                System.out.print("Alumno " + N + ": ");
                for (int j = 0; j < cantNotas; j++) {
                    if ((alumn[i][j] > 3) && (alumn[i][j] < 8)) {
                       azul[k] = alumn[i][j];
                       System.out.print(azul[k] + "| ");
                       k++;
                    }
                }
                System.out.println(" ");
                N++;
            }
    }  
}
