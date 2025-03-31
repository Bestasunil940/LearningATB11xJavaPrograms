package oops_concept;

public class method_overriding {
    static class Animal {
        void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Cat meows");
        }
    }
    public static class TestAnimal {
        public static void main(String[] args) {
            method_overriding.Animal a1 = new method_overriding.Dog();  // Parent reference, child object
            method_overriding.Animal a2 = new method_overriding.Cat();

            a1.makeSound(); // Dog's method
            a2.makeSound(); // Cat's method
        }
    }

}
