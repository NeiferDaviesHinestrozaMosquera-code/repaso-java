package Contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        System.out.println("Ingrese el limite de datos ");
        Scanner numeroScanner = new Scanner(System.in);
        int limite = numeroScanner.nextInt();
        int cont = 1;

        while (cont <= limite) {
            System.out.println("El valor final while es :" + cont);
            cont = cont + 1 ;
        }



        // for ( int cont = 0  ; cont <= limite ; cont ++) {
        //     System.out.println("El valor final con for es :" + cont);
            
        // }

    }
}
