package one.digitalinnovation.exercicios.loops;

import java.util.Scanner;

/* Programa que le uma quantidade de numeros previamente
 * especificada pelo usuario. Ao final, exibe a quantidade
 * de valores par e impar digitados */

public class ParImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int controle;
        int ctrl = 1; // Controla o laço de repetição
        int par = 0;
        int impar = 0;
        int numero;

        System.out.println("Quantos numeros voce deseja?: ");
        controle = scan.nextInt();

        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            if (numero % 2 ==  0) {
                par++;
            } else {
                impar++;
            }

            ctrl++;
        } while (ctrl <= controle);
        // Faça o loop caso o valor do contador seja menor ou igual à quantidade de numeros


        System.out.println("Pares: " + par);
        System.out.println("Impares : " + impar);
    }
}
