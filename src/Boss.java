public class Boss extends GameEntity {
    private Weapon weapon;
    private int health;
    private int Damage ;

    public Boss(Weapon weapon, int health, int damage) {
        this.weapon = weapon;
        this.health = health;
        Damage = damage;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "weapon=" + weapon +
                ", health=" + health +
                ", Damage=" + Damage +
                '}';
    }
}
