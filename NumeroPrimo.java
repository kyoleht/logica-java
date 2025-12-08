
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número primo: ");

        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é primo.");
        } else {
            System.out.println("NÃO é primo.");
        }
    }
}

/* 

Número primo

Pede um número e diz se ele é primo ou não.
(Dica: primo só divide por 1 e por ele mesmo) 

*/