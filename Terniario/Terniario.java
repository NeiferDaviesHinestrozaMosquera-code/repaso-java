package terniario;

import java.util.Scanner;


public class Terniario {
    public static void main(String[] args) {

        double promedio;
        String Condicionfinal;

        Scanner teclado =  new Scanner(System.in);

        System.out.println("Ingrese el promedio del usaurio de aca :,vvv");
        promedio = teclado.nextDouble();

        Condicionfinal = promedio >= 6 ? "Suficiente para aprobar , Felicidades" : "No es suficiente para aprobar . Mala suerte , intentalo de nuevo" ;
        System.out.println("Su nota final es " +  Condicionfinal);
    }
}