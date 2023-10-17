public class EnemyDecorator implements Enemy {
    
    protected Enemy decoratorEnemy;

    public EnemyDecorator(Enemy enemyToDecorate){
        this.decoratorEnemy=enemyToDecorate;
    }

    public int takeDamage(){
        return this.decoratorEnemy.takeDamage();
    }
}
