public class WindowsFactory implements AbstractFactory{
    
    public Boton createBoton(){
        return new BotonWindows();
    }

    public Ventana createVentana(){
        return new VentanaWindows();
    }

}
