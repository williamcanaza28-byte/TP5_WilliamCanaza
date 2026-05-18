package tp5_ejercicio3;
import java.util.Scanner;
public class TP5_Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //variables filas y columnas
        int filas;
        int columnas;
        //pedir filas
        System.out.println("Ingrese cantidad de filas:");
        filas = lector.nextInt();
        //pedir columnas
        System.out.println("Ingrese cantidad de columnas:");
        columnas = lector.nextInt();
        //creamos matriz
        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingrese los numeros:");
        //recorre las filas
        for(int i = 0; i < filas; i++) {
        //recorre las columnas
        for(int j = 0; j < columnas; j++) {
        //mostrar posicion
        System.out.println("Fila " + i + "  Columna " + j);
        //guardar numero
        matriz[i][j] = lector.nextInt();
        }
        }
        System.out.println("Matriz cargada:");
        //recorremos la matriz para mostrarla
        for(int i = 0; i < filas; i++) {
        for(int j = 0; j < columnas; j++) {
        //usamos print para que salga todo en la misma linea
        System.out.print(" " + matriz[i][j]);
        }
        System.out.println(" ");
        }
    }
}
