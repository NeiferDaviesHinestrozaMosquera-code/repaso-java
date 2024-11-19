package Arbol;

import java.util.Scanner;

public class Arbol {
    public static void main(String[] args) {

        System.out.println("Ingrese el numero de * para el arbol : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int altura = n;

        for(int fila = 0 ; fila  < altura ; fila ++){
            for (int esp = altura - fila -1 ; esp > 0 ; esp --){
                System.out.print(" ");
            }

            for (int asterisco = 0 ; asterisco <= fila * 2 ; asterisco ++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = 0; i < 2; i++) { // Altura del tronco
            for (int espacio = altura - 1; espacio > 0; espacio--) {
                System.out.print(" ");
            }
            System.out.println("|||"); // Tronco del árbol
        }

        System.out.println("Feliz Navidad para Todos :3 ");
    }
}
