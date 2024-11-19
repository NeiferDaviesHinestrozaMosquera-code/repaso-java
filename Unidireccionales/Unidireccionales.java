package Unidireccionales;

import java.util.Scanner;

public class Unidireccionales {
    public static void main(String[] args) {
        
        //Declaracion
        // int vector [] ;

        // int vectordos []  = new int [4];

        // //Asignacion
        // vectordos [0] = 10 ;
        // vectordos [1] = 20 ;
        // vectordos [2] = 30 ;
        // vectordos [3] = 40 ;

        // //Recorrer
        // for(int i = 0 ; i < vectordos.length ; i++) {
        //     System.out.println("ESTOY EN EL INDICE : " + i);
        //     System.out.println("TENGO GUARDADO UN : " + vectordos[i]);
        //     System.out.println("*****************");
        // }

        // System.out.println("ESTO ES EL FINAL , NO VEMOS EN LA PROXIMA");


        int vectordos []  = new int [4];

        Scanner teclado =  new Scanner(System.in);
        for(int i = 0 ; i < vectordos.length ; i++) {
            System.out.println("INGRESE UN NUMERO DE INDICE " + i);
            vectordos[i] = teclado.nextInt();
        }

        System.out.println("*****************");

        //Recorrer
        for(int i = 0 ; i < vectordos.length ; i++) {
            System.out.println("ESTOY EN EL INDICE : " + i);
            System.out.println("TENGO GUARDADO UN : " + vectordos[i]);
            System.out.println("*****************");
        }

        System.out.println("ESTO ES EL FINAL , NOS VEMOS EN LA PROXIMA");

    }
}
