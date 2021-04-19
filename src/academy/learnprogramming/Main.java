package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //Define / Create new class - including the parameters
        Animal animal = new Animal("Animal", 1, 1, 5,5);

        //Define Dog Class
        Dog dog = new Dog("Lab", 7, 21, 2, 1,4,8,"Black");

        //inherit from eat() method from Animal Class and printing result
        dog.eat();

        //Calling the methos from Dog class
        //dog.walk();
        dog.run();


    }
}
