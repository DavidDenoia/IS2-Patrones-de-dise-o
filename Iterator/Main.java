class Main{
    public static void main(String[] args){
        NumeroEnteroColeccion coleccion = new NumeroEnteroColeccion();
        coleccion.add(1);
        coleccion.add(2);
        coleccion.add(3);
        coleccion.add(4);
        coleccion.add(5);

        Iterator iterador = coleccion.createIterator();  
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }  
    }
}