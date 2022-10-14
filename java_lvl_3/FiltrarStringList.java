/*
 EJERCICIO 1: NIVEL 3 

 Dada una lista que contiene valores de tipo String, se deberá
 filtrar todos los valores que NO sean null o vacío ("").

 Input (Entrada):
 List<String> palabras = new ArrayList<>();
 palabras.add("Hola");
 palabras.add(null);
 palabras.add("Informatorio");
 palabras.add("");

 Output (Salida):
 ["Hola", "Informatorio"]

 */

import SourcePackage.OperadorListas;
import java.util.ArrayList;

public interface FiltrarStringList {
    public static void main(String[] args) {
        // Creo un objeto de tipo 'OperadorListas'.
        OperadorListas listaStrings = new OperadorListas();

        // Defino una Lista y agrego los valores.
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        // Aplico el método para filtrar Strings.
        listaStrings.filtrarStrings(palabras);
    }
}
