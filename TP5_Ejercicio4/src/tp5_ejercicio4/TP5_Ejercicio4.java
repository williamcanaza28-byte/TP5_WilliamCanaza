package tp5_ejercicio4;
import java.util.Scanner;
public class TP5_Ejercicio4 {
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    //guarda cantidad de filas y columnas
    int filas;
    int columnas;
    //pedir filas
    System.out.print("ingrese cantidad de filas:");
    filas = teclado.nextInt();
    //pedir columnas
    System.out.println("ingrese cantidad de columnas:");
    columnas = teclado.nextInt();
    //Sirve para limpiar el ENTER que queda guardado después del nextInt()
    teclado.nextLine();
    //usamos String porque vamos a guardar palabras y numeros 
    String[][] matriz = new String [filas][columnas];    
    //recorre filas
    for(int i = 0; i < filas; i++){
    //recorre columnas
    for(int j = 0; j < columnas; j++){
    //muestra donde se va a guardar el dato    
    System.out.println("Fila " + i + "  Columna " + j);
    //lee lo que escribe el usuario y lo guarda
    matriz[i][j] = teclado.nextLine();
    }    
    }
    System.out.println("Matriz cargada:");
    //recorren toda la matriz para mostrarla
    for(int i = 0; i < filas; i++){
    for(int j = 0; j < columnas; j++){
    //usamos print para que salga todo en la misma linea    
    System.out.print(" " + matriz[i][j]);    
    }
    //cuando termina una fila baja a la siguiente
    System.out.println(" ");
    } 
  } 
}
