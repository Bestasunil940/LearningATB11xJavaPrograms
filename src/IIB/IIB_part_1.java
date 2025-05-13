package IIB;

public class IIB_part_1 { // Instance Initialization Block
    public static class Person {
        String name;

        {
            name = "Unknown";
            System.out.println("Instance block executed");
        }

        public Person() {
            System.out.println("Constructor executed, name = " + name);
        }

        public static void main(String[] args) {
            Person p = new Person();
        }
    }

}
