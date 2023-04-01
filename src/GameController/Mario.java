package GameController;

public class Mario extends Game {
    @Override
    public void up() {
        System.out.println("-------");
    }

    @Override
    public void down() {
        System.out.println("Mario goes in the pipes. ");
    }

    @Override
    public void right() {
        System.out.println("Mario moves forwards. ");
    }

    @Override
    public void left() {
        System.out.println("Mario stops / move backward. ");
    }

    @Override
    public void A() {
        System.out.println("Mario Jumps. ");
    }

    @Override
    public void B() {
        System.out.println("Mario throws fire balls. ");
    }
}
