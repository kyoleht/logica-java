
import java.util.Scanner;

public class ContagemDeVogais {
    public static void main(String[] args) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Digite uma palavra: ");
        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.next();

        char[] letras = palavra.toCharArray();
        
        int contagem = 0;
        for(int i = 0; i < letras.length; i++) {
            if(letras == vogais) {
                contagem = contagem + 1;
            }
        }

        String vogaisContadas = new String(letras);
        
        System.out.println("O número de vogais dentro da sua palavra é: " + vogaisContadas);
    }
}

/* Pede uma palavra e conta quantas vogais ela tem.
(a, e, i, o, u) */

// preciso transformar a string em int, para contar as letras
// voltar para string
