public class Archivo implements FyleSystemComponent {
    
    private String nombre;

    public Archivo(String nombre){
        this.nombre=nombre;
    }

    public void show(){
        System.out.println("Archivo " + this.nombre);
    }
}
