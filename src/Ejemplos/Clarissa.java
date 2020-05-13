
//KENNYA
package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Clarissa {

public static void main(String[] args) throws IOException {
try { //objeto leer de la clase bufferedReader
 
BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));

double kilogramos, estatura, resultados=0.0;

System.out.println("Ingrese su peso en KILOGRAMOS: ");
kilogramos= Double.parseDouble(leer.readLine());

System.out.println("Ingrese su estatura en METROS: ");
estatura= Double.parseDouble(leer.readLine());

calcular_indice(kilogramos, estatura, resultados);
    
}catch(Exception e){
System.out.println(e.getMessage());  
    
}
}
public static void calcular_indice(double kilogramo, double estatura, double resultados){
NumberFormat formato = new DecimalFormat ("#0.00");
resultados = 0.0;

String mensaje=""; 

resultados = (kilogramo) / (estatura* estatura) ;

if(resultados < 18){
mensaje="PESO BAJO NECESARIO VALORAR SIGNOS DE DESNUTRICIÓN";

}else if (resultados >= 18  && resultados <= 24.9){
    
mensaje= "LA CLASIFICACIÓN ES NORMAL ";

}else if(resultados >= 25 && resultados <= 26.9){
    
mensaje= "LA CLASIFICACIÓN ES SOBREPESO  ";


}else if(resultados >= 27 && resultados <= 27 ){
    
mensaje= "LA CLASIFICACIÓN ES OBECIDAD ";

}else if(resultados >= 27 && resultados <= 29.9 ) {
  
    mensaje= "LA CLASIFICACIÓN ES OBECIDAD  GRADO I";

}else if(resultados >= 30 && resultados <= 39.9 ) {
  
    mensaje= "LA CLASIFICACIÓN ES OBECIDAD  GRADO II";

}else if(resultados >= 40 ) {
  
    mensaje= "LA CLASIFICACIÓN ES OBECIDAD  GRADO III EXTRREMA O MÓRBIDA";
}
System.out.println("El resultado del indice de masa corporal es: "+ formato.format(resultados)+" "+ mensaje);
}
}
