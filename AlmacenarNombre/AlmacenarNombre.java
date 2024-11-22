package AlmacenarNombre;

import java.util.Scanner;

///Llevar a cabo un programa que incluya un vector que almacene los nombres:
/// xxxxxx . Realizar un recorrido del vector para cargar los datos y otro para mostrarlos por pantalla
public class AlmacenarNombre {
    public static void main(String[] args) {

        //Guardar nombre en vector
        String vector[] = new String[8];

        vector[0] = "Alejandro";
        vector[1] = "Miguel";
        vector[2] = "Karla";
        vector[3] = "Luis";
        vector[4] = "Aleja";
        vector[5] = "Juan";
        vector[6] = "David";
        vector[7] = "Maria";

        //Scanner teclado =  new Scanner(System.in);

        //Recorrido de vectores
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Nombre de la posicion " + i +" es : " + vector[i]);
        }

        //Carga de vectores
    }

}
