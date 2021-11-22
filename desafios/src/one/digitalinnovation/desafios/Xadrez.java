package one.digitalinnovation.desafios;

import java.util.Scanner;

/*No tabuleiro de xadrez, a casa na linha 1, coluna 1 (canto superior esquerdo) é sempre branca
e as cores das casas se alternam entre branca e preta, formando o formato tão conhecido como xadrez.
Dessa forma, como o tabuleiro tradicional tem oito linhas e oito colunas, a casa na linha 8,
coluna 8 (canto inferior direito) será também branca. Porém, neste problema, queremos ser capazes de
predizer a cor independente do número de linhas e colunas, sendo: L linhas e C colunas.*/

/*Imprima uma linha na saída. A linha deve conter um inteiro, representando a cor da casa no canto
inferior direito do tabuleiro, e para identificar, considere o inteiro 1 para a cor branca e 0 para a cor preta.*/

public class Xadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(); //Numero de linhas do tabuleiro
        int C = sc.nextInt(); //Numero de colunas do tabuleiro
        if ((L % 2 != 0) && C % 2 != 0) // Se linha e coluna forem valores ímpares
            System.out.println("  1 "); //Cor branca
        else
            System.out.println(" 0  "); //Cor preta
        sc.close();
    }
}
