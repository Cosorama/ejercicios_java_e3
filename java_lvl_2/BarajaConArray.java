/*
 EJERCICIO 4: NIVEL 2

 Crear una lista que contenga como elementos la numeración de cartas
 de una baraja francesa(solo los valores, no figuras).
 Se deberá cargar el ArrayList (en orden), imprimir, imprimir en
 orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 
 ACLARACIÓN!!!!!!!!!!!!!!!!!
 En este ejercicio trabajo agregando el 'Array' de valores iniciales a otros 'Arrays'
 para mostrar más claramente el resultado. Es decir: No modifico el 'Array' original.

 En el próximo ejercicio voy a intentar operar sobre la misma lista y sin métodos
 para poder mostrar otra forma de hacerlo (si es que sale).
 
 */

public class BarajaConArray {

    // MÉTODOS PARA ORDENAR, INVERTIR Y MEZCLAR
    // 2. Defino un método de clase que va a ordenar la lista de cartas si es que está desordenada.
    public static int[] ordenarCartas(int[] mazo) {

        // Pongo un 'for' a recorrer la lista y tomar en la variable 'index' el valor
        // del primer índice.
        // Si este 'index' es menor que la longitud del array, se post-incrementa.
        for (int index = 0; index < mazo.length; index++) {
            // Pongo otro 'for' anidado a recorrer el índice siguiente (para comparar el
            // índice anterior con el siguiente).
            // Es decir: este 'nextIndex' toma el valor de 'index+1', y siempre que sea
            // menor que la longitud del array, se post-incrementa.
            for (int nextIndex = index + 1; nextIndex < mazo.length; nextIndex++) {

                // Esta condición es la que determina todo.
                // Solo SI el valor del índice del array de la derecha es mayor que el
                // de la izquierda, sucede que:
                if (mazo[index] > mazo[nextIndex]) {

                    // la variable 'menor índice' toma el valor del segundo índice.
                    int menorIndice = mazo[nextIndex];

                    // la variable 'mayor índice' toma el valor del primer índice.
                    int mayorIndice = mazo[index];

                    // Y se intercambian los valores:

                    // El segundo índice toma el valor del primero.
                    mazo[nextIndex] = mayorIndice;
                    // El primer índice toma el valor del segundo.
                    mazo[index] = menorIndice;

                    // El efecto de comparación se produce SI el índice de la derecha
                    // es menor que el de la izquierda, en ese caso el valor se invierte.
                    // Y se comparan de a par, de 2 en 2.

                    // Si esa condición no se da, el valor se itera con normalidad.

                    // Dicho de otra forma:
                    // El numero de posicion 1 se compara con el de posición 2.
                    // El numero de posición 2 se compara con el que está en la posición 3.
                    // El de la posición 3 con el de posición 4 y así.
                    // Si el de la derecha es menor que el de la derecha, se invierten.
                    // Sino no.
                }
            }
        }

        return mazo;
    }

    // Esto es igual que lo anterior, así que señalo solo lo que cambia.
    public static int[] invertirCartas(int[] mazo) {

        for (int index = 0; index < mazo.length; index++) {
            for (int nextIndex = index + 1; nextIndex < mazo.length; nextIndex++) {

                // Lo que cambia es la condición: Declaro todo lo contrario:
                // Si el índice de la derecha es mayor que el de la iquierda
                // invierto los valores para simular un reverse.
                if (mazo[index] < mazo[nextIndex]) {

                    int menorIndice = mazo[nextIndex];
                    int mayorIndice = mazo[index];

                    mazo[nextIndex] = mayorIndice;
                    mazo[index] = menorIndice;
                }
            }
        }

        return mazo;
    }

    // Esto es igual que lo anterior, así que señalo solo lo que cambia.
    public static int[] mezclarCartas(int[] mazo) {

        for (int index = 0; index < mazo.length; index++) {
            for (int nextIndex = index + 1; nextIndex < mazo.length; nextIndex++) {

                // Lo que cambia es la condición: una operación aleatoria:
                // Si el PRIMER ÍNDICE es múltiplo del SEGUNDO ÍNDICE, entonces
                // invierto los valores como en el ejercicio anterior.
                if (mazo[index] % mazo[nextIndex] == 0) {

                    int menorIndice = mazo[nextIndex];
                    int mayorIndice = mazo[index];

                    mazo[nextIndex] = mayorIndice;
                    mazo[index] = menorIndice;
                    // Si no es par, no.
                } else {
                    int menorIndice = mazo[nextIndex];
                    int mayorIndice = mazo[index];

                    mazo[nextIndex] = menorIndice;
                    mazo[index] = mayorIndice;
                }
            }
        }

        return mazo;
    }

    // MÉTODO MAIN PARA EJECUTAR
    public static void main(String[] args) {

        // 1. Generé este Array relativamente ordenado (no está completamente ordenado).
        int[] valoresCartas = { 1, 3, 2, 4, 5, 8, 6, 7, 9, 10, 11, 12, 13 };
        System.out.println("");// Salto de línea.
        System.out.println("Mazo original: ");

        // 6. También itero el array anterior para comparar.
        for (int item : valoresCartas) {
            System.out.print(item + " ");
        }

        // 4. Defino un nuevo Array que tiene por valor el método que va a ordenar la
        // lista anterior.
        int[] mazOrdenado = ordenarCartas(valoresCartas);
        System.out.println(""); // Salto de línea.
        System.out.println("Mazo ordenado");

        // 5. La itero con un 'for'.
        for (int item : mazOrdenado) {
            System.out.print(item + " ");
        }
        // Acá defino un Array que tiene por valor el método que invierte la lista de
        // valores de cartas.
        int[] mazoInvertido = invertirCartas(valoresCartas);
        System.out.println("");// Salto de línea.
        System.out.println("Mazo Invertido: ");

        for (int item : mazoInvertido) {
            System.out.print(item + " ");
        }

        // Acá defino un array que tiene por valor el método que mezcla la lista de
        // valores de las cartas.
        int[] mazoMezclado = mezclarCartas(valoresCartas);
        System.out.println("");// Salto de línea.
        System.out.println("Mazo Mezclado: ");

        for (int item : mazoMezclado) {
            System.out.print(item + " ");
        }

    }
}