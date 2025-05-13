package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    int salary;
    Employee(int s) { salary = s; }
}

class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.salary - e2.salary;
    }
}

public class Demo {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee(50000), new Employee(30000));
        Collections.sort(emps, new SalaryComparator());

        for (Employee e : emps) System.out.println(e.salary);
    }
}

