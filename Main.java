import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir la edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        // Pedir el nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        // Pedir el apellido
        System.out.print("Introduce tu apellido: ");
        String apellido = scanner.nextLine();

        // Mostrar el nombre y apellido
        System.out.println("Hola, " + nombre + " " + apellido + ", tu edad es: " + edad + "!");
        System.out.println("Hasta la proxima :3");

        // Cerrar el scanner
        scanner.close();
    }
}