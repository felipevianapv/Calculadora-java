import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Resultado: " + (num1 + num2));
        } else if (opcao == 2) {
            System.out.println("Resultado: " + (num1 - num2));
        } else if (opcao == 3) {
            System.out.println("Resultado: " + (num1 * num2));
        } else if (opcao == 4) {
            System.out.println("Resultado: " + (num1 / num2));
        } else {
            System.out.println("Opção inválida");
        }

        scanner.close();
    }
}
