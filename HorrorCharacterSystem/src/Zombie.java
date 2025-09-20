public class Zombie extends HorrorCharacter {
    private String name;
    private int health;

    public Zombie(String name, int health) {
        this.name = name;
        this.health = health;
        System.out.println("A zombie named " + name + " with health " + health + " has risen from the grave!");
    }

    @Override
    public void attack() {
        System.out.println("The zombie lunges forward with a guttural growl!");
    }

    @Override
    public void flee() {
        System.out.println("The zombie shambles away slowly, groaning.");
    }

    @Override
    public Vulnerability getVulnerability() {
        return Vulnerability.FIRE;
    }

    public Zombie() {
        System.out.println("A zombie has risen from the grave!");
    }
}
