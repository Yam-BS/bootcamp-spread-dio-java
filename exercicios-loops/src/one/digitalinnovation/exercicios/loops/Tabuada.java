package one.digitalinnovation.exercicios.loops;

import java.util.Scanner;

/* Programa que exibe a tabuada de um numero
 * determinado pelo usuario entre 1 e 10*/

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tabuada, controle;
        int resultado = 0;

        System.out.println("Deseja ver a tabuada de que numero? (De 1 ate 10): ");
        tabuada = scan.nextInt();

        for (controle = 1; controle <= 10; controle++){
            if (tabuada >= 1 && tabuada <= 10){
                resultado = tabuada * controle;
                System.out.println(tabuada + " x " + controle + " = " + resultado);
            } else { // Caso o usuario digite um numero invalido
                System.out.println("Por favor, digite um numero valido: ");
                tabuada = scan.nextInt();
                controle--;
            }
        }

    }
}
