/*
 EJERCICIO 2: NIVEL 1
  
 Realizar un programa que solicite por consola 2 números enteros.
 Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo de ambos.

*/

import java.util.Scanner;

public class EjercicioOperaciones {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        // Impresion de consigna.
        System.out.println("Ingresa un numero: ");
        // Solicitud del primer numero.
        var numeroPrimero = Integer.parseInt(entrada.nextLine());
        // Impresion de siguiente consigna.
        System.out.println("Ingresa otro numero: ");
        // Solicitud del segundo numero.
        var NumeroSegundo = Integer.parseInt(entrada.nextLine());

        System.out.println("Resultado de operaciones: ");

        // Impresion de la suma.
        System.out.println("Suma: " + (numeroPrimero + NumeroSegundo));

        // Impresion de la resta.
        // Me aseguro de no caer en negativos, por las dudas.
        // Si el primer numero es mayor:
        if (numeroPrimero > NumeroSegundo)
            System.out.println("Resta: " + (numeroPrimero - NumeroSegundo));
        // Sino (si el segundo numero es mayor):
        else
            System.out.println("Resta: " + (NumeroSegundo - numeroPrimero));

        // Impresion de multiplicacion.
        System.out.println("Multiplicacion: " + numeroPrimero * NumeroSegundo);

        // Impresion de division.
        System.out.println("Division: " + numeroPrimero / NumeroSegundo);

        // Impresion de operacion de modulo.
        System.out.println("Modulo: " + numeroPrimero % NumeroSegundo);
    }
}