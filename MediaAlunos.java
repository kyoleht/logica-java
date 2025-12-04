import java.text.DecimalFormat;
import java.util.Scanner; 

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas 4 notas: ");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        DecimalFormat df = new DecimalFormat("#.#");
        String mediaFormatada = df.format(media);
        
        if(media >= 7) {
            System.out.println("Você foi APROVADO com " + mediaFormatada + " de média");
        } else if(media > 4 && media < 7) {
            System.out.println("Você ficou de RECUPERAÇÃO com " + mediaFormatada + " de média");
        } else {
            System.out.println("Você foi REPROVADO com " + mediaFormatada + " de média");
        }
        
        scanner.close();
    }
}

/*  Média dos alunos

Pede 4 notas e mostra se o aluno está:

Aprovado (média ≥ 7)

Recuperação (média entre 5 e 7)

Reprovado (média < 5)

*/