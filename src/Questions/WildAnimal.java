package Questions;

public class WildAnimal extends Animal{
    String bounds;

    public WildAnimal(String bounds) {
        this.bounds = bounds; // line n1
    }

    public WildAnimal(String type, int maxSpeed, String bounds) {
        // line n2
        super(type, maxSpeed);
        this.bounds = bounds;
    }
}
