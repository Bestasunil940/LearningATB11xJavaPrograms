package oops_concept;

public class polymorphism_method_over_loading_riding {
    static class Animal {
        // Method to be overridden
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }

        // Overloaded method (compile-time polymorphism)
        public void makeSound(String timeOfDay) {
            System.out.println("Animal makes a sound in the " + timeOfDay);
        }
    }

    static class Dog extends Animal {
        // Overriding the makeSound method (runtime polymorphism)
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }

        // Overloaded version of makeSound
        public void makeSound(String timeOfDay) {
            System.out.println("Dog barks in the " + timeOfDay);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();
            Animal myDog = new Dog(); // Polymorphic reference

            // Compile-time polymorphism (overloading)
            myAnimal.makeSound();               // Output: Animal makes a sound
            myAnimal.makeSound("morning");      // Output: Animal makes a sound in the morning

            // Runtime polymorphism (overriding)
            myDog.makeSound();                  // Output: Dog barks
            myDog.makeSound("evening");         // Output: Animal makes a sound in the evening
            // Note: myDog is an Animal reference, so it calls Animal's overloaded method

            // To call Dog's overloaded version, use Dog reference
            Dog realDog = new Dog();
            realDog.makeSound("night");         // Output: Dog barks in the night
        }
    }

}
