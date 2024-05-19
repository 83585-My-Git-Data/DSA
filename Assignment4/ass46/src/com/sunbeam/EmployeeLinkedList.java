package com.sunbeam;

import java.util.LinkedList;
import java.util.List;

public class EmployeeLinkedList {
    private List<Employee> employees;

    public EmployeeLinkedList() {
        employees = new LinkedList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    public Employee searchEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }

    public boolean deleteEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                return true;
            }
        }
        return false;
    }

    public boolean updateSalary(int id, double newSalary) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setSalary(newSalary);
                return true;
            }
        }
        return false;
    }
}
