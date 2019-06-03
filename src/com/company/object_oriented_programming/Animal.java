package com.company.object_oriented_programming;

public class Animal {

    // State
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // Behavior

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Nom nom nom!");
    }

    public void move(int speed){
        System.out.println("Animal is moving" + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
