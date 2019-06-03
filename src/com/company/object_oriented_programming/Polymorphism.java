package com.company.object_oriented_programming;
/*
    For more information on polymorphism: https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html

    Note: best practices 1 file per class, but for illustrative purposes I kept them in the same place
    to make it easier to look reference classes and examples
 */

public class Polymorphism {
    public static void main(String[] args) {
        for( int i = 0; i < 11; i++){
            Movie m = randomMovie();
            System.out.println("\nMovie # "+ i + " \n" + m.getName() + "\nPlot: " + m.plot());
        }
    }

    public static Movie randomMovie(){
        int randNum = (int)(Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randNum);
        switch (randNum){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new PrincessBride();
            case 4:
                return new CaptainFantastic();
            case 5:
                return new GenericMovie();
            default:
                return null;
        }
    }
}

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "The shark eats peeps";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take down Will Smith, but he prevails";
    }
}

class CaptainFantastic extends Movie{
    public CaptainFantastic() {
        super("Captain Fantastic");
    }

    @Override
    public String plot() {
        return "A couple attempts to raise their children to become philosopher kings";
    }
}

class PrincessBride extends Movie{

    public PrincessBride() {
        super("Princess Bride");
    }

    @Override
    public String plot() {
        return "An evil king tries to prevent true love, but true love prevails";
    }
}

class GenericMovie extends Movie{

    public GenericMovie() {
        super("Forgettable");
    }

    // No plot method
}



