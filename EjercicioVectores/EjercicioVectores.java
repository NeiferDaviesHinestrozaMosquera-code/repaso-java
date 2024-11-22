package EjercicioVectores;

import java.util.Scanner;

///En tres vectores diferentes se guardan los nombres , temperaturas minimas y maximas
/// de 5 cuidades de la provicias de misiones . en el primer vector se guardan los nombre de las cuidades , enn el segundo las temperaturas minimas alcanzadas
/// y en el tercero las maximas alcanzadas en la ultimam semana . Se necesita un programa que permita la carga de las cuidades , 
/// sus temperaturas minimas y maximas ; ademas , debera poder informar por pantalla cual fue la cuidad con la tmperatura mas baja y mas allta
/// en la ultima semana .

public class EjercicioVectores {
    public static void main(String[] args) {
        
        //3 VECTORES
        String cuidades [] = new String[5];
        Double temperaturamin [] =  new Double[5];
        Double temperaturamax [] = new Double[5];

        //Ingresar datos de cuidad y temperatura
        Scanner tecladocuidad = new Scanner(System.in);
        Scanner tecladotemperatura = new Scanner(System.in);

        //Cargar los 3
        for (int i = 0; i < cuidades.length; i++) {
           System.out.println("Ingrese el nombre de la cuidad " + i);
           cuidades[i] = tecladocuidad.next();

           System.out.println("Ingrese la temperatura minima de la cuidad " + i);
           temperaturamin[i] = tecladotemperatura.nextDouble();

           System.out.println("Ingrese la temperatura maxima de la cuidad " + i);
           temperaturamax[i] = tecladotemperatura.nextDouble();

        }

        int posMin = 0;
        int posMax = 0;

        //Determinar la minima temperatura
        for (int i = 1; i < cuidades.length; i++) { // Start from 1 since we compare with the first element
            if (temperaturamin[i] < temperaturamin[posMin]) {
                posMin = i; // Update position of minimum
            }
            if (temperaturamax[i] > temperaturamax[posMax]) {
                posMax = i; // Update position of maximum
            }
        }

        System.out.println("La temperatura minima es de  : " + temperaturamin.toString());
        System.out.println("La cuidad con la temperatura minima es : " + cuidades[posMin]);
        System.out.println("La temperatura maxima es de  : " + temperaturamax.toString());
        System.out.println("La cuidad con la temperatura maxima es : " + cuidades[posMax]);


    }

}
