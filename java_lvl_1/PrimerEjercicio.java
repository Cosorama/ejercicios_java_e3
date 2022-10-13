/*
  EJERCICIO 1 / NIVEL 1

  Solicitar por consola el nombre del usuario e imprimir
  por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”

*/

import java.util.Scanner;

public class PrimerEjercicio {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		// Impresion de consigna.
		System.out.println("Ingresa tu nombre o nick: ");
		// Solicitud de nombre o nickname.
		var nombre = entrada.nextLine();
		// Impresion de saludo.
		System.out.println("Hola, " + nombre + "!!!");
	}
}
