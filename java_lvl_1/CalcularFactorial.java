/*
 EJERCICIO 4: NIVEL 1

 Realizar un programa que calcule el factorial de un número:
 n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
 
 Sin hacer uso de librerías. 
 
*/

import java.util.Scanner;

public class test {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		// Imprimo la consigna.
		System.out.println("Ingresa un número: ");
		// Solicito el número para hallar el factorial.
		var numeroEntrada = Integer.parseInt(entrada.nextLine());

		// Creo una variable factorial inicializada en 1.
		int factorial = 1;

		// Creo un ciclo 'for' con una variable 'x' que:
		// Se inicializa en 1.
		// Mientras 'x' sea menor o igual que el numero ingresado(...)
		// (...) 'x' se post-incrementa (se usa y después se incrementa).
		for (int x = 1; x <= numeroEntrada; x++) {
			// La variable 'factorial' se multiplica por 'x'
			factorial *= x;
		}

		// Imprimo el resultado xd
		System.out.println("El factorial de " + numeroEntrada + " es " + factorial);
	}
}