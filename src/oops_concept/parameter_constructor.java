package oops_concept;

public class parameter_constructor {

    static class Employee {
        String name;
        int age;
        String role;

        public Employee (String n, int i, String r) {
            name = n;
            age = i;
            role = r;
        }

        void display() {
            System.out.println("Name: "+ name +", Age: "+ age+", Role: " + role);
        }

        public static void main(String[] args) {
            Employee one = new Employee("Naveen",36,"QAEIII");
            one.display();
        }
    }
}
