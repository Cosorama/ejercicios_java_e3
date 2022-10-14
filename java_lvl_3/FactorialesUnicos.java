/*
 EJERCICIO 4: NIVEL 3 

 Se dispone de una lista de Integer, de la cual queremos obtener otra lista
 aplicando la operación de factorial pero no se desean valores repetidos.
 
 Input (Entrada)
 List<Integer> palabras = List.of(1, 2, 4, 4, 4);
 
 Output (Salida):
 [1, 2, 24]

 */

import SourcePackage.OperadorListas;
import java.util.List;

public class FactorialesUnicos {
    public static void main(String[] args) {
        // Creo un objeto de tipo 'OperadorListas'.
        OperadorListas factoriales = new OperadorListas();
        // Defino una lista con valores para hallar factoriales.
        List<Integer> lista = List.of(1, 2, 4, 4, 4);
        // Aplico el método 'calcular factorial' con la lista de argumento.
        factoriales.calcularFactorial(lista);
        
    }
}
