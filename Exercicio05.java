import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] precos = new double[5];
        double[] comDesconto = new double[5];

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = leitor.nextDouble();
            comDesconto[i] = precos[i] - precos[i] * 10 / 100;
        }

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: original R$ %.2f - com desconto R$ %.2f%n",
                    i + 1, precos[i], comDesconto[i]);
        }
    }
}
