import java.util.ArrayList;

/**
 * Represents a Werewolf character.
 * A Werewolf is a HorrorCharacter that can transform into a wolf form.
 * Its attack behavior changes based on its transformation state.
 */
public class Werewolf extends HorrorCharacter implements Transformable {

    private boolean transformed = false;

    /**
     * Constructs a new Werewolf with a name, health, and initial vulnerability.
     * @param name The name of the werewolf.
     * @param health The starting health of the werewolf.
     * @param v The initial vulnerability of the werewolf.
     */
    public Werewolf(String name, int health, Vulnerability v) {
        this.name = name;
        this.health = health;
        vulnerabilities.add(v);
        System.out.println(name + " the werewolf has appeared with health " + health + "!");
    }

    /**
     * Constructs a nameless werewolf.
     */
    public Werewolf() {
        System.out.println("A werewolf has transformed under the full moon!");
    }

    /**
     * Performs an attack. The attack's description changes based on whether
     * the werewolf is in its wolf form (transformed) or human form.
     */
    @Override
    public void attack() {
        if (transformed) {
            System.out.println(name + " lunges forward with razor-sharp claws and fangs!");
        } else {
            System.out.println(name + " growls menacingly, ready to pounce!");
        }
    }

    /**
     * Performs a flee action by retreating into the forest.
     */
    @Override
    public void flee() {
        System.out.println("The werewolf retreats into the forest, howling at the moon.");
    }

    /**
     * Adds a new vulnerability to the werewolf's list of weaknesses.
     * @param v The vulnerability to add.
     */
    public void addVulnerability(Vulnerability v) {
        vulnerabilities.add(v);
    }

    /**
     * Transforms the werewolf into its massive wolf form.
     */
    @Override
    public void transform() {
        transformed = true;
        System.out.println(name + " transforms into a massive wolf!");
    }

    /**
     * Reverts the werewolf from its wolf form back to its human form.
     */
    @Override
    public void revert() {
        transformed = false;
        System.out.println(name + " reverts back to human form.");
    }

    /**
     * Checks if the werewolf is currently transformed.
     * @return true if the werewolf is in wolf form, false otherwise.
     */
    @Override
    public boolean isTransformed() {
        return transformed;
    }

    /**
     * Returns a string representation of the Werewolf object.
     * @return A string containing the werewolf's details.
     */
    public String toString() {
        return "Werewolf{name='" + name + "', health=" + health + ", vulnerabilities=" + vulnerabilities + "}";
    }
}