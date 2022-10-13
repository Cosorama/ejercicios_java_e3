/*
 EJERCICIO 1: NIVEL 2

 Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking.
 
 Input (Entrada):
 Bariloche
 Córdoba
 Resistencia

 Output (Salida):
 #1. Bariloche
 #2. Córdoba
 #3. Resistencia

*/

import java.util.Scanner;

public class CiudadesFavoritas {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        /*
         String[] ciudadesTop = new String[4];
         ciudadesTop[0] = "Posición inválida";
          
         System.out.println("Ingresa una ciudad favorita: ");
         var ciudadPrimera = entrada.nextLine();
          
         System.out.println("Ingresa tu otra ciudad favorita: ");
         var ciudadSegunda = entrada.nextLine();
          
         System.out.println("Ingresa tu tercera ciudad favorita: ");
         var ciudadTercera = entrada.nextLine();
          
         ciudadesTop[0] = "Ranking de ciudades: ";
         ciudadesTop[1] = ciudadPrimera;
         ciudadesTop[2] = ciudadSegunda;
         ciudadesTop[3] = ciudadTercera;
          
         System.out.println("#1. " + ciudadesTop[1]);
         System.out.println("#2. " + ciudadesTop[2]);
         System.out.println("#3. " + ciudadesTop[3]);
         */

        // La forma anterior es muy 'dura'. Dinámicamente podría ser así:

        // Imprimo la consigna y cuántas ciudades va a tener el top.
        System.out.println("Cuantas ciudades vas a agregar? (Ranking mínimo 3): ");
        var topRanking = Integer.parseInt(entrada.nextLine()) + 1;

        // Creo una lista de ciudades que tiene una cantidad de elementos 'topRanking'.
        String[] ciudadesTop = new String[topRanking];

        // Agrego el elemento '0' a modo de título...
        ciudadesTop[0] = "Ranking de ciudades: ";

        // Creo un 'for' con variable 'i' que mientras sea menor que 'topRanking'(...)
        // Se itera y 'postincrementa' la variable 'i'.
        // La inicializo en '1' porque ya introduje el elemento '0' arriba.
        for (int indice = 1; indice < topRanking; indice++) {

            // Imprimo la consigna para que se ingrese la ciudad: "1/2/3. Ingresa tu ciudad
            // favorita."
            System.out.println((indice) + ". Ingresa tu ciudad favorita: ");
            
            // Pido el ingreso directamente en la lista con la variable 'i' como índice
            ciudadesTop[indice] = entrada.nextLine();
        }

        // Imprimo el ranking:
        System.out.println(ciudadesTop[0]);
        System.out.println("#1. " + ciudadesTop[1]);
        System.out.println("#2. " + ciudadesTop[2]);
        System.out.println("#3. " + ciudadesTop[3]);

    }
}