/*
 EJERCICIO 2: NIVEL 2
 
 Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y otro al final.
 Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de agregar a en la primera y última posición).

 */

import java.util.ArrayList;
import java.util.Scanner;

public class ColaFila{
    public static void main(String args[]){
        
        //Declaro un arrayList de números de tipo entero.
        ArrayList<Integer> numeros; 
        //Acá instancio la variable de tipo arrayList.
        numeros = new ArrayList<Integer>();

        //Agrego elementos al arrayList:
        numeros.add(10);
        numeros.add(50);
        numeros.add(34);
        numeros.add(128);
        numeros.add(24);

        //Itero la lista inicial con sus índices respectivos:
        for(int i=0; i<numeros.size(); i++) {
            System.out.println("Indice: " + i + " Numero: " + numeros.get(i));
        }

        Scanner entrada = new Scanner(System.in);

        //Pido al usuario que me diga si el número se tiene que agregar al principio o al final:
        System.out.println("1. Agregar un número al comienzo\n2. Agregar un número al final: ");
        var indexAdd = Integer.parseInt(entrada.nextLine());
        
        //Pido que me proporcione el número para agregar.
        System.out.println("Introducí el número que desea agregar a la lista: ");
        var numeroAdd = Integer.parseInt(entrada.nextLine());

        if(indexAdd == 1){
            //Si el número se tiene que agregar al principio: 
            numeros.add(0, numeroAdd);
        
        }else if(indexAdd == 2){
            //Si el número se agrega al final, entonces: 
            numeros.add(numeroAdd);
        
        }else{
            //Si la opción seleccionada no existe, imprimo el error.
            System.out.println("Opción inexistente.");
        
        }

        //Itero la lista final con sus índices respectivos:
        for(int i=0; i<numeros.size(); i++) {
            System.out.println("Indice: " + i + " Numero: " + numeros.get(i));
        }
    }
}