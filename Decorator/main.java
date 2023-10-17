class main{
    public static void main (String[] args){
        System.out.println("HELLO WORLD");
        Enemy enemy = new ConcreteEnemy();
        System.out.println(enemy.takeDamage());
        Enemy enemy2 = new HelmetDecorator(enemy);
        System.out.println(enemy2.takeDamage());
    }
}