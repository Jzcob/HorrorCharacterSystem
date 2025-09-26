/**
 * An interface for characters that have the ability to transform
 * into an alternate form.
 */
public interface Transformable {

    /**
     * Changes the character into their alternate form.
     */
    void transform();

    /**
     * Reverts the character back to their original form.
     */
    void revert();

    /**
     * Checks if the character is currently in a transformed state.
     * @return true if the character is transformed, false otherwise.
     */
    boolean isTransformed();
}