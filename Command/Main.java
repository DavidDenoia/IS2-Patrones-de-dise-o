public class Main{
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        Invoker control = new Invoker();

        //Sumar 5
        Command sumar5 = new ConcreteSuma(calculadora, 5);
        control.setCommand(sumar5);
        control.presionarBoton();

        //Restar 3
        Command restar3 = new ConcreteResta(calculadora, 3);
        control.setCommand(restar3);
        control.presionarBoton();
    }
}