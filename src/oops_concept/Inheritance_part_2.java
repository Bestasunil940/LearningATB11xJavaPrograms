package oops_concept;

public class Inheritance_part_2 {
    static class car {                                          // parent class
        void Automobile(){
            System.out.println("Type of engines: ");
        }
    }

    static class fuel extends car {                             // child class
        void petrol() {
            System.out.println("Petrol engine");
        }
        void diesel() {
            System.out.println("Diesel engine ");
        }
        void battery () {
            System.out.println("Asynchronous engine");
        }
    }
    static class hybrid extends fuel {                          // sub-child or grand child class
        void hybrid_petrol() {
            System.out.println("mixer of petrol and Asynchronous engine");
        }
        void hybrid_diesel() {
            System.out.println("mixer of diesel and Asynchronous engine");
        }
    }

    public static class TestCar {
        public static void main(String[] args) {
            hybrid h = new hybrid();
            h.Automobile();
            h.petrol();
            h.diesel();
            h.battery();
            h.hybrid_petrol();
            h.hybrid_diesel();
        }
    }
}
