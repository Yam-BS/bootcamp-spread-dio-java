package one.digitalinnovation.conceitos.basicos;

/*Alguns exemplos de nomes de variáveis válidos e inválidos.
Também são apresentadas algumas boas práticas ao nomear variáveis*/

public class NomesVariaveis {
    public static void main(String[] args) {
        int i;

        /*A linguagem Java é case-sensitive. Por isso 'int i' é inválida,
        pois já existe uma variável com esse nome. Já 'int I' é válida:*/
//      int i;
        int I;

//      Um nome de variável não pode começar com número:
//      int 13num;

//      É permitido nomear uma variável começando com underline ou cifrão:
        int _num;
        int $num;

//      Inicializando as variáveis já declaradas:
        i = 1;
        I = 2;
        _num = 0;
        $num = 4;

//      Variáveis com o modificador 'final' não podem ter seu valor alterado:
        final int num = 5;
//      num = 3;

//      Variáveis não podem ter nomes separados por espaço e nem símbolos além de '_' e '$':
//      int num 1;
//      int num1%;

//      Variáveis com modificador 'final' podem ser escritas maiúsculas e com palavras separadas por '_':
        final int NUMERO_QUANTIDADE = 10;

//      Exemplo de notação camelo, em que cada nova palavra é iniciada com maiúscula:
        int quantidadeProduto = 100;

//      Exibição das variáveis válidas:
        System.out.println(i);
        System.out.println(I);
        System.out.println(_num);
        System.out.println($num);
        System.out.println(num);
        System.out.println(NUMERO_QUANTIDADE);
        System.out.println(quantidadeProduto);
    }
}
