package one.digitalinnovation.exercicios.loops;

import java.util.Scanner;

/*Programa que pede um numero ao usuario
 * e exibe o seu fatorial*/

public class Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multiplicacao = 1; // Guarda o valor da multiplicaçao dos valores

        System.out.println("Digite um numero para ver o fatorial (!): ");
        fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao *= i;

            // Condicao criada para exibir os valores formatados
            if (i != 1) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i + " = " + multiplicacao);
            }
        }
    }
}
