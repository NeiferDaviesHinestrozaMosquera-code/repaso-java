package Vuelos;

import java.util.Scanner;

public class Vuelos {
    public static void main(String[] args) {

        // Carga de matriz de asientos de vuelos
        int asientos[][] = new int[6][3];

        // Cargar matriz
        Scanner teclado = new Scanner(System.in);

        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out
                        .println("Ingrese la cantidad de asisnetos para el destino : " + fila + " horario: " + columna);
                asientos[fila][columna] = teclado.nextInt();
            }
        }

        // Venta de asientos
        Scanner tecladodos = new Scanner(System.in);
        System.out.println("Venta de asientos xxx");

        String bandera = "";
        int destino, horario, asiento;

        while (!bandera.equalsIgnoreCase("FINISH")) {
            System.out.println("Ingrese el N de destino");
            destino = teclado.nextInt();
            System.out.println("Ingrese el horario");
            horario = teclado.nextInt();
            System.out.println("Ingrese el asiento");
            asiento = teclado.nextInt();

            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (asientos[destino][horario] >= asiento) {
                        System.out.println("Su reserva fue realizada con éxito.");
                        asientos[destino][horario] -= asiento;
                    } else {
                        System.out.println("No hay asientos disponibles.");
                    }
                } else {
                    System.out.println("Horario no existe. Ingrese entre 0 y 2.");
                }
            } else {
                System.out.println("Destino no existe. Ingrese entre 0 y 5.");
            }
            System.out.println(
                    "Desea continuar la reserva ? Ingrese la palabra FINISH para terminar , de lo contrario continue");
            bandera = tecladodos.next();
        }

    }
}
