import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor do empréstimo: ");
        double valor = leitor.nextDouble();
        System.out.print("Taxa de juros mensal (%): ");
        double taxa = leitor.nextDouble();

        double[] devido = new double[12];
        for (int mes = 1; mes <= 12; mes++) {
            devido[mes - 1] = valor + valor * taxa / 100 * mes;
        }

        for (int i = 0; i < devido.length; i++) {
            System.out.printf("Mês %d: R$ %.2f%n", i + 1, devido[i]);
        }
    }
}
