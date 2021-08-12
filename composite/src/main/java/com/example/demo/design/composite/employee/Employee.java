package com.example.demo.design.composite.employee;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yao
 * @date 2019/12/5
 */
public class Employee {

    private String name;

    private String dept;

    private int salary;

    @Getter
    @Setter
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remote(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public String toString() {
        return "Employee [ Name: " + name + ", Dept: " + dept + ", Salary: " + salary + " ]";
    }
}
