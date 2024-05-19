package com.sunbeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeLinkedList employeeList = new EmployeeLinkedList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Update Salary of Employee");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    employeeList.addEmployee(new Employee(id, name, salary));
                    break;

                case 2:
                    employeeList.displayAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter Name: ");
                    String searchName = scanner.nextLine();
                    Employee employee = employeeList.searchEmployeeByName(searchName);
                    if (employee != null) {
                        System.out.println(employee);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int deleteId = scanner.nextInt();
                    boolean deleted = employeeList.deleteEmployeeById(deleteId);
                    if (deleted) {
                        System.out.println("Employee deleted successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();
                    boolean updated = employeeList.updateSalary(updateId, newSalary);
                    if (updated) {
                        System.out.println("Salary updated successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
