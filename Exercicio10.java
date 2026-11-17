import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantidade de itens: ");
        int n = leitor.nextInt();

        if (n < 1) {
            System.out.println("Quantidade inválida");
            return;
        }

        double[] precos = new double[n];
        int[] quantidades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Preço unitário do item " + (i + 1) + ": ");
            precos[i] = leitor.nextDouble();
            System.out.print("Quantidade do item " + (i + 1) + ": ");
            quantidades[i] = leitor.nextInt();
        }

        double total = 0;
        for (int i = 0; i < n; i++) {
            double subtotal = precos[i] * quantidades[i];
            total = total + subtotal;
            System.out.printf("Subtotal do item %d: R$ %.2f%n", i + 1, subtotal);
        }

        System.out.printf("Total da compra: R$ %.2f%n", total);

        double desconto = 0;
        if (total > 200.00) {
            desconto = total * 5 / 100;
            System.out.printf("Desconto (5%%): R$ %.2f%n", desconto);
        }

        double valorFinal = total - desconto;
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);
    }
}
