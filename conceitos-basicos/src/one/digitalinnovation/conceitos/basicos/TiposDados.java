package one.digitalinnovation.conceitos.basicos;

/*Aqui são listados os tipos de dados da linguagem Java.
  Alguns deles com seus valores máximos e mínimos*/

public class TiposDados {
    public static void main(String[] args) {
        byte b1 = -128;
        byte b2 = 127;

        short s1 = -32768;
        short s2 = 32767;

        int i1 = -2147483648;
        int i2 = 2147483647;

        long l1 = -9223372036854775808L;
        long l2 = 9223372036854775807L;

        float f1 = 3.15f;
        float f2 = 10000.9F;

        double d1 = 3.15d;
        double d2 = 10000.9D;

        char c1 = '\u0084';
        char c2 = 'T';

//      Vale lembrar que String não é um tipo primitivo
        String str1 = "Nome";
        String str2 = "Outro nome";

        boolean boo1 = true;
        boolean boo2 = false;

        System.out.println(boo1);
    }
}
