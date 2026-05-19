package tp5_ejercicio9;
import java.util.Scanner;
public class TP5_Ejercicio9 {
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    //guarda la cantidad de filas
    int filas;
    //pedir filas
    System.out.println("ingrese cantidad de filas:");
    filas = teclado.nextInt();
    //crea las filas que quiera el usuario y 3 columnas fijas
    int[][] matriz = new int[filas][3];
    for(int i = 0; i < filas; i++){
    //mostrar fila
    System.out.println("fila " + i);
    //guardar primer numero
    System.out.println("ingrese primer numero:");
    matriz[i][0] = teclado.nextInt();
    //guardar segundo numero
    System.out.println("ingrese segundo numero:");
    matriz[i][1] = teclado.nextInt();
    //suma columna 0 + columna 1 y da el resultado en columna 2
    matriz[i][2] = matriz[i][0] + matriz[i][1];
    } 
    System.out.println("matriz completa:");
    //recorre filas
    for(int i = 0; i < filas; i++){
    //recorre columnas
    for(int j = 0; j < 3; j++){
    //mostrar elementos
    System.out.print(" " + matriz[i][j]);
    }
    System.out.println(" ");
    }
  }   
}
