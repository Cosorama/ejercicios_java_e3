/*
 EJERCICIO 5: NIVEL 3
 
 Se posee una Lista con objetos de clase Alumno con los atributos:
    > Apellido<String>
    > Nombre<String>
    > fechaDeNacimiento<LocalDate>
 
 Se desea generar un Map<String, Integer> donde la clave de Map
 será el apellido concatenado con el nombre (con separador de espacio)
 y el value la edad del alumno.

    > La lista de entrada debe estar cargada con varios alumnos (al menos 5)
      para subir el ejemplo y demostrar su funcionamiento.
    > En ejemplo se muestra solo con 1 Alumno a modo de abreviar
    > En el ejemplo se usa LocalDate.now().minusYears(30): 
      > En el ejercicio a presentar se deberá usar otra tecnica de 
        construcción para la fecha:  
        > NO usar .now().
        > Pueden ver métodos .parse(), etc.

 Input (Entrada)
 List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson",
 LocalDate.now().minusYears(30)));
 
 Output (Salida):
 {"Simpson Homero"=30}
 
*/

import SourcePackage.Alumno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapAlumnos {
    public static void main(String[] args) {
      // Primer alumno creado.
      Alumno persona1 = new Alumno();
      persona1.Apellido("Tello");
      persona1.Nombre("Marco");
      persona1.Edad("1992-09-06");
      // Segundo alumno creado.
      Alumno persona2 = new Alumno();
      persona2.Apellido("Wicovicz");
      persona2.Nombre("Alejandra");
      persona2.Edad("1993-05-03");
      // Tercer alumno creado.
      Alumno persona3 = new Alumno();
      persona3.Apellido("Navarro");
      persona3.Nombre("Ariel");
      persona3.Edad("1987-08-13");
      // Cuarto alumno creado.
      Alumno persona4 = new Alumno();
      persona4.Apellido("Palecki");
      persona4.Nombre("Mariana");
      persona4.Edad("2000-02-20");
      // Quinto alumno creado.
      Alumno persona5 = new Alumno();
      persona5.Apellido("Bagna");
      persona5.Nombre("Julian");
      persona5.Edad("2002-12-24");

      // Defino la lista con al menos 5 alumnos como se pide.
      List<Alumno> alumnosLista = new ArrayList<Alumno>(Arrays.asList(persona1, persona2, persona3, persona4, persona5));

      // Creo un HashMap vacío para almacenar los datos {String apellidoNombre = Int edad}
      HashMap<String, Integer> mapAlumnos = new HashMap<String, Integer>();

      // Recorro los objetos de tipo 'Alumno' en 'alumnosLista'.
      for(Alumno alumno : alumnosLista){
        // Agrego los resultados al map con '.put(alumno, edad)';
        // Uso los métodos que definí en la clase 'Alumno' para esto.
        mapAlumnos.put(alumno.NombreApellido(), alumno.calcularEdad());
      }

      // Itero el HashMap con 'forEach' para mostrar los resultados.
      mapAlumnos.forEach((k,v) -> System.out.println("\n\tAlumno: " + k + " | Edad: " + v));

    }
}
