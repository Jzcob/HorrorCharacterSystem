import java.util.ArrayList;

/**
 * The main application class to demonstrate and test the horror character system.
 * It creates instances of different characters and calls their methods to
 * showcase their behaviors.
 */
public class Main {
    /**
     * The main entry point for the application.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        ArrayList<HorrorCharacter> monsters = new ArrayList<>();

        Vampire vampire = new Vampire("Count Von Fang", 100, HorrorCharacter.Vulnerability.GARLIC);
        Werewolf werewolf = new Werewolf("Howl Blackwood", 120, HorrorCharacter.Vulnerability.SILVER);
        Zombie zombie = new Zombie("Patchwork Pete", 80, HorrorCharacter.Vulnerability.FIRE);

        monsters.add(vampire);
        monsters.add(werewolf);
        monsters.add(zombie);

        vampire.addVulnerability(HorrorCharacter.Vulnerability.SUNLIGHT);
        werewolf.addVulnerability(HorrorCharacter.Vulnerability.HOLY_WATER);
        zombie.addVulnerability(HorrorCharacter.Vulnerability.SILVER);

        for (HorrorCharacter monster : monsters) {
            monster.attack();
            monster.flee();
            System.out.println("--------------------");
        }

        vampire.transform();
        vampire.attack();
    }
}