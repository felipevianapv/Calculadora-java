import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite um valor para a tabuada: ");
        int valor = scanner.nextInt();
        
        System.out.println("---------------");
        
        System.out.println("Tabuada do " + valor);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + valor * i);
        }
        
        
        scanner.close();
    }
}
