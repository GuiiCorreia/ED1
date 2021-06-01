import java.util.Scanner;

public class Exercicio147 {

    public static void main(String[] args) {

        int op, os, ob, calorias;
        calorias = 0;

        System.out.println("Digite 1- Vegetariano 2- Peixe 3- Frango 4- Carne: ");

        Scanner sc = new Scanner(System.in);
        op = sc.nextInt();

        if (op == 1) {
            calorias = calorias + 180;
        } else if (op == 2) {
            {
                calorias = calorias + 230;
            }
        } else if (op == 3) {
            calorias = calorias + 250;
        } else if (op == 4) {
            calorias = calorias + 350;
        }

        System.out.println("Digite 1- Abacaxi 2- Sorvete diet 3- Suco melao 4-refrigerante diet: ");
        op = sc.nextInt();

        if (op == 1) {
            calorias = calorias + 75;
        } else if (op == 2) {
            {
                calorias = calorias + 110;
            }
        } else if (op == 3) {
            calorias = calorias + 170;
        } else if (op == 4) {
            calorias = calorias + 200;
        }

        System.out.println("Digite 1- Cha 2- Suco de laranja 3- Mousse diet 4- Mousse de chocolate : ");
        op = sc.nextInt();

        if (op == 1) {
            calorias = calorias + 20;
        } else if (op == 2) {
            {
                calorias = calorias + 70;
            }
        } else if (op == 3) {
            calorias = calorias + 100;
        } else if (op == 4) {
            calorias = calorias + 65;
        }

        System.out.println("Total de calorias: " + calorias);
    }
}
