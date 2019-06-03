package com.company.object_oriented_programming;

/*
    When to use composition vs inheritance:
    https://stackoverflow.com/questions/2399544/difference-between-inheritance-and-composition

    Note: best practices 1 file per class, but for illustrative purposes I kept them in the same place
    to make it easier to look reference classes and examples
 */

public class Composition {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case aCase = new Case( "220B", "Dell", "240", dimensions);

        Monitor aMonitor = new Monitor("27" , "Thinkpad", 27, new Resolution(240,240));

        Motherboard mb = new Motherboard("abc-123", "Asus", 2,1,"v1.88");

        PC aPc = new PC(aCase, aMonitor, mb);
        aPc.bootUp();
    }

}

class PC{
    private Case aCase;
    private Monitor monitor;
    private Motherboard board;

    public PC(Case aCase, Monitor monitor, Motherboard board) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.board = board;
    }

    public void bootUp(){
        aCase.pressPowerUp();
        draw();
    }

    private void draw(){
        // fancy graphics
        monitor.drawAt(12,50,"red");
    }
}

class Motherboard{
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String name){
        System.out.println("Program " + name + " is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}

class Monitor{
    private String model;
    private String manufacturer;
    private int size;
    private Resolution res;

    public Monitor(String model, String manufacturer, int size, Resolution res) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.res = res;
    }

    public void drawAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "\n" + y + "\ncolor: " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getRes() {
        return res;
    }
}

class Resolution{

    private int w;
    private int h;

    public Resolution(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
}

class Case{

    private String model;
    private String manufacturer;
    private String supply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String supply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.supply = supply;
        this.dimensions = dimensions;
    }

    public void pressPowerUp(){
        System.out.println("Powering up computer...");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSupply() {
        return supply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

class Dimensions{
    private int w;
    private int h;
    private int d;

    public Dimensions(int w, int h, int d) {
        this.w = w;
        this.h = h;
        this.d = d;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public int getD() {
        return d;
    }
}






