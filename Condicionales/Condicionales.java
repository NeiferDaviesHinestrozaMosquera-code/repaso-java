package condicionales;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        
        // Variable para almacenar el sueldo
        double sueldo = 0;
        
        // Variable para almacenar la categoría
        int categoria;
        
        // Mostrar las categorías disponibles
        System.out.println("Las categorías con las que contamos son : 1 - Repartidor, 2 - Cajero y 3- Supervisor");
        System.out.println();
        
        // Solicitar la categoría al usuario
        System.out.println("Ingrese el tipo de categoria para calcular su respectivo sueldo");
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner teclado = new Scanner(System.in);
        
        // Leer la categoría ingresada por el usuario
        categoria = teclado.nextInt();

        // Evaluación condicional para determinar el sueldo basado en la categoría
        if (categoria == 1) {
            // Si es repartidor, calcular sueldo con aumento del 10%
            sueldo = 15890 + (15890 * 0.10);
        } else if (categoria == 2){
            // Si es cajero, sueldo fijo
            sueldo = 25630.89;
        } else {
            // Si es supervisor, verificar si es válida
            if (categoria == 3) {
                // Calcular sueldo de supervisor con descuento del 11%
                sueldo = 35560.20 - (35560.20 * 0.11);
            } else {
                // Si no es válida ninguna otra categoría, mostrar mensaje de error
                System.out.println("Categoria no valida");
            }
        }
        
        // Verificar si la categoría es válida antes de mostrar el sueldo
        if (categoria == 1 || categoria == 2 || categoria == 3) {
            // Mostrar el sueldo calculado
            System.out.println("El sueldo de la categoría" + categoria + " Su sueldo es " + sueldo);
        }
    }
}
