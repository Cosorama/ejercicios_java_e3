/*
 EJERCICIO 2: NIVEL 3 
  
 Dada una lista que contiene números enteros, se deberá generar
 otra lista que contendrá el resultado de aplicar 
 la operación de potencia a 2.

 Input (Entrada):
 List<Integer> numeros = List.of(1, 2, 3, 4, 5);

 Output (Salida):
 [1, 4, 9, 16, 25]
 
*/

import SourcePackage.OperadorListas;
import java.util.List;

public class ListaPotencias {
    public static void main(String[] args) {
        // Creo un objeto de la clase 'OperadorListas'.
        OperadorListas listaNumeros = new OperadorListas();
        // Defino una lista de valores.
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 128);
        // Uso el método para aplicar los elementos a la potencia de 2.
        listaNumeros.AplicarPotencia(numeros);
    }
}
