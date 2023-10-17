public class Singleton {
    
    private static Singleton instancia;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instancia == null){
            instancia = new Singleton();
        }else{
            System.out.println("Ya has creado una pendejo");
        }
        return instancia;
    }


}
