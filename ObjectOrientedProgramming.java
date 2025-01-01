// ObjectOrientedProgramming.java

// Abstract class
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void sound();

    // Concrete method
    void display() {
        System.out.println("Animal: " + name);
    }
}

// Inheritance
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    // Overriding abstract method
    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    // Overriding abstract method
    @Override
    void sound() {
        System.out.println(name + " says: Meow!");
    }
}

// Interface
interface Calculator {
    int calculate(int a, int b);
}

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // Polymorphism with inheritance
        Animal dog = new Dog("Buddy");
        dog.display();
        dog.sound();

        Animal cat = new Cat("Whiskers");
        cat.display();
        cat.sound();

        // Lambda expression (used with functional interface)
        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;

        int num1 = 5, num2 = 3;
        System.out.println("\nLambda Expressions:");
        System.out.println("Addition of " + num1 + " and " + num2 + ": " + addition.calculate(num1, num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + ": " + multiplication.calculate(num1, num2));
    }
}
