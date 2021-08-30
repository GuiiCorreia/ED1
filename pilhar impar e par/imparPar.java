import java.util.Scanner;
import java.util.ArrayList;

public class imparPar {
    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>(); 

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Digite um numero entre -127 e 128 (0 para finalizar):");
            int num = sc.nextInt();


            if(num == 0){
            Integer desempilhado = par.desempilha();

            if(desempilhado == null){
                System.out.println("Pilha par vazia");
            }else {
                System.out.println("Desempilha: "+desempilhado);
            }

            desempilhado = impar.desempilha();

            if(desempilhado == null){
                System.out.println("Pilha impar vazia");
            }else {
                System.out.println("Desempilha: "+desempilhado);
            }
            
            }else if (num % 2 == 0){
                System.out.println("Numero par, empilha em par: "+num);
                par.empilha(num);
            }else {
                System.out.println("Numero impar, empilha em impar: "+num);
                impar.empilha(num);
            }
        }
    
    
        System.out.println("Desempilha todos os numeros da pilha par");

        while (!par.estaVazia()){
            System.out.println("Desempilha pilha par: "+par.desempilha());
        }
        System.out.println("Desempilhando impar");
        while (!impar.estaVazia()){
            System.out.println("Desempilhando impar: "+impar.desempilha());
        }
        
    }
}
    
