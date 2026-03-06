import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
            System.out.println("Digite sua primeira nota: ");
            double n1 = scanner.nextDouble();
            
            System.out.println("------------------");
            
            System.out.println("Digite sua segunda nota: ");
            double n2 = scanner.nextDouble();
            
            System.out.println("------------------");
            
            System.out.println("Digite sua terceira nota: ");
            double n3 = scanner.nextDouble();
            
            System.out.println("------------------");
            
            double media = (n1 + n2 + n3) / 3;
            
            
            if (n1 < 0 || n1 > 10 ||
            n2 < 0 || n2 > 10 ||
            n3 < 0 || n3 > 10) {
                System.out.println("Nota invalida!");
            } else if (media >= 7) {
                System.out.printf("Aprovado com a média: %.2f\n", media);
            } else if (media >= 4 && media < 7) {
                System.out.printf("Recuperação com a média: %.2f\n", media);
            } else {
                System.out.printf("Reprovado com a média: %.2f\n", media);
            }
            
        
        
        scanner.close();
    }
}
