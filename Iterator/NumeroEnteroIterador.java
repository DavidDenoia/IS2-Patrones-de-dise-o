import java.util.List;

public class NumeroEnteroIterador implements Iterator{

    private List<Integer> numeros;
    private int posicion = 0;

    public NumeroEnteroIterador(List<Integer> numeros){
        this.numeros=numeros;
    }

    
    public boolean hasNext(){
        return posicion < numeros.size();
    }
    
    public Object next(){
        if(hasNext()){
            return numeros.get(posicion++);
        }
        return null;
    }
}
