import java.util.ArrayList;
import java.util.List;

public class NumeroEnteroColeccion {
    private List<Integer> numeros = new  ArrayList<>();

    public void add(int numero){
        numeros.add(numero);
    }

    public List<Integer> getLista(){
        return this.numeros;
    }

    public Iterator createIterator(){
        return new NumeroEnteroIterador(this.numeros);
    }
}
