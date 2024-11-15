package Salir;

import java.util.Scanner;

public class Salir {
    public static void main(String[] args) {
        System.out.println("Ingrese palabras que sean diferentes de SALIR ");

        Scanner tecladoSalir = new Scanner(System.in);
        String palabra = tecladoSalir.nextLine();

        while (!palabra.equalsIgnoreCase("SALIR")) {
            System.out.println("La palabra ingresa es  " + palabra);
            System.out.println("Ingrese palabras que sean diferentes de SALIR ");

            palabra = tecladoSalir.nextLine();
        }
    }
}
