import java.util.ArrayList;

/**
 * Vampire class representing a vampire character in a horror-themed system.
 * Inherits from HorrorCharacter and implements attack and flee behaviors.
 * Can transform into a bat if a Transformable behavior is provided.
 * Maintains a list of vulnerabilities specific to vampires.
 */

public class Vampire extends HorrorCharacter {
    private String name;
    private int health;
    private ArrayList<Vulnerability> vulnerabilities = new ArrayList<Vulnerability>();
    private Transformable transformable;
    private boolean isTransformed = false;

    public Vampire(String name, int health, Vulnerability v) {
        this.name = name;
        this.health = health;
        vulnerabilities.add(v);
        System.out.println("A vampire named " + name + " with health " + health + " has emerged from the shadows!");
    }

    @Override
    public void attack() {
        if (transformable != null) {
            transformable.transform();
            System.out.println(name + " transforms into a bat!");
        } else {
            System.out.println("The vampire lunges forward with a chilling hiss!");
        }
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

    public void transform() {
        if (transformable == null) {
            System.out.println(name + " cannot transform because no Transformable behavior is set.");
            return;
        }
        transformable.transform();
        isTransformed = true;
        System.out.println(name + " transforms into a bat!");

    }

    public void revert() {
        transformable.revert();
        isTransformed = false;
        System.out.println(name + " reverts back to human form.");
    }

    public boolean isTransformed() {
        return isTransformed;
    }

    public String toString() {
        System.out.println("Vampire Name: " + name + ", Health: " + health);
        return null;
    }

}
