import java.util.ArrayList;

public class Vampire extends HorrorCharacter {
    private String name;
    private int health;
    private ArrayList<Vulnerability> vulnerabilities = new ArrayList<Vulnerability>();

    public Vampire(String name, int health, Vulnerability v) {
        this.name = name;
        this.health = health;
        vulnerabilities.add(v);
        System.out.println("A vampire named " + name + " with health " + health + " has emerged from the shadows!");
    }

    @Override
    public void attack() {
        System.out.println("The vampire swoops in with a chilling hiss!");
    }

    @Override
    public void flee() {
        System.out.println("The vampire vanishes into the darkness, leaving only a cold breeze.");
    }


    public void addVulnerability(Vulnerability v) {
        vulnerabilities.add(v);
    }

    public void getVulnerabilities() {
        System.out.print("The vampire's vulnerabilities are: ");
        for (Vulnerability v : vulnerabilities) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public Vampire() {
        System.out.println("A vampire has emerged from the shadows!");
    }

}
