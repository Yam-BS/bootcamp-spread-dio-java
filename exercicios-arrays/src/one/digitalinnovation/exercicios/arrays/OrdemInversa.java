package one.digitalinnovation.exercicios.arrays;

/*Este programa cria um vetor de 6 numeros inteiros
 * Os valores sao exibidos na ordem inversa utilizando o laço while
 * Os valores sao exibidos utilizando o ForEach*/

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, 1, 2, 3, 4, 5}; // Inicializando um vetor de 5 elementos
        int i = (vetor.length - 1); // Contador que deverá ser um numero menor que o tamanho do vetor

        System.out.print("Vetor inverso: ");

        while (i >= 0){
            System.out.print(vetor[i] + " ");
            i--;
        }

        System.out.println("\n---------------");

        System.out.print("Vetor: ");

        //Exibindo os valores utilizando ForEach
        //Percorra o array vetor...
        //...e coloque todos os seus elementos dentro da variavel elementos:
        for (int elemento: vetor) {
            System.out.print(elemento + " ");
        }

        //Seria o mesmo que:

        System.out.println("\n----------------");

        System.out.print("Vetores: ");
        for (int cont = 0; cont < vetor.length; cont++){
            System.out.print(vetor[cont] + " ");
        }

    }
}
