package oops_concept;

public class type_of_methods {

    static class Laptop {
        String brand;
        String model;
        String processor;
        int ramSize;
        int storageSize;
        String storageType;
        double screenSize;
        int batteryPercentage;
        boolean isTouchScreen;
        double price;

        // 1: Without Parameters & Without Return Type
        void displayLaptopDetails() {
            System.out.println("Laptop Details:");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Processor: " + processor);
            System.out.println("RAM: " + ramSize + " GB");
            System.out.println("Storage: " + storageSize + " GB " + storageType);
            System.out.println("Screen Size: " + screenSize + " inches");
            System.out.println("Battery: " + batteryPercentage + "%");
            System.out.println("Touch Screen: " + (isTouchScreen ? "Yes" : "No"));
            System.out.println("Price: INR " + price);
        }

        // 2: Without Parameters & With Return Type
        String getBrand() {
            return brand;
        }

        // 3: With Parameters & Without Return Type
        void upgradeRAM(int extraRam) {
            ramSize += extraRam;
            System.out.println("RAM upgraded! New RAM Size: " + ramSize + " GB");
        }

        // 4: ️With Parameters & With Return Type
        int chargeBattery(int chargeAmount) {
            batteryPercentage += chargeAmount;
            if (batteryPercentage > 100) {
                batteryPercentage = 100;
            }
            return batteryPercentage;
        }
    }
    public static class LaptopDemo {
        public static void main(String[] args) {
            // Creating a Laptop object
            Laptop myLaptop = new Laptop();

            // Manually assigning values
            myLaptop.brand = "Dell";
            myLaptop.model = "XPS 15";
            myLaptop.processor = "Intel i7";
            myLaptop.ramSize = 16;
            myLaptop.storageSize = 512;
            myLaptop.storageType = "SSD";
            myLaptop.screenSize = 15.6;
            myLaptop.batteryPercentage = 60;
            myLaptop.isTouchScreen = true;
            myLaptop.price = 75999.99;

            // 1:Display Laptop Details
            myLaptop.displayLaptopDetails();

            // 2:Get and Print Laptop Brand
            System.out.println("Laptop Brand: " + myLaptop.getBrand());

            // 3:Upgrade RAM by 8GB
            myLaptop.upgradeRAM(8);

            // 4::️Charge Battery by 30%
            int newBatteryLevel = myLaptop.chargeBattery(30);
            System.out.println("Updated Battery Level: " + newBatteryLevel + "%");
        }
    }
}
