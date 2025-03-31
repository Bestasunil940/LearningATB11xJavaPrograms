package oops_concept;

public class copy_constructor {
    static class Student {
        String name;
        int age;

        // Parameterized constructor
        Student(String n, int a) {
            name = n;
            age = a;
        }
        // copy constructor
        Student(Student copy) {
            name = copy.name;
            age = copy.age;
        }


        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 21);
        Student s2 = new Student(s1);
        s2.display();

    }
}
