package oops_concept;

public class super_keyword_in_constructor {
    static class Superclass {
        // Constructor for Superclass
        Superclass(String name) {
            System.out.println("Superclass constructor called for: " + name);
        }
    }

    static class Subclass extends Superclass {
        // Constructor for Subclass
        Subclass(String name) {
            super(name);
            //super(name); // Calls Superclass constructor
            System.out.println("Subclass constructor called for: " + name);
        }
    }

    static class Main {
        public static void main(String[] args) {
            Subclass sc = new Subclass("Sunil");
        }
    }

    static class Animal {
        Animal() {
            System.out.println("Animal constructor");
        }
    }

    static class Dog extends Animal {
        Dog() {
            super(); // Optional, but it's called by default
            System.out.println("Dog constructor");
        }
    }

    public static class Test {
        public static void main(String[] args) {
            Dog d = new Dog();
        }
    }

}
