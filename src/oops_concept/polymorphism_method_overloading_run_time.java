package oops_concept;

public class polymorphism_method_overloading_run_time {
    static class Animal {
        // Method in superclass
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        // Overriding method in subclass
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        // Overriding method in subclass
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();
            Animal Animal_1 = new Dog(); // Animal reference but Dog object
            Animal Animal_2 = new Cat(); // Animal reference but Cat object

            myAnimal.sound(); // Outputs "Animal makes a sound"
            Animal_1.sound();    // Outputs "Dog barks"
            Animal_2.sound();    // Outputs "Cat meows"
        }
    }

}
