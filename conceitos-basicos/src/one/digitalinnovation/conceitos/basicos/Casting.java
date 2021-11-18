package one.digitalinnovation.conceitos.basicos;

/*Algumas conversões do tipo Upcast e Downcast em Java*/

public class Casting {
    public static void main(String[] args) {

//      Downcast (Em que o 'maior' é convertido para o 'menor'). É necessário o uso de '(byte)' nesse caso:
        /*short s1 = 127;
        byte b1;
        b1 = (byte) s1;
        System.out.println(b1);*/

//      Conversão que ultrapassa os limites de byte, por isso o valor é inexato:
        /*short s1 = 30000;
        byte b1;
        b1 = (byte) s1;
        System.out.println(b1);*/

//      Upcast:
        /*int i1 =  1000000000;
        long l1;
        l1 = i1;
        System.out.println(l1);*/

        /*float f1 = 3.14f;
        double d1;
        d1 = f1;
        System.out.println(d1);*/

        /*double d2 = 10.888888888888888888888888888888888888888888888888888888888888888888888888888888888888;
        float f2;
        f2 = (float) d2;
        System.out.println(f2);*/

        /*float f3 = 3.14f;
        int i2;
        i2 = (int) f3;
        System.out.println(i2);*/

        double d3 = 10000.99999999999999999999999999999999999999999999999d;
        byte b2;
        b2 = (byte) d3;
        System.out.println(b2);
    }
}
