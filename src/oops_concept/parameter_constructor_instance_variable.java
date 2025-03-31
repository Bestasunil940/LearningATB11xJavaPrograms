package oops_concept;

public class parameter_constructor_instance_variable {

    static class Student {
        String name;
        int age;
        Character grade;


        public Student(String name, int age, Character grade) {
            this.name = name;
            this.grade = grade;
            this.age = age;

        }

        void display (){
            System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
        }

        public static void main(String[] args) {
            Student s1 = new Student("Sunil",27,'A');
            s1.display();

        }
    }
}
