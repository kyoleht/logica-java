
import java.util.Random;
import java.util.Scanner;

public class NumeroMisterioso {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSortido = random.nextInt(100) +1;

        int tentativas = 7;

        Scanner scanner = new Scanner(System.in);
        
        boolean acerto = false;
        
        while (tentativas > 0 && !acerto) {
            System.out.println("");
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Digite seu chute: ");
            
            int numeroUser = scanner.nextInt();

            if(numeroUser == numeroSortido) {
                acerto = true;
                break;
            } else if (numeroUser > numeroSortido) {
                System.out.println("");
                System.out.println("Seu chute foi MAIOR que o número");
                tentativas--;
            } else if (numeroUser < numeroSortido) {
                System.out.println("");
                System.out.println("Seu chute foi MENOR que o número");
                tentativas--;
            } else {
                System.out.println("O número digitado não é um número inteiro");
                break;
            }
        }

        if (acerto) {
            System.out.println("Parabéns! Você acertou.");
        }

        if (tentativas == 0) {
            System.out.println("Suas tentativas acabaram! O número escolhido era: " + numeroSortido);
            System.out.println("");
        }
    }
}