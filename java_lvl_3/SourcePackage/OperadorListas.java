package SourcePackage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OperadorListas {

    // Método para 'filtrarStrings' de un ArrayList.
    public void filtrarStrings(ArrayList<String> lista){
        // El 'for' recorre cada elemento de la lista
        for(String i : lista){
            // Si el elemento es 'null', se continúa.
            if(i==null){
                continue;
            //Si el elemento NO es 'null', imprimo el elemento.
            }else{
                // Si el elemento es el último de la lista:
                if(lista.indexOf(i)==lista.size()){
                    // Lo imprimo sin espacio al final.
                    System.out.print(i);
                // Si el elemento no es el último de la lista:
                }else{
                    // Agrego un espacio para distanciarlo.
                    System.out.print(i + " ");
                }
            }
        }
    }
    
    // Metodo que aplica potencia a elementos de una lista de Enteros.
    public void AplicarPotencia(List<Integer> lista){
        // Defino una lista de almacenamiento para los números potenciados.
        List<Integer> listaPotenciada = new ArrayList<>();

        // Recorro los elementos de la lista 'argumentada'.
        for(int i : lista){
            // Defino una variable que es igual al elemento por sí mismo.
            int j = i*i;
            // Lo adhiero a la nueva lista de valores potenciados.
            listaPotenciada.add(j);
        }
        // Imprimo la lista.
        System.out.println(listaPotenciada);
    }

    // Método para contar palabras que comiencen con una letra específica.
    public void contadorPalabrasConLetra(List<String> lista, char letra){
        // Variable que registra la cantidad de palabras halladas.
        int registroPalabras = 0;
        // Recorro los elementos de la lista.
        for(String elemento : lista){
            // Recorro los índices de los elementos.
            for(int i=0; i<elemento.length(); i++){
                // Defino variable tipo 'char' que convierte en 'char'
                // el caracter de un elemento en la posición indicada
                char j = elemento.charAt(i);
                // Convierto el char 'letra' en mayúscula y minúsculas
                // Para dar el efecto 'ignoreCase': 'j' = 'J' && 'J' = 'j'.
                char jLower = Character.toLowerCase(letra);
                char jUpper = Character.toUpperCase(letra);
                //Si 'j' es igual al primer caracter de un elemento: 
                if(j == elemento.charAt(0)){
                    // Y si 'j' es igual al caracter que se busca
                    // en los primeros caracteres de cada elemento:
                    if(j == jUpper || j == jLower){
                        // El contador suma un valor.
                        registroPalabras += 1;
                    }
                }
            }
        }
        // Imprimo la información solicitada.
        System.out.println("Hay " + registroPalabras + " palabras que comienzan con 'B'");
    }

    public void calcularFactorial(List<Integer> lista){
        // Defino un 'set' vacío que va a almacenar los factoriales.
        // Es de tipo 'HashSet' para evitar valores repetidos.
        Set<Integer> factoriales = new HashSet<Integer>();
        // El 'for' va a recorrer los elementos de una 'lista' de enteros.
        for(int elemento : lista){
            // Pongo un 'acumulador' que se inicializa en '1'.
            // Para evitar lidiar con el '0' y empezar desde el elemento '1'.
            int factor = 1;
            /*
             Un 'for' anidado recorre los elementos para encontrar las
             cifras anteriores al elemento a partir del valor '1'.
             Es decir: Si el elemento es 5, recorre: 1, 2, 3, 4, 5.
            */
            for(int index=1; index<=elemento; index++){
                // Acá declaro que el 'factor' es igual sí mimos multiplicado por 'index'.
                // Si el elemento es '5': 5! = (((1*2)*3)*4)*5
                factor = factor*index;
            }
            // Agrego el factor al 'HashSet' y listo.
            factoriales.add(factor);
        }
        // Imprimo la nueva lista sin valores repetidos.
        System.out.println(factoriales);
    }
    
}
