package academy.learnprogramming;

//Task #2 : extend the proper class for inheritance. On this project its animal
// since it contains the main constructors and getters.
public class Fish extends Animal{

    //Task#1 : Create the fields
    private int gills ;
    private  int eyes;
    private int fins;

    //Task#3 : Create the constructor after creating the fields
    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {

    }

    public void moveMuscles() {

    }

    public void moveBackFin() {

    }

    public void swim(int speed) {
        //Calling these 2 methods for speed
        moveMuscles();
        moveBackFin();
        //using super from the Animal class
        super.move(speed);
    }
}
