public class Hero {
    private int health;
    private int damage;
    private String superPower;

    public Hero(int health, String superPower,int damage){
        this.health = health;
        this.superPower = superPower;
        this.damage = damage;
    }
    public Hero (int health,int damage){
        this.health= health;
        this.damage= damage;
    }
    public int getHealth(){
        return  this.health;
    }
    public int getDamage(){
        return  this.damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}
