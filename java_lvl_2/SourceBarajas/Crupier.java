/*
 EJERCICIO 4: NIVEL 2

 Crear una lista que contenga como elementos la numeración de cartas
 de una baraja francesa(solo los valores, no figuras).
 Se deberá cargar el ArrayList (en orden), imprimir, imprimir en
 orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 
 ACLARACIÓN!!!!!!!!!!!!!!!!!
 En esta clase voy a crear una baraja que a su vez es capaz de crear cartas.
 En cierta forma es un 'Crupier' que opera la baraja: Crea, Ordena, Invierte, Mezcla.

 */

package SourceBarajas;
// Importo la clase 'Baraja' de su paquete.
import SourceBarajas.BarajaConMetodo.Baraja;

public class Crupier{
    public static void main(String[] args) {
        
        // Creo el objeto 'baraja' del tipo 'Baraja'.
        Baraja baraja = new Baraja();
        // Uso el objeto para 'crear' el 'mazo'.
        baraja.crearMazo();
        // Una vez que creo el 'mazo', lo 'mezclo'.
        baraja.mezclarMazo();
        // También voy a 'invertir' el 'mazo'.
        baraja.invertirMazo();
        // Por último, voy a 'ordenar' el 'mazo'.
        baraja.ordenarMazo();
    }
}