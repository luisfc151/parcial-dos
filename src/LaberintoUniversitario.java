import java.util.Random;
import java.util.Scanner;

public class LaberintoUniversitario {

    public static void main(String[] args) {
        int[][] laberinto = new int[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generar el laberinto con valores aleatorios del 1 al 9
        for (int fila = 0; fila < laberinto.length; fila++) {
            for (int col = 0; col < laberinto[fila].length; col++) {
                laberinto[fila][col] = random.nextInt(9) + 1;
            }

            mostrarMatriz(laberinto);
            contarParesMayoresA4(laberinto);
            calcularPromedioImpares(laberinto);
            sumarFilas(laberinto);
            numeroAlto(laberinto);
        }

        // Mostrar el laberinto generado
        System.out.println("=== LABERINTO UNIVERSITARIO ===");
        mostrarMatriz(laberinto);

        // Instrucciones del reto
        System.out.println("""
        ¡Bienvenido al Laberinto Universitario!
        Este sistema representa los pasillos secretos de tu facultad.
        Cada número indica un nivel de energía en ese punto.
        Tu misión es explorar este laberinto cumpliendo los siguientes desafíos:

        1. Contar cuántos números pares hay mayores a 4. ⚡
        2. Calcular el promedio de los números impares. 🎯
        3. Calcular la suma de los valores de cada fila. 🧮
        4. BONUS: Encuentra la posición del mayor número del laberinto. 👑
        """);

        // Aquí puedes invocar los métodos para cada uno de los puntos anteriores
        // Por ejemplo:
        // contarParesMayoresA4(laberinto);
        // promedioImpares(laberinto);
        // etc...

        scanner.close();
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    // Aquí puedes agregar los métodos necesarios para resolver el laberinto
    // Ejemplo:
    public static void contarParesMayoresA4(int[][] matriz) { 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > 4 && matriz[i][j]%2==0) {
                    System.out.println("numero: "+ matriz[i][j]);
                }
            }
        }
    }
     public static double calcularPromedioImpares(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 != 0) {
                    suma += valor;
                    contador++;
                }
            }
        }
        return (contador > 0) ? (double) suma / contador : 0; 
     }
     public static void sumarFilas(int matriz[][]){
        int sumaFila = 0;
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaFila =+ matriz[i][j];
                }
                System.out.println("la suma de la fila: "+i +" = " + sumaFila);
            }
        }

    public static void numeroAlto(int matriz[][]){
        int mayor=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                  mayor = Math.max(matriz[i][j], 1);
                }
            
            }
            System.out.println("el numero mas alto es: " + mayor);
    }
    
     }

