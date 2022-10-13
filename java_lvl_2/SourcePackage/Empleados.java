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
import java.util.ArrayList;

public class Empleados {
    
    String nombreApellido;
    int dni;
    ArrayList<Integer> horasTrabajadas = new ArrayList<>();
    ArrayList<Integer> valorPorHora = new ArrayList<>();
    int sueldo;

    //Agrego solo métodos get para hacer mas rapido el temita xd
    public String nombre() {
        return nombreApellido;
    }

    public int dni() {
        return dni;
    }

    public int sueldo() {
        return sueldo;
    }


    public void agregarHoras(int lunes, int martes, int miercoles, int jueves, int viernes){
        horasTrabajadas.add(lunes);
        horasTrabajadas.add(martes);
        horasTrabajadas.add(miercoles);
        horasTrabajadas.add(jueves);
        horasTrabajadas.add(viernes);
    }

    public void AgregarValorHoras(int vLunes, int vMartes, int vMiercoles, int vJueves, int vViernes){
        valorPorHora.add(vLunes);
        valorPorHora.add(vMartes);
        valorPorHora.add(vMiercoles);
        valorPorHora.add(vJueves);
        valorPorHora.add(vViernes);
    }

    public void calcularSueldo(){

        for(int i=0; i<horasTrabajadas.size(); i++){
            var calculoSemanal = horasTrabajadas.get(i)*valorPorHora.get(i);
            sueldo += calculoSemanal;
        }
    }
}
