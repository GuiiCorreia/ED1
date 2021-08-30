import java.util.Scanner;

public class Exercicio54 {

    public static void main(String[] args) {
        double a, b;

        System.out.println("Entre com a base: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();

        System.out.println("Entre a altura do um triângulo: ");
        b = sc.nextDouble();

        System.out.println("Area = " + ((a * b) / 2));

        b = sc.nextDouble();

    }

}