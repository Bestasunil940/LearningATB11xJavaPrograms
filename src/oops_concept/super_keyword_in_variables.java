package oops_concept;

public class super_keyword_in_variables {
    static class Animal {
        String type = "Mammal";
    }

    static class Dog extends Animal {
        String type = "Domestic Animal";

        void showType() {
            System.out.println("Child type: " + type);           // own variable
            System.out.println("Parent type: " + super.type);    // parent's variable
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.showType();
        }
    }
}
