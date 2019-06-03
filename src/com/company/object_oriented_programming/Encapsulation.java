package com.company.object_oriented_programming;


/*
    What is encapsulation and why does it matter?
        https://stackoverflow.com/questions/11966763/java-encapsulation#11970468

     Note: best practices 1 file per class, but for illustrative purposes I kept them in the same place
    to make it easier to look reference classes and examples
 */

public class Encapsulation {

}

class Player{

    private String name;
    private int hp; // Note internal naming is different from public name, why would we do this?
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if( health > 0 && health <= 100) this.hp = health;
        this.weapon = weapon;
    }

    public void damaged(int damage){
        this.hp = this.hp - damage;
        if( this.hp <= 0) System.out.println("Player is dead");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return hp;
    }

    public void setHealth(int health) {
        this.hp = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
