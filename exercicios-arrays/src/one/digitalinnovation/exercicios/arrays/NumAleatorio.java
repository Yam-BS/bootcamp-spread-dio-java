package one.digitalinnovation.exercicios.arrays;

import java.util.Random;

/*Lê 20 numeros inteiros e aleatorios entre 0 e 100 e os armazena em um vetor
 * Ao final exibe os numeros, seus antecessores e sucessores*/

public class NumAleatorio {
    public static void main(String[] args) {

        Random random = new Random(); //Classe para gerar numeros aleatorios

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100); //Pegando um numero aleatorio entre 0 e 100 e atribuindo à variavel numero

            numerosAleatorios[i] = numero;
        }

        System.out.println("Antecessores dos Numeros Aleatorios: ");
        for (int numeros: numerosAleatorios) {
            System.out.print((numeros - 1) + " ");
        }

        System.out.println("\nNumeros Aleatorios: ");
        for (int numeros: numerosAleatorios) {
            System.out.print(numeros + " ");
        }

        System.out.println("\nSucessores dos Numeros Aleatorios: ");
        for (int numeros: numerosAleatorios) {
            System.out.print((numeros + 1) + " ");
        }


    }
}
