package Comparable;

import java.util.Arrays;

public class Test_1 {
    static class Student implements Comparable<Student> {
        int age;
        Student(int age) { this.age = age; }

        public int compareTo(Student s) {
            return this.age - s.age;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Student[] students = {new Student(22), new Student(18)};
            Arrays.sort(students);

            for (Student s : students)
                System.out.println(s.age);
        }
    }

}
