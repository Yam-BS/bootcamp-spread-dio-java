package one.digitalinnovation.exercicios.arrays;

import java.util.Random;

/*Gera e imprime uma matriz multidimensional do tipo 4x4
 * com valores entre 0 e 9*/

public class ArrayMatriz {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int l = 0; l < matriz.length; l++){ //Linha da matriz
            for( int c = 0; c < matriz[l].length; c++){ //Coluna da matriz
                matriz[l][c] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz) { //Para cada linha da matriz
            for (int coluna : linha) { //pegue a coluna dessa linha
                System.out.print(coluna + " "); //imprima essa coluna
            }
            System.out.println();
        }
    }
}
