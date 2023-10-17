public class CocheFactory implements Factory{
    
    public Vehiculo crearVehiculo(){
        return new Coche();
    }
}
