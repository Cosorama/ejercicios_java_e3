/*
 EJERCICIO 6: NIVEL 2
 
 Se dispone de una colección de Empleados, de cada empleado se conoce:
 
 Nombre y Apellido
 DNI
 horasTrabajadas
 valorPorHora
 
 Todos los empleados están cargados en un Set (HashSet),
 se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa
 lista para luego almacenar en un Map (o Diccionario) donde la clave (key)
 es el dni y el valor (value) es el sueldo calculado. 

*/

package SourcePackage;
import java.util.HashMap;
import java.util.HashSet;

public class HashSetEmpleados {
    
    public static void main(String[] args) {

        //CREACIÓN DE OBJETOS DE TIPO 'EMPLEADOS':
        //Creo un primer objeto 'persona' de clase Empleados.
        Empleados persona1 = new Empleados(); 
        persona1.nombreApellido = "Matias";
        persona1.dni = 35685263;
        persona1.agregarHoras(4, 5, 4, 7, 2);
        persona1.AgregarValorHoras(200, 300, 400, 500, 600);
        //Creo un segundo objeto 'persona' de clase Empleados.
        Empleados persona2 = new Empleados(); 
        persona2.nombreApellido = "Dana";
        persona2.dni = 36859752;
        persona2.agregarHoras(2, 8, 6, 5, 5);
        persona2.AgregarValorHoras(200, 300, 400, 500, 600);
        //Creo un tercer objeto 'persona' de clase Empleados.
        Empleados persona3 = new Empleados(); 
        persona3.nombreApellido = "Karla";
        persona3.dni = 38657256;
        persona3.agregarHoras(5, 10, 3, 7, 6);
        persona3.AgregarValorHoras(200, 300, 400, 500, 600);
     
        //Defino un HashSet (vacío de momento)
        HashSet<Empleados> empleadosSet = new HashSet<>();

        //Agrego los empleados (objetos creados) al HashSet.
        empleadosSet.add(persona1);
        empleadosSet.add(persona2);
        empleadosSet.add(persona3);

        //Defino un HashMap vacío.
        HashMap<Integer, Integer> sueldosRegistrados = new HashMap<>();        

        //Recorro el Hashet en tanto tomemos los 'empleados' del HashSet que los contiene.
        for(Empleados empleado : empleadosSet){

            //Al empleado le aplico el método 'calcularSueldo'.
            empleado.calcularSueldo();
            //Al Hashmap le adhiero el elemento con el dni como clave y el sueldo como valor.
            sueldosRegistrados.put(empleado.dni(), empleado.sueldo());
        }

        //Recorro el HashMap con el metodo '.Entry' con la variable 'registro' en el HashMap.
        for(HashMap.Entry<Integer, Integer> registro : sueldosRegistrados.entrySet()){
            //Doy formato a la información para sacarla por pantalla xd
            System.out.println("DNI: " + registro.getKey() + ", Sueldo: $" + registro.getValue());
        }
    }
}
