package MulbringQuest;

public class Warrior implements Character {
    private int health;
    private int mana;
    private int armour;

    public Warrior(int health, int mana, int armour) {
        this.health = health;
        this.mana = mana;
        this.armour = armour;
    }

    public void move() {
        System.out.println("Warrior moves forwards.");
    }

    public void cast() {
        System.out.println("Warrior casts Charge.");
    }

    public void attack() {
        System.out.println("Warrior slashes with her sword.");
    }
}