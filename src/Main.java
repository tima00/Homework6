public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setName("Ak-47");
        weapon.setType("gunshot");
        Boss boss = new Boss(weapon, 2000, 150);
        System.out.println(boss);


    }
}