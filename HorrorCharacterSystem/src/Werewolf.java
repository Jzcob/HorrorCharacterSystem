import java.util.ArrayList;

public class Werewolf extends HorrorCharacter {
    private String name;
    private int health;
    private ArrayList<Vulnerability> vulnerabilities = new ArrayList<Vulnerability>();
    private Transformable transformable;
    private boolean transformed = false;

    public Werewolf(String name, int health, Vulnerability v) {
        this.name = name;
        this.health = health;
        vulnerabilities.add(v);
        System.out.println(name + " the werewolf has appeared with health " + health + "!");
    }

    @Override
    public void attack() {
        if (transformable != null) {
            transformable.transform();
            System.out.println(name + " transforms into a massive wolf!");
        } else {
            System.out.println("The werewolf charges with a terrifying roar!");
        }
    }

    @Override
    public void flee() {
        System.out.println("The werewolf retreats into the forest, howling at the moon.");
    }

    public void addVulnerability(Vulnerability v) {
        vulnerabilities.add(v);
    }

    public void getVulnerabilities() {
        System.out.print("The werewolf's vulnerabilities are: ");
        for (Vulnerability v : vulnerabilities) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public void transform() {
        transformable.transform();
        transformed = true;
        System.out.println(name + " transforms into a massive wolf!");
    }

    public void revert() {
        transformable.revert();
        transformed = false;
        System.out.println(name + " reverts back to human form.");
    }
    public boolean isTransformed() {
        return transformed;
    }

    public Werewolf() {
        System.out.println("A werewolf has transformed under the full moon!");
    }

    public String toString() {
        return "Werewolf{name='" + name + "', health=" + health + ", vulnerabilities=" + vulnerabilities + "}";
    }
}
