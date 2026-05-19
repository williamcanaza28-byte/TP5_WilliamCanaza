package tp5_ejercicio8;
import java.util.Scanner;
public class TP5_Ejercicio8 {
public static void main(String[] args) {
    Scanner lector = new Scanner (System.in);
    //guarda la frase completa
    String frase;
    System.out.println("ingrese una frase:");
    //leer frase
    frase = lector.nextLine();
    //split ayuda a separar usando espacios
    String[] palabras = frase.split(" ");
    //recorre todas las palabras
    for(int i = 0; i < palabras.length; i++){
    //muestra la palabra y la cantidad de letras
    System.out.println(palabras[i]+" -> "+palabras[i].length()+" letras ");    
    }
  }  
}
