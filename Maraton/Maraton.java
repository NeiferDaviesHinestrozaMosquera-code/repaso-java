package Maraton;

import java.util.Scanner;

public class Maraton {
    public static void main(String[] args) {

        System.out.println("Ingrese DNI del usuario");
        Scanner DniUser = new Scanner(System.in);
        String dni = DniUser.nextLine();


        System.out.println("Ingrese Nombre del usuario");
        Scanner NameUser = new Scanner(System.in);
        String name = NameUser.nextLine();

        System.out.println("Ingrese Edad del usuario");
        Scanner EdadUser = new Scanner(System.in);
        int edad = EdadUser.nextInt();

       
        while (!dni.equals("0") && !name.equalsIgnoreCase("FIN")) {
            if (edad >= 6 && edad <= 10) {
                System.out.println("La categoria Menores A");
            } else if (edad >= 11 && edad <= 17){
                System.out.println("La categoria Menores B");
            } else if (edad >= 18 && edad <= 30){
                System.out.println("La categoria Juveniles");
            } else if (edad >= 31 && edad <= 50){
                System.out.println("La categoria Adultos");
            } else if (edad >= 51){
                System.out.println("La categoria Adultos Mayores");
            } else {
                System.out.println("La categoria no existe");
            }

            System.out.println("Imprimir los datos del usuario " + dni + " " + name +" " + edad);

            System.out.println("Ingrese DNI del usuario");
            dni = DniUser.nextLine();
            System.out.println("Ingrese Nombre del usuario");
            name = NameUser.nextLine();
            System.out.println("Ingrese Edad del usuario");
            edad = EdadUser.nextInt();
        }
    }
    
}


// package Maraton;

// import java.util.Scanner;
// import java.util.Arrays;

// public class Maraton {
//     private static final String PROMPT = "Ingrese ";
//     private static final String DNI_PROMPT = PROMPT + "DNI del usuario";
//     private static final String NAME_PROMPT = PROMPT + "Nombre del usuario";
//     private static final String AGE_PROMPT = PROMPT + "Edad del usuario";

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         while (!isValidInput(scanner)) {
//             System.out.println(DNI_PROMPT);
//             String dni = scanner.nextLine().trim();
            
//             System.out.println(NAME_PROMPT);
//             String name = scanner.nextLine().trim();
            
//             System.out.println(AGE_PROMPT);
//             int age = getValidAge(scanner);
            
//             printCategory(age);
//             printUserDetails(dni, name, age);
//         }
        
//         scanner.close();
//     }

//     private static boolean isValidInput(Scanner scanner) {
//         return !scanner.hasNextLine() || scanner.nextLine().trim().isEmpty();
//     }

//     private static int getValidAge(Scanner scanner) {
//         while (!scanner.hasNextInt()) {
//             System.out.println("Por favor, ingrese un número entero.");
//             scanner.next(); // Consume invalid input
//         }
//         return scanner.nextInt();
//     }

//     private static void printCategory(int age) {
//         String[] categories = {
//             "Menores A", "Menores B", "Juveniles", "Adultos", "Adultos Mayores"
//         };
//         int index = (age - 6) / 5;
//         System.out.println("La categoría es: " + categories[Math.min(index, categories.length - 1)]);
//     }

//     private static void printUserDetails(String dni, String name, int age) {
//         System.out.println("Imprimir los datos del usuario " + dni + " " + name + " " + age);
//     }
// }

