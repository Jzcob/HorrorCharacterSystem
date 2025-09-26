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


        Vampire vampire = new Vampire("Count Von Fang", 100, HorrorCharacter.Vulnerability.GARLIC);
        Werewolf werewolf = new Werewolf("Howl Blackwood", 120, HorrorCharacter.Vulnerability.SILVER);
        Zombie zombie = new Zombie("Patchwork Pete", 80, HorrorCharacter.Vulnerability.FIRE);

        vampire.addVulnerability(HorrorCharacter.Vulnerability.SUNLIGHT);
        werewolf.addVulnerability(HorrorCharacter.Vulnerability.HOLY_WATER);
        zombie.addVulnerability(HorrorCharacter.Vulnerability.SILVER);

        vampire.attack();
        vampire.flee();
        werewolf.attack();
        werewolf.flee();
        zombie.attack();
        zombie.flee();

        vampire.transform();
        werewolf.transform();

        vampire.attack();
        werewolf.attack();
        vampire.revert();
        werewolf.revert();
    }
}