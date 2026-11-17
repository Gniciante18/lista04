import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] notas = new double[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = leitor.nextDouble();
        }

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6) {
                aprovados = aprovados + 1;
            } else if (notas[i] >= 4) {
                recuperacao = recuperacao + 1;
            } else {
                reprovados = reprovados + 1;
            }
        }

        System.out.println("Aprovados: " + aprovados);
        System.out.println("Em recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
    }
}
