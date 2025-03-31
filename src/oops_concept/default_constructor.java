package oops_concept;

public class default_constructor {

    static class Student {
        String name;
        int age;
        Character grade;

        Student() {
            name = "Jo";
            age = 26;
            grade = 'A';

        }

        void display (){
            System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
        }

        public static void main(String[] args) {
            Student s1 = new Student();
            s1.display();
        }
    }
}
