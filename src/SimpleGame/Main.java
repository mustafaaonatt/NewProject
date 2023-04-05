package SimpleGame;

public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("Mustafa", "sword", -100);

        player.damageByGun1();
        player.damageByGun2();
        player.heal();

        Player2 bestPlayer = new Player2("Ali", "machine gun",100,true);

        bestPlayer.damageByGun1();
        bestPlayer.damageByGun2();
        bestPlayer.heal();







    }
}
