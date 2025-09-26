import java.util.ArrayList;

/**
 * The base abstract class for all horror characters in the system.
 * It defines the common attributes like name, health, and vulnerabilities,
 * as well as common abstract behaviors like attack and flee.
 */
public abstract class HorrorCharacter {

    /** The name of the horror character. */
    protected String name;

    /** The health points of the horror character. */
    protected int health;

    /** A list of vulnerabilities the character is susceptible to. */
    protected ArrayList<Vulnerability> vulnerabilities = new ArrayList<Vulnerability>();

    /**
     * An enumeration of possible weaknesses for horror characters.
     */
    public enum Vulnerability {
        FIRE, SUNLIGHT, SILVER, HOLY_WATER, GARLIC, NONE
    }

    /**
     * Gets the list of vulnerabilities for this character.
     * @return An ArrayList of Vulnerability enums.
     */
    protected ArrayList<Vulnerability> getVulnerabilities() {
        return this.vulnerabilities;
    }

    /**
     * Defines the character's primary attack action. This must be
     * implemented by all concrete subclasses.
     */
    public abstract void attack();

    /**
     * Defines the character's flee action. This must be
     * implemented by all concrete subclasses.
     */
    public abstract void flee();
}