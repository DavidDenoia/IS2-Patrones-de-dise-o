public class ConcreteSuma implements Command{

    private Calculadora calculadora;
    private int cantidad;

    public ConcreteSuma(Calculadora calculadora, int cantidad){
        this.calculadora=calculadora;
        this.cantidad=cantidad;
    }

    public void execute(){
        calculadora.Sumar(cantidad);
    }
}