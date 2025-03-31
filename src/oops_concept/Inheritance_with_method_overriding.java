package oops_concept;

public class Inheritance_with_method_overriding {
    // 👴 Parent class
    static class car {
        void Automobile() {
            System.out.println("Automobile: General types of engines");
        }
    }

    // 👨 Child class (inherits from car)
    static class fuel extends car {

        @Override
        void Automobile() {
            System.out.println("Automobile: Fuel-powered engines - Petrol, Diesel, Battery");
        }

        void petrol() {
            System.out.println("Fuel Engine: Petrol engine");
        }

        void diesel() {
            System.out.println("Fuel Engine: Diesel engine");
        }

        void battery() {
            System.out.println("Fuel Engine: Asynchronous (Electric) engine");
        }
    }

    // 👶 Sub-child class (inherits from fuel, indirectly from car)
    static class hybrid extends fuel {

        @Override
        void Automobile() {
            System.out.println("Automobile: Hybrid engines - Combines Fuel and Electric power");
        }

        @Override
        void battery() {
            System.out.println("Hybrid Engine: High-efficiency electric battery");
        }

        void hybrid_petrol() {
            System.out.println("Hybrid System: Petrol + Electric engine");
        }

        void hybrid_diesel() {
            System.out.println("Hybrid System: Diesel + Electric engine");
        }
    }

    // 🧪 Test class
    public static class TestCar {
        public static void main(String[] args) {
            hybrid h = new hybrid();

            // Overridden methods
            h.Automobile();        // hybrid's version
            h.battery();           // hybrid's overridden battery

            // Inherited methods from fuel
            h.petrol();
            h.diesel();

            // Own methods in hybrid
            h.hybrid_petrol();
            h.hybrid_diesel();

        }
    }
}
