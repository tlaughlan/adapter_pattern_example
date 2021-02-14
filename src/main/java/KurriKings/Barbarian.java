package KurriKings;

public class Barbarian implements Player {
    private double life;
    private double magic;
    private double attackPoints;

    public Barbarian(double life, double magic, double attackPoints) {
        this.life = life;
        this.magic = magic;
        this.attackPoints = attackPoints;
    }

    @Override
    public void run() {
        System.out.println("Barbarian stomps forth!");
    }

    @Override
    public void performAbility() {
        System.out.println("Barbarian uses ability Rage.");
    }

    @Override
    public void fight() {
        System.out.println("Barbarian smashes the enemy with his club!");
    }
}
