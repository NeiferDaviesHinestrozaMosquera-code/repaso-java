package Tetris;

//Llevar a cabo un programa que permite cargas completamente con numeros 5 una matriz de 4 x 5 

public class Tetris {
    public static void main(String[] args) {

        // Create a new Tetris game
        int numerosmatriz [] [] =  new int [4][5]; 

        //Rellenar con 5
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                numerosmatriz[fila][columna] = 5;
            }
        }

        //Mostrar la matriz en pantalla
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 5; columna++) {
              System.out.println(numerosmatriz[fila][columna]);
              
            }
            System.out.println("\n");
        }

        
    }

}
