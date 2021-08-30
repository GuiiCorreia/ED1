import java.util.Scanner;

public class Exercicio62 {

    public static void main(String[] args) {

        double npreco, preco;
        System.out.println("Digite o valor do Produto: ");

        Scanner sc = new Scanner(System.in);

        preco = sc.nextDouble();

        npreco = preco * 0.91;
        System.out.println("Preço com Desconto: " + npreco);

    }

}