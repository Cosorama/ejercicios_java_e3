/*
 EJERCICIO 4: NIVEL 2

 Crear una lista que contenga como elementos la numeración de cartas
 de una baraja francesa(solo los valores, no figuras).
 Se deberá cargar el ArrayList (en orden), imprimir, imprimir en
 orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 
 ACLARACIÓN!!!!!!!!!!!!!!!!!
 Esta es una forma de 'BarajaArrayList.java' con métodos para dejar mejor estructurado
 el código. Sin embargo esta clase tiene ir en un 'package' para distinguirse de la clase
 con el método que la ejecuta para usar 'mejores prácticas'.

 */

package SourceBarajas.BarajaConMetodo;

import java.util.ArrayList;
import java.util.Arrays;

public class Baraja {

    // El ArrayList de 'valoresCartas' lo defino como atributo de clase.
    ArrayList<Integer> mazoCartas = new ArrayList<>(Arrays.asList());

    // Método para CREAR el mazo.
    public void crearMazo() {
        // El ciclo 'for' asigna la variable 'n' que va a ser el valor de cada carta,
        // y se va a iterar la cantidad de cartas que necesitemos (14) en este caso,
        // tomando un valor distinto post-incrementándose después de ser usado.
        for (int n = 1; n < 14; n++) {
            // Creo un 'naipe' de tipo 'Carta'.
            Carta naipe = new Carta();
            // Ese objeto crea una carta con el valor de 'n'.
            naipe.crearCarta(n);
            // Al ArrayList 'mazoCartas' le agrego el valor de la carta.
            mazoCartas.add(naipe.valorCarta);
            // Mezclo el mazo.
        }
        System.out.println("Mazo creado: " + mazoCartas);
    }

    // Método para ORDENAR el mazo.
    public void ordenarMazo() {
        // La forma de 'ordenar y desordenar' siguen siendo las mismas,
        // solo que dentro de un método.
        for (int index = 0; index < mazoCartas.size(); index++) {
            for (int nextIndex = index + 1; nextIndex < mazoCartas.size(); nextIndex++) {
                if (mazoCartas.get(nextIndex) < mazoCartas.get(index)) {
                    int menorIndice = mazoCartas.get(nextIndex);
                    int mayorIndice = mazoCartas.get(index);
                    mazoCartas.set(index, menorIndice);
                    mazoCartas.set(nextIndex, mayorIndice);
                }
            }
        }
        // Imprimo el nuevo orden del mazo.
        System.out.println("Mazo ordenado: " + mazoCartas);
    }

    // Método para INVERTIR el mazo.
    public void invertirMazo() {
        for (int index = 0; index < mazoCartas.size(); index++) {
            for (int nextIndex = index + 1; nextIndex < mazoCartas.size(); nextIndex++) {
                if (mazoCartas.get(nextIndex) > mazoCartas.get(index)) {
                    int menorIndice = mazoCartas.get(nextIndex);
                    int mayorIndice = mazoCartas.get(index);
                    mazoCartas.set(index, menorIndice);
                    mazoCartas.set(nextIndex, mayorIndice);
                }
            }
        }
        // Imprimo el orden invertido del mazo.
        System.out.println("Mazo invertido: " + mazoCartas);
    }

    // Método para MEZCLAR el mazo.
    public void mezclarMazo() {
        for (int index = 0; index < mazoCartas.size(); index++) {
            for (int nextIndex = index + 1; nextIndex < mazoCartas.size(); nextIndex++) {
                if (mazoCartas.get(nextIndex) % 2 == 0 && mazoCartas.get(index) % 3 == 0) {
                    int menorIndice = mazoCartas.get(nextIndex);
                    int mayorIndice = mazoCartas.get(index);
                    mazoCartas.set(index, menorIndice);
                    mazoCartas.set(nextIndex, mayorIndice);
                } else {
                    int menorIndice = mazoCartas.get(nextIndex);
                    int mayorIndice = mazoCartas.get(index);
                    mazoCartas.set(index, mayorIndice);
                    mazoCartas.set(nextIndex, menorIndice);
                }
            }
        }
        // Imprimo el mazo mezclado.
        System.out.println("Mazo mezclado: " + mazoCartas);
    }

    public static void main(String[] args) {
        Baraja mazoNuevo = new Baraja();
        mazoNuevo.crearMazo();
        mazoNuevo.invertirMazo();
        mazoNuevo.mezclarMazo();
        mazoNuevo.ordenarMazo();
    }

}
