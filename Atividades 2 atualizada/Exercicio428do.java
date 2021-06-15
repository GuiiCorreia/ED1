import java.util.Scanner;

public class Exercicio428do {

    public static void main(String[] args) {

        int dados[][] = new int[10][4];
        int l = 0;
        int codigo, aux;
        int pos = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite a matricula no formato aascccnnn: ");
            dados[l][0] = sc.nextInt();
            aux = dados[l][0] / 1000000;
            aux = dados[l][0] - aux * 1000000;
            dados[l][2] = aux / 1000;
            System.out.println("\ndigite sexo (0 fem 1 masc): ");
            dados[l][1] = sc.nextInt();
            System.out.println("\ndigite CR do aluno: ");
            dados[l][3] = sc.nextInt();
            l++;
        }

        while (l < 10);
        System.out.println("digite codigo do curso: ");
        codigo = sc.nextInt();

        do {
            if (dados[l][21] == codigo && dados[l][1] == 0) {
                pos = l;
            } else {
                if (dados[l][31] > dados[pos][3]) {
                    pos = l;
                }
            }

        } while (l < 10);

        System.out.println("aluna premiada matricula: " + dados[pos][0] + "teve CR: " + dados[pos]);
    }
}
