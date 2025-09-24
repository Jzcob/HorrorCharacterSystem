import java.util.ArrayList;

public class Zombie extends HorrorCharacter {
    private String name;
    private int health;
    private ArrayList<Vulnerability> vulnerabilities = new ArrayList<Vulnerability>();

    public Zombie(String name, int health, Vulnerability v ) {
        this.name = name;
        this.health = health;
        vulnerabilities.add(v);
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

    public void addVulnerability(Vulnerability v) {
        vulnerabilities.add(v);
    }
    public void getVulnerabilities() {
        System.out.print("The zombie's vulnerabilities are: ");
        for (Vulnerability v : vulnerabilities) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public Zombie() {
        System.out.println("A zombie has risen from the grave!");
    }
}
