public class Main {
    public static void main(String[] args) {

//        Dog d = new Dog()     Cannot create an instance of Dog because it is abstract

        Chihuahua c = new Chihuahua();      // This Chihuahua object can be instantiated because it is not abstract, and has all the properties and methods of the Dog class

        c.bark();
        c.poop();
    }
}

abstract class Dog{     // If an interface were utilized instead, it would not have the ability to have any body of implementation code, aka all methods would need to be abstract inside of it. An abstract class allows the use of both non-abstract methods and abstract methods
    String breed;

    public void bark() {        // bark can be used by all Dog extended classes because it is not abstract, the other classes already have instructions on how to implement
        System.out.println("Bark!");
    }

    public abstract void poop();     // Because this is an abstract method, we need to tell Chihuahua how to implement
}

class Chihuahua extends Dog {       // If an interface were used, instead of the extends keyword we would use the implements keyword
    public void poop() {
        System.out.println("Dog pooped.");
    }
}