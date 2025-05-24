import java.util.Random;

public class LaberintoUniversitario {

    public static void main(String[] args) {
        int[][] laberinto = generarMatriz(); // Matriz generada aleatoriamente
        mostrarMatriz(laberinto); // Se muestra la matriz base

        // Aquí deberás implementar y llamar a tus métodos
    }

    public void generarMatriz(){
        int[][] matriz = new int[3][3];
        Random numeroAleatorio = new Random( 99);
        matriz[0][0] = numeroAleatorio.nextInt(0)
    }
}