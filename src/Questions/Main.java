package Questions;

public class Main {
    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline",80,"Short");
        System.out.println(wolf.type+" "+wolf.maxSpeed+" "+wolf.bounds);
        System.out.println(tiger.type+" "+tiger.maxSpeed+" "+tiger.bounds);
    }
}
