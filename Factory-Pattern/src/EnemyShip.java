
public abstract class EnemyShip {
    private String name;
    private double damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the Screen.");
    }

    public void enemyShipShots(){
        System.out.println(getName() + " attacks and does " + getDamage() + " to our ship");
    }
}
