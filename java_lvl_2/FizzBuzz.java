/*
 EJERCICIO 7: NIVEL 2

 Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo),
 nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. 
 Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz”
 y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 

 Observacion: Los 2 argumentos indican con que valor se arranca a calcular
 y el segundo con qué valor debe frenar (no se incluye en el cálculo)
 Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 

 funcionFizzBuzz(1,6) // 6 si marca el límite y no se lo incluye
 funcionFizzBuzz(1,8)

 [“1”, “Fizz”, “Buzz”, “Fizz”, “5”]
 [“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]

*/

import java.util.Arrays;

public class FizzBuzz {

    int a;
    int b;

    //Defino un metodo de tipo entero 'funcionFizzBuzz'.
    
    public void funcionFizzBuzz(int a, int b){
        
        int listaEnteros[] = new int[b-a+1];
        String FizzBuzz[] = new String[listaEnteros.length];

        for(int i=0; i<b; i++){

            listaEnteros[i] = i;
            
            for(int j=0; j<b; j++){
                if(listaEnteros[j] % 2 == 0 && listaEnteros[j] % 3 != 0){
                    FizzBuzz[j] = "Fizz";
                }else if(listaEnteros[j] % 3 == 0 && listaEnteros[j] % 2 != 0){
                    FizzBuzz[j] = "Buzz";
                }else if(listaEnteros[j] % 2 ==0 && listaEnteros[j] % 3 == 0){
                    FizzBuzz[j] = "FizzBuzz";
                }else{
                    FizzBuzz[j] = String.valueOf(j);
                }
            }
        }
        
        System.out.println(Arrays.toString(FizzBuzz));

    }

    //Lo ejecuto directamente acá para simplificar.
    public static void main(String args[]){

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.a = 1;
        fizzBuzz.b = 5;
        fizzBuzz.funcionFizzBuzz(1, 7);

    }
}
