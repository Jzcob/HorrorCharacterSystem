public abstract class HorrorCharacter {
    public abstract void attack();
    public abstract void flee();


    public enum Vulnerability {
        FIRE, SUNLIGHT, SILVER, HOLY_WATER, GARLIC, NONE
    }


    public abstract Vulnerability getVulnerability();

}
