/*
 EJERCICIO 3: NIVEL 3

 Se dispone de una lista de Strings, de la cual saber la cantidad
 de valores que comiencen con la letra B (tanto mayúscula y minúscula,
 en ese caso decimos que será ignoreCase).
 
 Input (Entrada):
 List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
 "Wonder Woman", "brainiac",);
 
 Output (Salida):
 3

 ACLARACION!!!!!!!!!!!!!!!
 Alteré el ejercicio para buscar las palabras que se empiecen con el
 caracter que se elija, no solo la letra B.

*/

import java.util.List;

import SourcePackage.OperadorListas;

public class ContarPalabras {
    public static void main(String[] args) {
        // Defino un objeto vacío de tipo 'OperadorListas'.
        OperadorListas conteoDePalabras = new OperadorListas();

        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac", "aguabenti");

        conteoDePalabras.contadorPalabrasConLetra(palabras, 'B');
    }

}
