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

import java.util.Scanner; 

public class TestPersona{
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);

		Persona personaObjeto = new Persona();		
		
		System.out.println("Nombre y apellido: ");
		var nombrePersona = entrada.nextLine();

		System.out.println("Edad: ");
		var edadPersona = Integer.parseInt(entrada.nextLine());

		System.out.println("Direccion: ");
		var direccionPersona = entrada.nextLine();

		System.out.println("Ciudad: ");
		var ciudadPersona = entrada.nextLine();	

		personaObjeto.nombreApellido(nombrePersona);
		personaObjeto.edad(edadPersona);
		personaObjeto.direccion(direccionPersona);
		personaObjeto.ciudad(ciudadPersona);

		persona.detallesPersona();
	
	}
}