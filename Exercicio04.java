import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] precos = new double[5];
        double total = 0;

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = leitor.nextDouble();
            total = total + precos[i];
        }

        System.out.println("Preços lidos:");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: R$ %.2f%n", i + 1, precos[i]);
        }

        System.out.printf("Total da compra: R$ %.2f%n", total);
    }
}
