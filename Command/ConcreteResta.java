public class ConcreteResta implements Command {

    private Calculadora calculadora;
    private int cantidad;

    public ConcreteResta(Calculadora calculadora, int cantidad){
        this.calculadora=calculadora;
        this.cantidad=cantidad;
    }

    public void execute(){
        calculadora.Restar(cantidad);
    }
}
