package lavajato;
import java.util.Scanner;

public class lavaJato {
    public static void main(String[] args) {
        Fila F1 = new Fila();
        Fila F2 = new Fila();

        inv lav = 0;

        Carros C = new Carros();
        Object obj = new Object();

        for(int i = 1; i<16; i++){

            Carros ent = new Carros();
            ent.modelo = System.out.println("Digite o modelo: ");
            ent.identificacao = Integer.parseInt(System.out.println("Digite a identificação: "));
            ent.cor = System.out.println("Digite a cor: ");

            System.out.println("Entrando na fila para lavar: \n");
            F1.inserir(ent);

            System.out.println("Modelo: " +ent.modelo);
            System.out.println("Identificação: " +ent.identificacao);
            System.out.println("Cor: " +ent.cor);
            System.out.println("------------------------");

            if(i % 3 == 0){

                if(F1.fila_vazia()){
                    System.out.println("A fila esta vazia");
                }else{
                    System.out.println("Veiculo lavado - Indo para fila de lavados");
                    obj = F1.remover();
                    C = (Carros) obj;

                    F2.inserir(C);
                    System.out.println("Modelo: " +C.modelo);
                    System.out.println("Identificação: " +C.identificacao);
                    System.out.println("Cor: " +C.cor);
                    lav++;
                    System.out.println("--------------");
                }
            }
        }

        System.out.println("Todos os carros que ja foram lavados: " );
        for(int j = 0; j < lav; j++){
            obj = F2.mostrar(j);
            C = (Carros) obj;
            System.out.println("Modelo: " +C.modelo);
            System.out.println("Identificação: " +C.identificacao);
            System.out.println("Cor: " +C.cor);
            System.out.println("----------------------------");
        }
     }
        
 }

