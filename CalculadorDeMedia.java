import java.util.Scanner;

public class CalculadorDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2;

        System.out.println("Insira a primeira nota (entre 0 e 10): ");
        nota1 = scanner.nextDouble();
        
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida. Insira uma nota entre 0 e 10.");
            return;
        }

        System.out.println("Insira a segunda nota (entre 0 e 10): ");
        nota2 = scanner.nextDouble();

        if (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida. Insira uma nota entre 0 e 10.");
            return;
        }

        double media = (nota1 + nota2) / 2;

        System.out.println("A média das notas é: " + media);

        if (media >= 7) {
            System.out.println("Você está aprovado!");
        } else if (media >= 5) {
            System.out.println("Você está em recuperação. Insira a nota da recuperação: ");
            double notaRecuperacao = scanner.nextDouble();

            if (notaRecuperacao >= 5) {
                System.out.println("Você está aprovado na recuperação!");
            } else {
                System.out.println("Você está reprovado.");
            }
        } else {
            System.out.println("Você está reprovado.");
        }

        scanner.close();
    }
}
