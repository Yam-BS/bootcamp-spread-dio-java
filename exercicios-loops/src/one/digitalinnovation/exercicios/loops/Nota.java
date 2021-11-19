package one.digitalinnovation.exercicios.loops;

import java.util.Scanner;

/*Este programa pede uma nota entre 0 e 10.
 * Caso o valor digitado esteja fora desse limite, é solicitado um novo
 * até que o valor digitado seja válido*/

public class Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota (0 a 10): ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Valor inválido! Tente outro valor: ");
            nota = scan.nextInt();
        }

        System.out.println("Nota: " + nota);
    }
}
