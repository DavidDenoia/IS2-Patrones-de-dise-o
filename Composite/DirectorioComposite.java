import java.util.ArrayList;
import java.util.List;

public class DirectorioComposite implements FyleSystemComponent {
    
    public List<FyleSystemComponent> componentes = new ArrayList<>();
    private String nombre;

    public DirectorioComposite(String nombre){
        this.nombre=nombre;
    }

    public void addComponent(FyleSystemComponent componente){
        componentes.add(componente);
    }

    public void removeComponent(FyleSystemComponent componente){
        componentes.remove(componente);
    }

    public void show(){
        System.out.println("Directorio " + nombre);
        for(FyleSystemComponent componente : componentes){
            componente.show();
        }
    }
}
