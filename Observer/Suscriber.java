class Suscriber implements Observer{

    private Observable observable;

    public Suscriber(Observable o){
        this.observable=o;
    }

    public void updateSub() {
        System.out.println("Nuevo video");
    }

}