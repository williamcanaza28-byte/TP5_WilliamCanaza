package tp5_ejercicio10;
import java.util.Random;
public class TP5_Ejercicio10 {
    static int[] BuscarExtremos(int[][] Matriz){
        int[] Extremos = new int[4];
        Extremos[2] = 40;
        int contador = 0;
        for(int i = 0; i < 5; i++){
             for(int j = 0; j < 7; j++){              
             if(Extremos[0] < Matriz[i][j]){          
                 Extremos[0] = Matriz[i][j];
                 Extremos[1] = j;
             }    
             if(Extremos[2] > Matriz[i][j]){
                 Extremos[2] = Matriz[i][j];
                 Extremos[3] = j;
             }      
             contador++;
             if(contador >= 31) break;                      
        }      
    }
        return Extremos;
    }
    static float BuscarPromedio(int[][] Matriz, int semana){
        float promedio = 0.0f;
        int contador = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 7; j++){
                promedio = promedio + Matriz[i][j];
                contador++;
                if (contador >= 31) break;
            }
        }
        promedio = promedio / 31.0f;  
        return promedio;
    }
    public static void main(String[] args) {
    int[][] temperaturas = new int[5][7];
    temperaturas = LlenarMatriz(temperaturas, 7, 38);
    float promedio = BuscarPromedio(temperaturas,0);
    System.out.println("el promedio de la semana 0 es " + promedio); 
    int [] Resultado = BuscarExtremos(temperaturas);
    System.out.println("temperatura mas alta = " + Resultado[0]);
    System.out.println("dia de T mas alta = " + Resultado[1]);
    System.out.println("temperatura mas baja = " + Resultado[2]);
    System.out.println("dia de T mas baja = " + Resultado[3]);
    //mostrar resultados
    for(int i = 0; i < 5; i++){
    for(int j = 0; j < 7; j++){
    System.out.print(temperaturas[i][j]+ "  ");    
    }
    System.out.println( );
    }
    }
    static int[][] LlenarMatriz(int[][] Matriz, int min, int max){
    Random Aleatorio = new Random();
    int contador = 0;    
    for(int i = 0; i < 5; i++ ){
        for(int j = 0; j < 7; j++){
        Matriz[i][j] = Aleatorio.nextInt( min, max);
        contador = contador +1;
        if (contador >= 31) break;  
        }
    }  
    return Matriz;
    }
}
