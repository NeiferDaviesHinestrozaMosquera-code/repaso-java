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
