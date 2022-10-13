/*
 EJERCICIO 3: NIVEL 2
 
 Cargar un arrayList con 12 nombres de estudiantes (String),
 luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
 
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Estudiantes {
    public static void main(String args[]){
        
        //Creo un ArrayList con los 12 estudiantes.
        ArrayList<String> estudiantes = new ArrayList<String>(Arrays.asList("Martin", "Daniela", "Roberto",
                                                                                  "Karla", "Santiago", "Alejandra",
                                                                                  "Matias", "Paula", "Julian",
                                                                                  "Agustin", "Ximena", "Lucio"));
        //Creo los ArrayList de los tres cursos vacíos.
        ArrayList<String> cursoA = new ArrayList<String>();
        ArrayList<String> cursoB = new ArrayList<String>();
        ArrayList<String> cursoC = new ArrayList<String>();

        //Uso un 'for' para recorrer el ArrayList de 'estudiantes'.
        //'i' se inicializa en 0, y siempre que sea menor o igual que estudiantes, se post-decrementa.
        for(int i=0; i<=estudiantes.size(); i++){
            //Si 'i' es menor a 4:
            if(i<4){
                //Agrego esos estudiantes al curso 'A'.
                cursoA.add(estudiantes.get(i));
            
            //Sino, si 'i' es mayor o igual que 4 y menor o igual que 7:   
            }else if(i>=4 && i<=7){
                //Agrego esos estudiantes al curso 'B'.
                cursoB.add(estudiantes.get(i));
            
            //Sino, si 'i' es mayor o igual que 8 y menor que 12:
            }else if(i>=8 && i<12){
                //Agrego esos estudiantes al curso 'C'.
                cursoC.add(estudiantes.get(i));

            }
        }

        //Imprimo los tres cursos (la consigna no pide que los itere, así que los imprimo así).
        System.out.println("Estudiantes del Curso A: " + cursoA);
        System.out.println("Estudiantes del curso B: " + cursoB);
        System.out.println("Estudiantes del curso C: " + cursoC);
    }
}
