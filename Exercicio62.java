import java.util.Scanner;

public class Exercicio62 {

    public static void main(String[] args) {

        double valorDesconto, valorProduto;
        System.out.println("Digite o valor do Produto: ");

        Scanner sc = new Scanner(System.in);

        valorProduto = sc.nextDouble();

        valorDesconto = valorProduto * 0.91;
        System.out.println("Preço com Desconto: " + valorDesconto);

    }

}