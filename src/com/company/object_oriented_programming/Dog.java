package com.company.object_oriented_programming;

public class Dog extends Animal {

    private String coat;
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;

    public Dog(String name, int size, int weight, int eyes, int teeth, int tail, String coat) {
        super(name, 1, 1, size, weight);

        this.coat = coat;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog is moving " + speed);
    }

    public void walk(){
        System.out.println("Dog is walking");
        move(5);
    }

    public void run(){
        System.out.println("Dog is running");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("Dog is moving it's legs");
    }
}
