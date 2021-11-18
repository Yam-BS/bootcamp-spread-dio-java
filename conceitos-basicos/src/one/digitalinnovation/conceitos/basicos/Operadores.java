package one.digitalinnovation.conceitos.basicos;

/*Aqui são testados alguns operadores Java, como o pós-fixado,
  pré-fixado, além de sua ordem de precedência*/

public class Operadores {
    public static void main(String[] args) {
        /*int a = 10;
//      A variável 'b' irá receber o valor de 'a'. Depois disso, 'a' irá receber + 1:
        int b = a++;
//      A variável 'a' irá ser decrementada (-1). Depois disso, 'c' irá receber o novo valor de 'a':
        int c = --a;

        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("a: " + a);*/

        //

//      Testes com ordem de precedência:

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // a = 10 + 19 * 30 -> a = 10 + 570 -> a = 580;
        System.out.println(a);
        System.out.println(i);
        System.out.println(j);

        int b = k / --i % 3 + 1; // b = 30 / 10 % 3 + 1 -> b = 3 % 3 + 1 -> b = 0 + 1 -> b = 1;
        System.out.println(b);

        int c = 2;
        c *= i += 5; // c = c(2) * 10 += 5 -> c = 2 * 15;
        System.out.println(c);
    }
}
