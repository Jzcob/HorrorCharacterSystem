import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Transformable vampireTransform = new Transformable() {
            @Override
            public void transform() {
                System.out.println("The vampire transforms into a bat!");
            }

            @Override
            public void revert() {
                System.out.println("The vampire reverts back to human form.");
            }
        };

        Transformable werewolfTransform = new Transformable() {
            @Override
            public void transform() {
                System.out.println("The werewolf transforms into a massive wolf!");
            }

            @Override
            public void revert() {
                System.out.println("The werewolf reverts back to human form.");
            }
        };
        Vampire vampire = new Vampire("BloodDaddy", 100, HorrorCharacter.Vulnerability.GARLIC, vampireTransform);
        Werewolf werewolf = new Werewolf("Wolfie", 120, HorrorCharacter.Vulnerability.SILVER, werewolfTransform);
        Zombie zombie = new Zombie("Zed", 80, HorrorCharacter.Vulnerability.FIRE);

        vampire.addVulnerability(HorrorCharacter.Vulnerability.SUNLIGHT);
        werewolf.addVulnerability(HorrorCharacter.Vulnerability.HOLY_WATER);
        zombie.addVulnerability(HorrorCharacter.Vulnerability.SILVER);

        
    }
}