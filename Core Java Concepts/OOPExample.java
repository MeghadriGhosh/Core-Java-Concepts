// Base class (Superclass)
abstract class Animal {
    private String name;  // Encapsulation - private variable with public methods

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {  // Getter method (encapsulation)
        return name;
    }

    public abstract void sound();  // Abstract method (abstraction)
}

// Derived class (Inheritance)
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {  // Polymorphism - method overriding
        System.out.println(getName() + " says Woof!");
    }
}

// Another derived class (Inheritance)
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {  // Polymorphism - method overriding
        System.out.println(getName() + " says Meow!");
    }
}

// Main class to test the OOP features
public class OOPExample {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex");  // Polymorphism - reference of type Animal
        Animal cat = new Cat("Whiskers");

        dog.sound();  // Calls Dog's sound method
        cat.sound();  // Calls Cat's sound method
    }
}
