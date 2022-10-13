/*
 EJERCICIO 3: NIVEL 1
  
 Confeccionar un programa que dado un número entero como dato de entrada
 imprima la secuencia de números (incrementos de 1) de la siguiente forma:
  
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5

*/

import java.util.Scanner;

public class EscaleraNumeros {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		// Impresión de consigna.
		System.out.println("Ingresa un número: ");
		// Solicito el número de veces que se va a secuenciar una línea de números.
		var linea = Integer.parseInt(entrada.nextLine());

		// Creo un 'for que va a recorrer e incremenetar la variable 'x' en relación a
		// la variable 'linea'.
		for (int x = 1; x <= linea; x++) {
			// Pongo un 'println' vacío para saltar de línea.
			System.out.println("");
			// Anido un for que va a recorrer el anterior, tomar un número e incrementarlo
			// por líneas.
			for (int y = 1; y <= x; y++) {
				// Acá no uso 'println' sino solo 'print'.
				// Con esto no abarco toda una línea sino solo una posición.
				System.out.print(y + " ");
			}
		}

	}
}