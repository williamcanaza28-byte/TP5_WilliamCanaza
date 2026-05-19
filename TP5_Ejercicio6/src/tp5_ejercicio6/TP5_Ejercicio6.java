package tp5_ejercicio6;
import java.util.Scanner;
public class TP5_Ejercicio6 {
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    String[][] empleados = new String[3][3];
    //recorre los empleados
    for(int filas = 0; filas < 3; filas++){
    //mostrar empleado    
    System.out.println("Empleado " + (filas + 1));
    //guarda el nombre
    empleados[filas][0] = teclado.nextLine();
    //guarda la edad
    empleados[filas][1] = teclado.nextLine();
    //guarda el sueldo
    empleados[filas][2] = teclado.nextLine();        
    }   
    System.out.println(" ");
    //solo muestro encabezados
    System.out.println(" Nombre Edad Sueldo");
    //recorre filas
    for(int filas = 0; filas < 3; filas++){
    //recorre columnas
    for(int columnas = 0; columnas < 3; columnas++){
    //muestra cada dato    
    System.out.print(" " + empleados[filas][columnas]);
    }   
    //salto de linea, termina una fila baja a la siguiente linea
    System.out.println(" ");
    } 
  }   
}
