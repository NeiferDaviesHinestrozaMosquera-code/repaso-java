package Bidireccional;

import java.util.Scanner;

public class Bidireccional {
    public static void main(String[] args) {
        //Declaracion

        int matriz [] [] =  new int [3] [3];
        Scanner teclado = new Scanner(System.in);
       
        //Asignacion
        for(int fila = 0 ;fila < 3 ; fila ++ ){
            for(int columna = 0 ; columna < 3 ; columna ++ ){
                System.out.println("Ingrese el valor para la posicion de FILa : " + fila + " Valor de Columna : " + columna);
                matriz[fila][columna] = teclado.nextInt();
            }
        }

        //Recorrer
        for(int fila = 0 ;fila < 3 ; fila ++ ){
            for(int columna = 0 ; columna < 3 ; columna ++ ){
                System.out.println("El valor de la posicion Fila :" + fila  + " y Columna es igual : " + columna + " ");
                System.out.println("Es de :: " + matriz [fila] [columna] + " ");
            }
        }

    }
}
