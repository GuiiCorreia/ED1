import java.util.Scanner;

public class Exercicio88 {

    public static void main(String[] args) {

        String resposta;
        float a, b;

        System.out.println("*************");
        System.out.println("CALCULADORA");
        System.out.println("*************");
        System.out.println("+ para somar");
        System.out.println("- para subtrair");
        System.out.println("* para multiplicar");
        System.out.println("/ para dividir");
        System.out.println("Digite opcao");

        Scanner sc = new Scanner(System.in);
        resposta = sc.nextLine();

        if ("+".equals(resposta)) {
            System.out.println("Digite 1 numero com ponto: ");
            a = sc.nextFloat();
            System.out.println("Digite 2 numero com ponto: ");
            b = sc.nextFloat();

            System.out.println("SOMA: " + (a + b));

        } else if ("-".equals(resposta)) {
            System.out.println("Digite 1 numero com ponto: ");
            a = sc.nextFloat();
            System.out.println("Digite 2 numero com ponto: ");
            b = sc.nextFloat();

            System.out.println("SUBTRACAO: " + (a - b));

        } else if ("*".equals(resposta)) {
            System.out.println("Digite 1 numero com ponto: ");
            a = sc.nextFloat();
            System.out.println("Digite 2 numero com ponto: ");
            b = sc.nextFloat();

            System.out.println("MULTIPLICACAO: " + (a * b));

        } else if ("/".equals(resposta)) {
            ;
            System.out.println("Digite 1 numero com ponto: ");
            a = sc.nextFloat();
            System.out.println("Digite 2 numero com ponto: ");
            b = sc.nextFloat();

            System.out.println("DIVISAO: " + (a / b));
        } else if ("/,*,+,-".equals(resposta)) {
            System.out.println("OPÇAO NAO DISPONIVEL!");
        }
        System.out.println();
    }
}
