package one.digitalinnovation.exercicios.loops;

import java.util.Scanner;

/*Programa que lê 5 números e ao final exibe
 o maior valor digitado e a média dos números*/

public class MaiorMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media = 0;
        int controle = 1;

        do {
            System.out.println("Informe um Numero: ");
            numero = scan.nextInt();

            if (numero > maior){
                maior = numero;
            }

            media += numero;
            controle++;
        } while(controle <= 5);

        media = media / 5;

        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("A media de numeros foi: " + media);
    }
}
