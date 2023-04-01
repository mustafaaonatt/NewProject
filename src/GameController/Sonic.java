package GameController;

public class Sonic extends Game {
    @Override
    public void up() {
        System.out.println("Sonic looks up. ");
    }

    @Override
    public void down() {
        System.out.println("Sonic spins. ");
    }

    @Override
    public void right() {
        System.out.println("Sonic stops / moves forward. ");
    }

    @Override
    public void left() {
        System.out.println("Sonic stops / moves backwards. ");
    }

    @Override
    public void A() {
        System.out.println("Sonic jumps. ");
    }

    @Override
    public void B() {
        System.out.println("Sonic pushes. ");
    }
}
