package CalculoMatriz;

import java.util.Scanner;

///En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria . 
/// Cada fila corresponde a las notas y al promedio de cada alumno , Se necesita un programa 
/// que permita a un profesor cargar , en las primeras 3 posiciones ( Columna ),
///  de cada fila , las notas del alumnno y que en la ultima columna se calculen los promedios .
/// una vez realizados los calculos se desea mostrar las 3 notas de cada alumno ,
///  y el promedio correspondiente recorriendo la matriz

public class CalculoMatriz {
    public static void main(String[] args) {

        double[][] matriz = new double[4][4];
        Scanner teclado =  new Scanner(System.in);
        double suma = 0.0;

        //Cargar el for
        for (int fila = 0 ; fila < 4 ; fila ++) {
            for (int columna = 0 ; columna < 3 ; columna ++) {
                System.out.println("Ingrese el alumno numero " + fila);
                matriz[fila][columna] = teclado.nextDouble() ; 
                suma = suma + matriz[fila][columna];
            }
            matriz[fila][3] = suma / 3 ;
            suma = 0.0 ;
        }

        //Recorrer el for
        for (int fila = 0 ; fila < 4 ; fila ++) {
            System.out.println("*******************************");
            System.out.println("Las notas del alumno n " + fila + " son : ");
            for (int columna = 0 ; columna < 3 ; columna ++) {
                System.out.println("Notas de n " + columna + " " + matriz[fila][columna]);
            }
            System.out.println("El promedio de las notas es : " + matriz[fila][3] );
            if( matriz[fila][3] <= 6){
                System.out.println("El alumno esta aprobado");
            } else {
                System.out.println("El alumno esta desaprobado");
            }
        }
    }

}
