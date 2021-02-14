package MulbringQuest;

public class Mage implements Character {
    private int health;
    private int mana;
    private int armour;

    public Mage(int health, int mana, int armour) {
        this.health = health;
        this.mana = mana;
        this.armour = armour;
    }

    public void move() {
        System.out.println("Mage steps forward.");
    }

    public void cast() {
        System.out.println("Mage casts Fireball.");
    }

    public void attack() {
        System.out.println("Mage whacks with his staff.");
    }
}