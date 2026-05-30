package tp5_ejercicio11;
import java.util.Scanner;
public class TP5_Ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Elija la opcion");
        System.out.println("1=sumar");
        System.out.println("2=restar");
        System.out.println("3=multiplicar");
        int opcion = lector.nextInt();
        System.out.println("Ingrese la cantidad de filas y columnas");
        int N = lector.nextInt();
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] C = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("(A) Ingrese el elemento " + i + "," + j);
                A[i][j] = lector.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("(B) Ingrese el elemento " + i + "," + j);
                B[i][j] = lector.nextInt();
            }
        }
        switch (opcion) {
            case 1:
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        C[i][j] = A[i][j] + B[i][j];
                    }
                }
                break;
            case 2:
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        C[i][j] = A[i][j] - B[i][j];
                    }
                }
                break;
            case 3:
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        C[i][j] = A[i][j] * B[i][j];
                    }
                }
                break;
            default:
                System.out.println("Opcion invalida");
        }
        System.out.println("Resultado:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
