package tp5_ejercicio2;
public class TP5_Ejercicio2 {
    public static void main(String[] args) {
        int [][] Matriz = new int [3][3];
        //Fila 0
        Matriz[0][0] = 1;
        Matriz[0][1] = 5;
        Matriz[0][2] = 4;
        //Fila 1
        Matriz[1][0] = 2;
        Matriz[1][1] = 4;  
        Matriz[1][2] = 5;
        //Fila 2
        Matriz[2][0] = 1;
        Matriz[2][1] = 2;
        Matriz[2][2] = 3;
        //Recorrido de una matriz para mostrarlo
        int filas = 0;
        while ( filas < 3 ){
           int columnas = 0;
            while (columnas < 3){
                System.out.print(" " + Matriz[filas][columnas]);
               columnas = columnas +1;
        }
            System.out.println(" ");
            filas = filas +1;
            }
      }
   }        
