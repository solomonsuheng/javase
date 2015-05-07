package DesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suheng on 15/5/7.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        this.subordinates.add(e);
    }

    public void remove(Employee e) {
        this.subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
