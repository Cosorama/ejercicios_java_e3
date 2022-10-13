/*
 EJERCICIO 4: NIVEL 2

 Crear una lista que contenga como elementos la numeración de cartas
 de una baraja francesa(solo los valores, no figuras).
 Se deberá cargar el ArrayList (en orden), imprimir, imprimir en
 orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 
 ACLARACIÓN!!!!!!!!!!!!!!!!!
 'Carta.java' es la clase encargada de crear cartas. Crea una, no un mazo.
 Crear un 'mazo' es un método de la clase 'Barja.java'.

 */

package SourceBarajas.BarajaConMetodo;

public class Carta {

    int valorCarta;

    // Método get para leer 'valorCarta'
    public int getValorCarta() {
        return valorCarta;
    }

    // Método set para agregar o modificar 'valorCarta'
    public void setValorCarta(int valorCarta) {
        this.valorCarta = valorCarta;
    }

    // Método para crear el valor de 'valorCarta'.
    public void crearCarta(int valor){
        //El valor ingresado es el nuevo 'valorCarta'.
        setValorCarta(valor);
    }


    // Testeo mediante objetos.
    // public static void main(String[] args) {
        // Carta carta = new Carta();
        // carta.crearCarta(2);
        // System.out.println(carta.getValorCarta());
    // }

    public static void main(String[] args) {
        for(int n=1; n<13; n++){
            System.out.println(n);
        }
    }

}
