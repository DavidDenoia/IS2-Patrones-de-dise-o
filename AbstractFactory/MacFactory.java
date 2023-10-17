public class MacFactory implements AbstractFactory{

    public Boton createBoton(){
        return new BotonMac();
    }

    public Ventana createVentana(){
        return new VentanaMac();
    }
    
}
