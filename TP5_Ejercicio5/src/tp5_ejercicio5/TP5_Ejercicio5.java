package tp5_ejercicio5;
public class TP5_Ejercicio5 {
public static void main(String[] args) {
    String[][] matriz = new String [3][3];
    //fila 0
    matriz[0][0] = "willi";
    matriz[0][1] = "11";
    matriz[0][2] = "yamil";
    //fila 1
    matriz[1][0] = "9";
    matriz[1][1] = "lauti";
    matriz[1][2] = "10";
    //fila 2
    matriz[2][0] = "maria";
    matriz[2][1] = "1";
    matriz[2][2] = "WM";
    System.out.println("Matriz cargada:");
    //recorre las filas
    for(int filas = 0; filas < 3; filas++){
    //recorre las columnas
    for(int columnas = 0; columnas < 3; columnas++){
    //muestra las filas y columnas    
    System.out.print(" " + matriz[filas][columnas] );    
    }    
    //salto de linea
    System.out.println(" ");
    }    
  }  
}
