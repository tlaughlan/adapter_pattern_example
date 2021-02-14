package MulbringQuest.adapters;

import KurriKings.Barbarian;
import MulbringQuest.Character;

public class BarbarianAdapter extends Barbarian implements Character {

    public BarbarianAdapter(double life, double magic, double attackPoints) {
        super(life, magic, attackPoints);
    }

    @Override
    public void move() {
        run();
    }

    @Override
    public void cast() {
        performAbility();
    }

    @Override
    public void attack() {
        fight();
    }
}
