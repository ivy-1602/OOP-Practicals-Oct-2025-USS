/**
 * Interfaces
 * Pure abstraction - all methods are abstract (until Java 8)
 * A class can implement multiple interfaces
 */

interface Animal {
    void sound();  // public abstract by default
    void move();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    String name;
    
    Dog(String name) {
        this.name = name;
    }
    
    @Override
    public void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " runs on four legs");
    }
    
    @Override
    public void play() {
        System.out.println(name + " plays fetch!");
    }
}

class Cat implements Animal, Pet {
    String name;
    
    Cat(String name) {
        this.name = name;
    }
    
    @Override
    public void sound() {
        System.out.println(name + " says: Meow!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " walks gracefully");
    }
    
    @Override
    public void play() {
        System.out.println(name + " plays with yarn!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("--- Dog ---");
        Dog dog = new Dog("Buddy");
        dog.sound();
        dog.move();
        dog.play();
        
        System.out.println("\n--- Cat ---");
        Cat cat = new Cat("Whiskers");
        cat.sound();
        cat.move();
        cat.play();
    }
}
