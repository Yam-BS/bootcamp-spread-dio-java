package one.digitalinnovation.exercicios.loops;

import java.util.Scanner;

/*Programa que lê dois valores: nome e idade.
 É interrompido quando o valor 0 é digitado no campo*/

public class NomeIdade {
    public static void main(String[] args) {
//      Responsável por abrir a entrada de fluxo de dados atraves do teclado:
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
//          Armazena o dado digitado na variável:
            nome = scan.next();

            if (nome.equals("0")) { // Caso nome seja igual a "0"
                break;
            }

            System.out.println("Idade: ");
            idade = scan.nextInt();

            System.out.println("Nome: " + nome + "; Idade: " + idade);
        }
    }
}
