import java.util.ArrayList;

public class Werewolf extends HorrorCharacter {
    private String name;
    private int health;
    private ArrayList<Vulnerability> vulnerabilities = new ArrayList<Vulnerability>();

    public Werewolf(String name, int health, Vulnerability v) {
        this.name = name;
        this.health = health;
        vulnerabilities.add(v);
        System.out.println("A werewolf named " + name + " with health " + health + " has transformed under the full moon!");
    }

    @Override
    public void attack() {
        System.out.println("The werewolf charges with a terrifying roar!");
    }

    @Override
    public void flee() {
        System.out.println("The werewolf retreats into the forest, howling at the moon.");
    }

    public void addVulnerability(Vulnerability v) {
        vulnerabilities.add(v);
    }

    public void getVulnerabilities() {
        System.out.print("The werewolf's vulnerabilities are: ");
        for (Vulnerability v : vulnerabilities) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public Werewolf() {
        System.out.println("A werewolf has transformed under the full moon!");
    }

}
