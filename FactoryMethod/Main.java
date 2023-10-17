public class Main{
    public static void main(String[] args){
        Factory cocheFactory = new CocheFactory();
        Vehiculo coche = cocheFactory.crearVehiculo();
        coche.conducir();

        Factory motoFactory = new MotoFactory();
        Vehiculo moto = motoFactory.crearVehiculo();
        moto.conducir();

    }
}