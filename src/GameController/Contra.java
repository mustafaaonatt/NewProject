package GameController;

public class Contra extends Game{
    @Override
    public void up() {
        System.out.println("Soldier aims up. ");
    }

    @Override
    public void down() {
        System.out.println("Soldier aims down. ");
    }

    @Override
    public void right() {
        System.out.println("Soldier moves forward and aims front. ");
    }

    @Override
    public void left() {
        System.out.println("Soldier moves backward and aims back. ");
    }

    @Override
    public void A() {
        System.out.println("Soldier jumps. ");
    }

    @Override
    public void B() {
        System.out.println("Soldier fires. ");
    }
}
