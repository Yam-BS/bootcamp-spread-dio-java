package one.digitalinnovation.conceitos.basicos;

/*Apresentando algunns tipos de condiçôes, bem como algumas formas de simplificar*/

public class Condicoes {
    public static void main(String[] args) {

        double salarioMensal = 11893.58d;
        double mediaSalario = 105000d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio");
        }

        // Simplificando o if

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber auxílio (2)");
        }

        // Simplificando novamente

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        if (recebeAuxilio) {
            System.out.println("Funcionário deve receber auxílio (3)");
        }

        //

        int numero = 4;

        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Correto");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

        String mes = "Fevereiro";

        switch (mes){
            case "Janeiro":
            case "Julho":
            case "Dezembro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }
    }
}
