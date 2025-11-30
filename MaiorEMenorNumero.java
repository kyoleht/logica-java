
import java.util.Scanner;

public class MaiorEMenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maior = Math.max(num1, Math.max(num2, num3));
        int menor = Math.min(num1, Math.min(num2, num3));

        System.out.println("O MENOR número dentre os digitados é: " + menor);
        System.out.println("O MAIOR número dentre os digitados é: " + maior);
    }
}

/* O programa deve pedir 3 números e dizer qual é o maior e qual é o menor. */
