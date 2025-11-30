
import java.util.Scanner;

public class SomaAteONumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int soma = 0;
        
        for(int i = 0; i <= num; i++) {
            soma = soma + i;
        }

        System.out.println("A soma até o número digitado é: " + soma);
    }
}

/* Pede pro usuário um número e calcula a soma de 1 até esse número.
Ex: se ele digitar 5 → 1+2+3+4+5 = 15. */