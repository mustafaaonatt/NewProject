package SimpleGame;

public class Player1 {
    private String name;
    private String weapon;
    private  int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health < 0 || health > 100){
            this.health = 100;
        }else {
            this.health = health;
        }

    }
    public void damageByGun1(){
       health -= 30;
        if (health <= 0){
            health = 0;
        }
        System.out.println(name + " Got hit by gun 1. Health is reduced by 30. " +"New health is " + health);
        if (health == 0){
            System.out.println( getName() + " is dead");
        }
    }
    public void  damageByGun2(){
        health -= 50;
        if (health <= 0){
            health = 0;
        }
        System.out.println(name + " Got hit by gun 2. Health is reduced by 50. " +"New health is " + health);
        if (health == 0){
            System.out.println(getName() + " is dead");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void  heal(){
        if(health <= 0 ){
            System.out.println(getName() + " is dead. Heal is not possible");
        }else{
            health = 100;
            System.out.println("Health is " + health);
        }
    }
}
