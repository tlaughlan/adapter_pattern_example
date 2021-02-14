package MulbringQuest;

import KurriKings.Barbarian;
import MulbringQuest.adapters.BarbarianAdapter;

import java.util.ArrayList;
import java.util.List;

public class GameApp {
    public static void main(String[] args) {
        System.out.println("Welcome to MulbringQuest.");

        Character warrior = new Warrior(100, 15, 60);
        Character mage = new Mage(40, 100, 20);
        Character rogue = new Rogue(60, 80, 20);

        List<Character> herosOfMulbring = new ArrayList() {{
            add(warrior);
            add(mage);
            add(rogue);
        }};

        runGame(herosOfMulbring);

        System.out.println("Woa, this other cool game, KurriKings, has a character class called Barbarian! But it's " +
                "incompatible with our codebase.\n>> Building adapter...");

        Character barbarian = new BarbarianAdapter(180, 30, 90);
        herosOfMulbring.add(barbarian);

        runGame(herosOfMulbring);
    }

    private static void runGame(List<Character> characters) {
        System.out.println("Loading...");
        for (Character currentCharacter : characters) {
            currentCharacter.move();
            if (currentCharacter instanceof Mage || currentCharacter instanceof Barbarian) {
                currentCharacter.cast();
            } else {
                currentCharacter.attack();
            }
        }
    }
}