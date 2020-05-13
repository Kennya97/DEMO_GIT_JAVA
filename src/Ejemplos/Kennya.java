
//KENNYA
package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;    

public class Kennya {
public static void main(String[] args) throws IOException {

try { //objeto leer de la clase bufferedReader
    
BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));

double num1, num2= 0.0; 

System.out.println("Ingrese el primer número");
num1= Double.parseDouble(leer.readLine()) ;

System.out.println("Ingrese el segundo numero");
num2= Double.parseDouble(leer.readLine()) ;

System.out.println("Ingrese la inicial de la operacion matematica:");

String inicial = leer.readLine();

calculadora (num1,num2, inicial.toUpperCase().charAt(0));


}catch(Exception e){
    
System.out.println(e.getMessage());

} 
}

public static void calculadora (double num1, double num2, char inicial){
try{
    
double resultado = 0.0;

String inicial_operacion="";
if(inicial == 'S'){
inicial_operacion = "Suma";
resultado= num1+num2;

}else if (inicial == 'R'){
inicial_operacion = "Resta";

resultado = num1-num2;
}else if(inicial == 'M'){
inicial_operacion = "Mutiplicación";

resultado = num1*num2;
}else if(inicial == 'D'){
inicial_operacion = "División";

resultado = num1 / num2;
}
System.out.println("El resultado de la operación " + inicial_operacion +" es de:  "+ resultado);

}catch (ArithmeticException ea){
System.out.println("No se puede dividir en cero !!!!!");
}
}
}