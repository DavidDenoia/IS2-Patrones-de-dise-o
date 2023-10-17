class main{
    public static void main(String[] args){
        //Crear archivos
        Archivo archivo1 = new Archivo("archivo1.txt");
        Archivo archivo2 = new Archivo("archivo2.txt");
        Archivo archivo3 = new Archivo("archivo3.txt");

        //Crear directorios
        DirectorioComposite directorio1 = new DirectorioComposite("Directorio1");
        DirectorioComposite directorio2 = new DirectorioComposite("Directorio2");

        //Añadimos componentes 
        directorio1.addComponent(archivo1);
        directorio1.addComponent(archivo2);
        directorio2.addComponent(archivo3);

        //Añadimos un directorio dentro de otro
        directorio1.addComponent(directorio2);

        // Mostrar la estructura
        directorio1.show();
    }
}