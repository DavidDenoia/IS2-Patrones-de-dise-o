public class main{
    public static void main(String[] args){
        //Creamos el Observable
        YoutubeChannel myChannel = new YoutubeChannel();

        //Creamos los observers
        Suscriber suscriptor1 = new Suscriber(myChannel);
        Suscriber suscriptor2 = new Suscriber(myChannel);
        Suscriber suscriptor3 = new Suscriber(myChannel);

        //Publicar un nuevo video
        System.out.println("Publicando un nuevo video....");
        myChannel.notifyObservers();

        //Desuscribir a un suscriptor
        System.out.println("Desuscribir un suscriptor");
        myChannel.detach(suscriptor3);

        //Publicar un nuevo video
        System.out.println("Publicando un nuevo video....");
        myChannel.notifyObservers();
        





    }
}