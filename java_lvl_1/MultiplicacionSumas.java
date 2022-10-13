/*
 EJERCICIO 5: NIVEL 1

 Se desea una aplicación que solicite 2 números enteros y realice
 la operación de multiplicación por sumas sucesivas (sin uso de librerías).
 
*/

import java.util.Scanner;

public class MultiplicacionSumas {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		// Imprimo la consigna.
		System.out.println("Ingresa el multiplicando: ");
		// Solicito un número.
		var numeroPrimero = Integer.parseInt(entrada.nextLine());
		// Imprimo la otra consigna.
		System.out.println("Ingresa el multiplicador: ");
		// Solicito el otro número.
		var numeroSegundo = Integer.parseInt(entrada.nextLine());

		// Creo una variable para que se almacene el producto.
		int producto = 0;

		// Creo un 'while' para repetir sumas con el 'multiplicador' como contador.
		while (numeroSegundo > 0) {
			producto += numeroPrimero;
			numeroSegundo -= 1;
		}

		System.out.println("Resultado de multiplicación: " + producto);
	}
}