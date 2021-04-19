package academy.learnprogramming;

//Create a dog class to extend/Inheriting from Animal class
public class Dog extends Animal {

    //Create the fields
    private int eyes;
    private  int legs;
    private int tail;
    private  int teeth;
    private String coat;

    //Calling the constructor from Animal class
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //This was inherited from Animal Class
        super(name, 1, 1, size, weight);

        //Init the Fields
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }
    //Creating new function
    private void chew() {
        System.out.println("Dog.Chew() called");
    }

    @Override // Using the override method for eat() method
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        //calling the super class
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        //calling move() method from Animal class
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    //Create a new method for the new override object moveLegs
    public void moveLegs(int speed) {
        System.out.println("Dog.movelegs() called");
    }

    @Override //using override function to redefine move() method
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }


}
