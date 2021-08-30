package lavajato;


import java.util.ArrayList;
import java.util.List;




public class fila {

    List<Carros> obj = new ArrayList<>();

    void inserir (Carros carro){
        this.obj.add(carro);
    }

    Object remover(){
        return(this.obj.remove(0));
    }

    boolean fila_vazia(){
        return(this.obj.isEmpty());
    }

    Object mostrar(int i){
        return this.obj.get(i);
    }

    boolean mostrar(List<Carros> obj){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
