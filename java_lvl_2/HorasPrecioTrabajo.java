/*
 EJERCICIO 5: NIVEL 2
 
 Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2)
 del resumen de carga de horas semanal de un empleado.
 Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
 
 Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie.

 Input (Entrada):
 [6, 7, 8, 4, 5]
 [350, 345, 550, 600, 320]

 Output (Salida):
 [2100, 2415, 4400, 2400, 1600]
 Total Final: $ 12915

*/

import java.util.ArrayList;
import java.util.Arrays;

public class HorasPrecioTrabajo {
    public static void main(String[] args) {
        //Defino los ArrayList como en el ejemplo.
        ArrayList<Integer> horasTrabajadas = new ArrayList<>(Arrays.asList(6, 7, 8, 4, 5));
        ArrayList<Integer> valorPorHora = new ArrayList<>(Arrays.asList(350, 345, 550, 600, 320));

        //Declaro un ArrayList vacío que va a guardar las horas pagas.
        ArrayList<Integer> horasPagas = new ArrayList<>();
        //Una variable de tipo entero para el total
        int total = 0;

        //Con un 'for' recorro cualquiera de las dos listas principales.
        for(int i=0; i<horasTrabajadas.size(); i++){
            //Defino una variable temporal que almacena la multiplicación de 'horas*valor'
            //identificados por su índice (i) en ambas lístas, que son iguales.
            var calculoSemanal = horasTrabajadas.get(i)*valorPorHora.get(i);
            //Agrego ese valor a la lista de cálculo semanal.
            horasPagas.add(calculoSemanal);
            //Sumo el valor del cálculo a la variable del total que lo acumula.
            total += calculoSemanal;
        }
        //Imprimo los resultados.
        System.out.println("Horas trabajadas: " + horasPagas);
        System.out.println("Total a cobrar: $ " + total);
    }
}
