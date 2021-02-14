package MulbringQuest;

public class Rogue implements Character {
    private int health;
    private int mana;
    private int armour;

    public Rogue(int health, int mana, int armour) {
        this.health = health;
        this.mana = mana;
        this.armour = armour;
    }

    public void move() {
        System.out.println("Rogue creeps forward.");
    }

    public void cast() {
        System.out.println("Rogue casts Silence.");
    }

    public void attack() {
        System.out.println("Rogue stabs with her dagger.");
    }
}