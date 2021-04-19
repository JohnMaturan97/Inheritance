package academy.learnprogramming;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Constructor
    public Animal(String name, int brain, int body, int size, int weight) {
        //declare the ogject
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //Getter
    public void eat() {
        System.out.println("Animal.Eat() called");

    }
    //Getter
    public void move(int speed) {
        System.out.println("Animal is moving at " + speed);

    }
    //Getter
    public String getName() {
        return name;
    }
    //Getter
    public int getBrain() {
        return brain;
    }
    //Getter
    public int getBody() {
        return body;
    }
    //Getter
    public int getSize() {
        return size;
    }
    //Getter
    public int getWeight() {
        return weight;
    }


}
