package oops_concept;

public class constructor_overloading {
    static class Student {
        String name;
        int age;
        char grade;

        // Constructor 1: No arguments
        Student() {
            name = "Unknown";
            age = 0;
            grade = 'N';
        }

        // Constructor 2: Two arguments
        Student(String name, int age) {
            this.name = name;
            this.age = age;
            grade = 'N';
        }

        // Constructor 3: Three arguments
        Student(String name, int age, char grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 20);
        Student s3 = new Student("Bob", 22, 'A');

        s1.display();
        s2.display();
        s3.display();
    }
}
