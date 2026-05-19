package tp5_ejercicio7;
import java.util.Scanner;
public class TP5_Ejercicio7 {
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int filas;
    int columnas;
    //pedir filas 
    System.out.println("ingrese cantidad de filas:");
    filas = teclado.nextInt();
    //pedir columnas
    System.out.println("ingrese cantidad de columnas:");
    columnas = teclado.nextInt();
    //creamos la matriz
    int[][] matriz = new int[filas][columnas];
    System.out.println("ingrese los numeros:");
    //recorremos las filas y columnas
    for(int i = 0; i < filas; i++){
    for(int j = 0; j < columnas; j++){
    System.out.println("fila " + i + " columna " + j);
    //lee y guarda numeros
    matriz[i][j] = teclado.nextInt();   
    }    
    }
    //guarda la suma de numeros validos
    int suma = 0;
    //cuenta cuantos numeros cumplen la condicion
    int cantidad = 0;
    //segundo recorrido de la matriz
    for(int i = 0; i < filas; i++){
    for(int j = 0; j < columnas; j++){
    //si el numero es positivo y si el numero es impar
    if(matriz[i][j] > 0 && matriz[i][j] % 2 != 0){
    suma = suma + matriz[i][j];
    cantidad = cantidad +1;
    }    
    }
    }
    //uso del double para que el resultado tenga coma
    double promedio;
    promedio = (double) suma / cantidad;
    System.out.println("promedio: " + promedio);
  }
}
