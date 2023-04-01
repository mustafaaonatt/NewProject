package SimpleGame;

public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("Mustafa", "sword", 100);
//       System.out.println(player.getName());
//       System.out.println(player.getWeapon());
//       System.out.println(player.getHealth());

       player.damageByGun1();
       player.damageByGun1();
       player.damageByGun2();
       player.heal();



    }
}
