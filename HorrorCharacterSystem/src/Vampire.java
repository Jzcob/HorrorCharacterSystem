import java.util.ArrayList;

/**
 * Represents a Vampire character.
 * A Vampire is a HorrorCharacter that can transform. Its attack and flee
 * behaviors change depending on its transformed state.
 */
public class Vampire extends HorrorCharacter implements Transformable {

    private boolean isTransformed = false;

    /**
     * Constructs a new Vampire with a name, health, and initial vulnerability.
     * @param name The name of the vampire.
     * @param health The starting health of the vampire.
     * @param v The initial vulnerability of the vampire.
     */
    public Vampire(String name, int health, Vulnerability v) {
        this.name = name;
        this.health = health;
        vulnerabilities.add(v);
        System.out.println("A vampire named " + name + " with health " + health + " has emerged from the shadows!");
    }

    /**
     * Constructs a nameless vampire.
     */
    public Vampire() {
        System.out.println("A vampire has emerged from the shadows!");
    }

    /**
     * Performs an attack. The attack's description changes based on whether
     * the vampire is in its bat form (transformed) or human form.
     */
    @Override
    public void attack() {
        if (isTransformed) {
            System.out.println(name + " swoops down from the sky, biting with razor-sharp fangs!");
        } else {
            System.out.println(name + " lunges forward with a sinister grin, ready to strike!");
        }
    }

    /**
     * Performs a flee action. The flee description changes based on whether
     * the vampire is in its bat form (transformed) or human form.
     */
    @Override
    public void flee() {
        if (isTransformed) {
            System.out.println(name + " flutters away into the night sky!");
        } else {
            System.out.println(name + " melts into the shadows, disappearing from sight.");
        }
    }

    /**
     * Adds a new vulnerability to the vampire's list of weaknesses.
     * @param v The vulnerability to add.
     */
    public void addVulnerability(Vulnerability v) {
        vulnerabilities.add(v);
    }


    /**
     * Transforms the vampire into its alternate form (a bat).
     */
    @Override
    public void transform() {
        isTransformed = true;
        System.out.println(name + " transforms into a bat!");
    }

    /**
     * Reverts the vampire from its bat form back to its human form.
     */
    @Override
    public void revert() {
        isTransformed = false;
        System.out.println(name + " reverts back to human form.");
    }

    /**
     * Checks if the vampire is currently transformed.
     * @return true if the vampire is in bat form, false otherwise.
     */
    @Override
    public boolean isTransformed() {
        return isTransformed;
    }

    /**
     * Returns a string representation of the Vampire.
     * Note: Prints to console instead of returning a formatted string.
     * @return null.
     */
    public String toString() {
        System.out.println("Vampire Name: " + name + ", Health: " + health);
        return null;
    }
}