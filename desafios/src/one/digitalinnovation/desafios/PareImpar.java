package one.digitalinnovation.desafios;

import java.io.IOException;
import java.util.Scanner;

/*Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido,
mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou
negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL),
pois por definição zero é par, seu programa deverá imprimir apenas NULL.
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão
ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.*/

public class PareImpar {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            int X = leitor.nextInt();

            if (X % 2 == 0 && X > 0){
                System.out.println("EVEN POSITIVE");
            } else if(X % 2 == 0 && X < 0){
                System.out.println("EVEN NEGATIVE");
            } else if(X % 2 != 0 && X > 0){
                System.out.println("ODD POSITIVE");
            } else if(X % 2 != 0 && X < 0){
                System.out.println("ODD NEGATIVE");
            } else {
                System.out.println("NULL");
            }
        }
    }
}
