package SimpleGame;

public class Player2 extends Player1{
    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if(armour){
            health -= 20;
            if (health <= 0)
                health = 0;
            System.out.println("Armour is on. " + getName()  + "Got hit by gun 1. Health is reduced by 20." + " New health is " + health);
        }if (!armour){
            health -= 30;
            if (health <= 0)
                health = 0;
            System.out.println("Armour is off. " + getName() + " Got hit by gun 1. Health is reduced by 30." + " New health is " + health);
        }
        if (health == 0){
            System.out.println(getName() + " is dead");
        }
    }

    @Override
    public void damageByGun2() {
        if(armour){
            health -= 40;
            if (health <= 0)
                health = 0;
            System.out.println("Armour is on. " + getName() + " Got hit by gun 2. Health is reduced by 40." + " New health is " + health);
        }if (!armour){
            health -= 50;
            if (health <= 0)
                health = 0;
            System.out.println("Armour is off." + getName() + " Got hit by gun 2. Health is reduced by 50." + " New health is " + health);
        }
        if(health == 0){
            System.out.println(getName() + " is dead");
        }
    }

    @Override
    public void heal() {
        if(health<= 0 ){
            System.out.println(getName() + " is dead. Heal is not possible");
        }else{
           health = 100;
            System.out.println("Health is " + health);
        }
    }
}
