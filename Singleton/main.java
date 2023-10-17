class main{
    public static void main(String[] args) {
        Singleton instancia1 = Singleton.getInstance();

        Singleton instancia2 = Singleton.getInstance();

        // Comprobar si ambas instancias son la misma
        if (instancia1 == instancia2) {
            System.out.println("Ambas instancias son la misma.");
        } else {
            System.out.println("Las instancias son diferentes.");
        }
    }

}