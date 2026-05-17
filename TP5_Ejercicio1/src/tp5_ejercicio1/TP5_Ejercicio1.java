package tp5_ejercicio1;
public class TP5_Ejercicio1 {
    public static void main(String[] args) {
         int [][] Matriz = new int [2][2];
        //Fila 0
        Matriz[0][0] = 4;
        Matriz[0][1] = 5;
        //Fila 1
        Matriz[1][0] = 3;
        Matriz[1][1] = 2;      
        //Recorrido de una matriz para mostrarlo
        for(int filas = 0; filas < 2; filas++ ){
           
            for(int columnas = 0; columnas < 2; columnas++){
               
            System.out.print(" " + Matriz[filas][columnas]);
        }
            System.out.println(" ");
      }
   }
}
