package oops_concept;

public class super_keyword_in_methods {
    static class Animal {
        void sound() {
            System.out.println("Animal makes sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            super.sound();  // Call parent method
            System.out.println("Dog barks Bow Bow");
        }
    }

    static class puppy extends Dog {
        @Override
        void sound() {
            super.sound();
            System.out.println("Puppy barks puff puff");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            puppy p = new puppy();
            p.sound();

        }
    }
}
