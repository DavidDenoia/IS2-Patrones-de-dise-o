public class HelmetDecorator extends EnemyDecorator{
   

    public HelmetDecorator(Enemy enemyToDecorate) {
        super(enemyToDecorate);
        
    }

    public int takeDamage(){
        return 0;
    }
    
}
