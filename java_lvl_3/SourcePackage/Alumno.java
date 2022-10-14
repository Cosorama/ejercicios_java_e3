package SourcePackage;
import java.time.LocalDate;

public class Alumno {
    String apellido;
    String nombre;
    LocalDate edad;
    LocalDate hoy = LocalDate.now();
    
    // Método Get: Apellido.
    public String Apellido() {
        return apellido;
    }

    // Método Set: Apellido.
    public void Apellido(String apellido) {
        this.apellido = apellido;
    }

    // Método Get: Nombre.
    public String Nombre(){
        return nombre;
    }
    // Método Set: Nombre.
    public void Nombre(String nombre){
        this.nombre = nombre;
    }

    // Método Get: Edad.
    public LocalDate Edad() {
        return edad;
    }
    // Método Set: Edad.
    // Recibe los parámetros como enteros:
    public void Edad(String edad) {
        // Convierto el 'String' en 'LocalDate' con .parse().
        // Para que las fechas no den error:
            // Para año se usan 4 cifras, para el mes y día 2.
            // LocalDate edad = Localdate.parse("yyyy-mm-dd");
        this.edad = LocalDate.parse(edad);
        
        /*
         Sin usar 'now' también podría pedir que se ingrese
         la fecha por enteros y construir el 'LocalDate' con
         el método '.of(entero1, entero2, entero3)'. Ejemplo:

            public void Edad(int anio, int mes, int dia){
                    this.edad = Localdate.of(anio, mes, dia);
            }

         Y la clase que lo ejecuta quedaría:

            objetoTipoAlumno.Edad(anio, dia, mes);

        */
    }

    // Retorno de Nombre y Apellido.
    public String NombreApellido(){
        return nombre + " " + apellido;
    }

    // Método para calcular edad.
    public int calcularEdad(){
        /*
         El 'LocalDate hoy' se encuentra en la clase, 
         para que siempre esté actualizada desde acá y no
         dependa de valores de afuera. Ahí sí usé '.now'.

         Si no podría poner directamente un 'LocalDate.parse()'
         en el archivo que ejecuta usa esta clase e introducir
         la fecha ahí con Scanner, introducirla como parámetro
         en este método y realizar la comparacion con edad.

         No hice uso de ese 'método' porque si el usuario coloca
         la fecha en formato equivocado, el programa se rompe.
         Es más seguro así.
         
        */
        
        // Creo una variable que almacena la comparación:
        int anios = hoy.compareTo(Edad());

        // La retorno.
        return anios;
    }
}
