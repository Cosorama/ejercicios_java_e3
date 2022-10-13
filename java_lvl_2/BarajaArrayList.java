/*
 EJERCICIO 4: NIVEL 2

 Crear una lista que contenga como elementos la numeración de cartas
 de una baraja francesa(solo los valores, no figuras).
 Se deberá cargar el ArrayList (en orden), imprimir, imprimir en
 orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 
 ACLARACIÓN!!!!!!!!!!!!!!!!!
 Acá conseguí operar sobre la lista misma y sin métodos. Pensé que iba a ser
 más complicado, pero resulto ser más fácil y práctico, aunque sería más cómodo
 usar un método.

 Para ver como usar los métodos, revisar 'BarajaConArray.java'. Las operaciones sobre
 el Array y el ArrayList de ambos ejercicios son los mismos, pero con métodos de cada
 objeto de distinto tipo:

        > Ej. Arreglo: valoresCartas.length / ArrayList: valoresCartas.size()
        > Ej. Arreglo: valoresCartas[indice] / ArrayList: valoresCartas.get(indice)
        > Ej. Arreglo: valoresCartas[indice] = valor / ArrayList: valoresCartas.set(indice, valor)

 */

import java.util.ArrayList;
import java.util.Arrays;

public class BarajaArrayList {
   
    // MÉTODO MAIN PARA EJECUTAR
    public static void main(String[] args) {

        // 1. Genero un ArrayList con los valores de las cartas (relativamente ordenadas) en un Arrays con el método '.asList()'.
        ArrayList<Integer> valoresCartas = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 5, 8, 6, 7, 9, 10, 11, 12, 13));
                
        /*
         Si NO QUISIERA un ArrayList(Arrays.asList()), a los valores los puedo agregar
         convencionalmente:
         
         valoresCartas.add(1); valoresCartas.add(3);
         valoresCartas.add(2); valoresCartas.add(4);
         valoresCartas.add(5); valoresCartas.add(8);
         valoresCartas.add(6); valoresCartas.add(7);
         valoresCartas.add(9); valoresCartas.add(10);
         valoresCartas.add(11); valoresCartas.add(12);
         valoresCartas.add(13);
          
         Yo no lo hice de esta manera, porque:
         Si tenemos un método que 'cree' una baraja de forma aleatoria,
         los valores no se introducen uno por uno a un 'ArrayList(Arrays.asList())'.
         Se cargan en el orden en que se van creando aleatoriamente y agregándose
         en un ArrayList o un Array.
         */

        //Imprimo la ArrayList con el orden original para compararlo cuando lo ordeno.
        System.out.println("Mazo Original: " + valoresCartas);

        /* 3. Ordeno, invierto y mezclo el ArrayList 'valoresCartas'.
         Acá podría usar métodos como en el ejemplo anterior
         pero para acelerar el proceso y hacerlo de otra forma: 
         */

        //ORDENO el ArrayList 'valoresCartas'.
        for(int index=0; index<valoresCartas.size(); index++){
            // Misma aclaración que arriba.
            for(int nextIndex=index+1; nextIndex<valoresCartas.size(); nextIndex++){

                // De igual manera acá. En vez de: 'if(mazo[nextIndex] < mazo[index]){}
                // Como 'mazo' es un Arraylist:    'if(mazo.get(nextIndex) < mazo.get(index)){}'
                if(valoresCartas.get(nextIndex)<valoresCartas.get(index)){
                    int menorIndice = valoresCartas.get(nextIndex);
                    int mayorIndice = valoresCartas.get(index);

                    valoresCartas.set(index, menorIndice);
                    valoresCartas.set(nextIndex, mayorIndice);
                }
            }
        }
        //Imprimo la lista 'valoresCartas' de forma ordenada.
        System.out.println("Mazo Ordenado: " + valoresCartas);

        //INVIERTO el ArrayList 'valoresCartas'.
        for(int index=0; index<valoresCartas.size(); index++){
            for(int nextIndex=index+1; nextIndex<valoresCartas.size(); nextIndex++){

                //'if(mazo[nextIndex] > mazo[index]){}
                //'if(mazo.get(nextIndex) > mazo.get(index)){}'
                if(valoresCartas.get(nextIndex)>valoresCartas.get(index)){
                    int menorIndice = valoresCartas.get(nextIndex);
                    int mayorIndice = valoresCartas.get(index);

                    valoresCartas.set(index, menorIndice);
                    valoresCartas.set(nextIndex, mayorIndice);
                }
            }
        }
        //Imprimo la lista 'valoresCartas' de forma ordenada.
        System.out.println("Mazo Invertido: " + valoresCartas);

        //MEZCLO el ArrayList 'valoresCartas'.
        for(int index=0; index<valoresCartas.size(); index++){
            for(int nextIndex=index+1; nextIndex<valoresCartas.size(); nextIndex++){

                /*
                 Acá la condición cambia: Si 'nextIndex' (indice de la derecha) es multiplo de 2
                                          && 'index' (indice de la izquierda) es múltiplo de 3.
                                          Entonces invierto los valores.

                                          Sino, los valores quedan como se encuentren primero.
                */
                //'if(valoresCartas.get(nextIndex)%2==0 && valoresCartas.get(index)%3==0){}'
                if(valoresCartas.get(nextIndex)%2==0 && valoresCartas.get(index)%3==0){
                    int menorIndice = valoresCartas.get(nextIndex);
                    int mayorIndice = valoresCartas.get(index);

                    valoresCartas.set(index, menorIndice);
                    valoresCartas.set(nextIndex, mayorIndice);
                }else{
                    int menorIndice = valoresCartas.get(nextIndex);
                    int mayorIndice = valoresCartas.get(index);

                    valoresCartas.set(index, mayorIndice);
                    valoresCartas.set(nextIndex, menorIndice);
                }
            }
        }
        //Imprimo la lista 'valoresCartas' de forma ordenada.
        System.out.println("Mazo Mezclado: " + valoresCartas);
    }

}
