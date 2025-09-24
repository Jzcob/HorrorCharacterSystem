import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Vampire vampire = new Vampire("BloodDaddy", 100, HorrorCharacter.Vulnerability.GARLIC);
        Werewolf werewolf = new Werewolf("Wolfie", 120, HorrorCharacter.Vulnerability.SILVER);
        Zombie zombie = new Zombie("Zed", 80, HorrorCharacter.Vulnerability.FIRE);

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