package oops_concept;

public class Inheritance_part_1 {
    static class Grandparent {
        void legacy() {
            System.out.println("Grandparent’s legacy...");
        }
    }

    static class Parent extends Grandparent {
        void teach() {
            System.out.println("Parent is teaching...");
        }
    }

    static class Child extends Parent {
        void play() {
            System.out.println("Child is playing...");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Child c = new Child();
            c.legacy();  // from Grandparent
            c.teach();   // from Parent
            c.play();    // Child's own method
        }
    }

}
