package Static;

public class Static_part_2 {
    public static class Car {
        static int wheels = 4;
        String model;

        public Car(String model) {
            this.model = model;
        }

        public void show() {
            System.out.println(model + " has " + wheels + " wheels");
        }

        public static void main(String[] args) {
            new Car("BMW").show();
            new Car("Audi").show();
        }
    }

}
