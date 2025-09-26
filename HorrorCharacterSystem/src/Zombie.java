import java.util.ArrayList;

/**
 * Represents a Zombie character.
 * A Zombie is a simple HorrorCharacter that cannot transform. It has a
 * shambling, straightforward attack and flee behavior.
 */
public class Zombie extends HorrorCharacter {

    /**
     * Constructs a new Zombie with a name, health, and initial vulnerability.
     * @param name The name of the zombie.
     * @param health The starting health of the zombie.
     * @param v The initial vulnerability of the zombie.
     */
    public Zombie(String name, int health, Vulnerability v ) {
        this.name = name;
        this.health = health;
        vulnerabilities.add(v);
        System.out.println("A zombie named " + name + " with health " + health + " has risen from the grave!");
    }

    /**
     * Constructs a nameless zombie.
     */
    public Zombie() {
        System.out.println("A zombie has risen from the grave!");
    }

    /**
     * Performs the zombie's lunging attack.
     */
    @Override
    public void attack() {
        System.out.println("The zombie lunges forward with a guttural growl!");
    }

    /**
     * Performs the zombie's slow, shambling flee action.
     */
    @Override
    public void flee() {
        System.out.println("The zombie shambles away slowly, groaning.");
    }

    /**
     * Adds a new vulnerability to the zombie's list of weaknesses.
     * @param v The vulnerability to add.
     */
    public void addVulnerability(Vulnerability v) {
        vulnerabilities.add(v);
    }

    /**
     * Returns a string representation of the Zombie object.
     * @return A string containing the zombie's details.
     */
    public String toString() {
        return "Zombie{name='" + name + "', health=" + health + ", vulnerabilities=" + vulnerabilities + "}";
    }
}