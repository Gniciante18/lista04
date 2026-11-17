import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] codigos = {101, 205, 310, 420, 550};
        double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};

        System.out.print("Digite o código do produto: ");
        int codigo = leitor.nextInt();

        int posicao = -1;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                posicao = i;
            }
        }

        if (posicao == -1) {
            System.out.println("Produto não encontrado");
        } else {
            System.out.printf("Preço do produto: R$ %.2f%n", precos[posicao]);
        }
    }
}
