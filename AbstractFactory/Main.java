public class Main {
    public static void main(String[] args) {
        AbstractFactory factory;

        // Supongamos que el sistema detecta que está en Windows
        factory = new WindowsFactory();
        Boton botonWindows = factory.createBoton();
        Ventana ventanaWindows = factory.createVentana();
        botonWindows.pintar();
        ventanaWindows.pintar();

        // Supongamos que el sistema detecta que está en MacOS
        factory = new MacFactory();
        Boton botonMacOS = factory.createBoton();
        Ventana ventanaMacOS = factory.createVentana();
        botonMacOS.pintar();
        ventanaMacOS.pintar();
    }
}
