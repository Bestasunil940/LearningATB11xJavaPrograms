package oops_concept;

public class Super_keyword_used_in_all {
    public static class SuperKeywordExample {

        // 👴 Parent class
        static class Vehicle {
            String type = "Generic Vehicle";

            //parent constructor
            Vehicle() {
                System.out.println("Vehicle constructor: Base setup complete");
            }

            void start() {
                System.out.println("Vehicle is starting...");
            }
        }

        // 👶 Child class
        static class Car extends Vehicle {
            String type = "Car";  // Same variable name as in parent class

            Car() {
                super();  // 👈 Calls parent constructor
                System.out.println("Car constructor: Additional setup done");
            }

            void start() {
                super.start();  // 👈 Calls parent class method
                System.out.println("Car is starting with a key...");
            }

            void showType() {
                System.out.println("Child type: " + type);         // Car's variable
                System.out.println("Parent type: " + super.type);  // Vehicle's variable
            }
        }

        public static void main(String[] args) {
            Car myCar = new Car();        // Constructor chain will run
            myCar.start();                // Both parent and child methods
            myCar.showType();             // Accessing variables from both classes
        }
    }

}
