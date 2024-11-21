package ContarNumero;

import java.util.Scanner;


//Realizar un programa que permita cargar 15 numeros en un vector  . 
//Una vez cargado , se necesita que el programa cuente e informe por 
//pantalla cuantas veces se carga el numero 3


public class ContarNumero {
    public static void main(String[] args) {
        int vec [] =  new int [15];
        Scanner teclado = new Scanner(System.in);

        //Cargar nuestro vector
        for (int i = 0 ; i < 15 ; i++) {
            System.out.println("Ingrese un numero para el vector : ");
            vec[i] = teclado.nextInt();         //.nextIn es un metodo
        }

        //Recorrer y contar cuanto numeros 3 tiene
        int con = 0; 
        for (int i = 0 ; i < 15 ; i++) {
            if(vec[i] == 3) {
                con++;
            } else {
                System.out.println("No hay 3 en la posicion " + i);
            }
        }

        System.out.println("La cantidad de numeros 3 que tiene el vector es : " + con);
    }

}
