/*
 EJERCICIO 8: NIVEL 1

 Crear una aplicación que solicite de entrada los datos de una persona en este orden:
 
 Nombre y Apellido
 Edad
 Dirección
 Ciudad
 
 Luego imprimirá el siguiente mensaje:
 
 {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

*/

package SourcePackage;

public class Persona {

	// Definición de atributos.
	String nombreApellido;
	int edad;
	String direccion;
	String ciudad;

	// Definición de método.
	// Como opero desde dentro, no necesito
	// Metodos get y set.
	public void detallePersona() {
		System.out.println(ciudad + " - " + direccion);
		System.out.println("Edad: " + edad + " - " + nombreApellido);
	}
}