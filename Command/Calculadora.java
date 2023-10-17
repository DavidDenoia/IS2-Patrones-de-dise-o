public class Calculadora {
    
    private int valor = 0;

    public void Sumar(int cantidad){
        valor += cantidad;
        System.out.println("Resultado actual: "+valor);
    }

    public void Restar(int cantidad){
        valor -= cantidad;
        System.out.println("Resultado actual: "+valor);
    }
}
