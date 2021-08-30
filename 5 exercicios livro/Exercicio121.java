import java.util.Scanner;

public class Exercicio121 {

    public static void main(String[] args) {

        int n1, n2, n3, n4, n5, maior, menor;
        Scanner sc = new Scanner(System.in);

        System.out.println("digite 1 numero:");
        n1 = sc.nextInt();

        System.out.println("digite 2 numero:");
        n2 = sc.nextInt();

        System.out.println("digite 3 numero:");
        n3 = sc.nextInt();

        System.out.println("digite 4 numero:");
        n4 = sc.nextInt();

        System.out.println("digite 5 numero:");
        n5 = sc.nextInt();

        if (n1 <= n2 && n1 <= n3 && n1 <= n4 && n1 <= n5 && n2 <= n3 && n2 <= n4 && n2 <= n5 && n3 <= n4 && n3 <= n5
                && n4 <= n5) {

            if (n1 > n2) {
                maior = n1;
                menor = n2;
            } else {
                maior = n2;
                menor = n1;
            }

            if (n3 > maior) {
                maior = n3;
            } else if (n3 < menor) {
                menor = n3;
            }

            if (n3 < menor) {
                menor = n3;
            } else if (n4 > maior) {
                maior = n4;
            }

            if (n4 < menor) {
                menor = n4;
            } else if (n5 > maior) {
                maior = n5;
            }

            if (n5 < menor) {
                menor = n5;
            }

            System.out.println("Maior= " + maior);
            System.out.println("Menor= " + menor);

        }

        else {
            System.out.println("valores devem ser diferentes: ");
        }

    }
}
