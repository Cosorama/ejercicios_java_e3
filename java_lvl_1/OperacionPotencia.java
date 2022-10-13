/*
 EJERCICIO 6: NIVEL 1
 
 Se desea una aplicación que solicite 2 números enteros y realice
 la operación de potencia (sin uso de librerías).
 
*/

import java.util.Scanner;

public class OperacionPotencia {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        // Imprimo la consigna.
        System.out.println("Ingresa un número: ");
        // Solicito la entrada del número.
        var numero = Integer.parseInt(entrada.nextLine());
        // Imprimo la siguiente consigna.
        System.out.println("Ingresa la potencia: ");
        // Solicito la entrada de la potencia.
        var potencia = Integer.parseInt(entrada.nextLine());

        /*
         * Esto es similar a lo anterior pero con multiplicaciones sucesivas
         * así que reciclo parte del código anterior xd
         */

        // Creo una variable para almacenar el producto de las operaciones.
        int producto = 0;

        // Creo un 'while' con el exponente como contadortz.
        // A 'potencia' le resto '-1' porque la primera operación es '0'(...)
        // (...) y en ese caso, la primera operación es 0 antes de comenzar a descontar.
        while (potencia - 1 > 0) {

            // Si producto es igual a '0'
            // Es decir: Si todavía no se realizó ninguna multiplicación
            if (producto == 0) {
                // 'producto' adhiere la multiplicación del numero.
                producto += numero * numero;

                // A 'potencia' le resto uno.
                potencia -= 1;

                // Sino (Si producto es distinto de '0')
                // Es decir: Si ya se hizo una primera operación.
            } else {
                // Producto se multiplica por la base.
                producto *= numero;

                // A 'potencia' le resto uno.
                potencia -= 1;
            }
        }

        /*
         * ¿Por qué el 'if-else'?
         * Porque no quiero que a 'base*base' se le sume otro 'base*base'
         * Sino que se haga a*a*a(...), entonces:
         * Si ya se hizo la primera operación (base*base).
         * A ese resultado le multiplico la base.
         */

        // Imprimo el resultado xd
        System.out.println("El resultado es: " + producto);
    }
}