package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    Student(int age) { this.age = age; }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

public class Test {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(20), new Student(15));
        Collections.sort(list, new AgeComparator());

        for (Student s : list)
            System.out.println(s.age);
    }
}
