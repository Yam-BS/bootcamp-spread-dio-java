package one.digitalinnovation.exercicios.arrays;

import java.util.Scanner;

/*Lê um vetor de 6 caracteres e diz quantas consosntes foram lidas,
 * além de exibi-las */

public class Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6]; //Iniciando um array vazio com 6 posiçoes
        int quantConsoantes = 0;
        int ctrl = 0; //Controla o loop

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            //Se a letra informada nao for uma vogal maiuscula ou minuscula
            if ( !(letra.equalsIgnoreCase( "a") |
                    letra.equalsIgnoreCase( "e") |
                    letra.equalsIgnoreCase( "i") |
                    letra.equalsIgnoreCase( "o") |
                    letra.equalsIgnoreCase( "u"))
            )
            {

                consoantes[ctrl] = letra;
                quantConsoantes++;
            }

            ctrl++;
        } while (ctrl < consoantes.length);

        System.out.print("Consoantes:");
        for (String consoante: consoantes) {
            if (consoante != null){ //Se o valor da consoante for diferente de null
                System.out.print(" " + consoante);
            }
        }

        System.out.println("\nQuantidade de consoantes: " + quantConsoantes);
    }
}
