/*17. A company wants to track how many employees have been created in the
system.
Question:
Create a class Employee with attributes name and id.
Use a static variable employeeCount that increases every time a new object is
created.
Write a program that:
 Creates multiple employee objects
 Displays the total number of employees using a static method */

class Employee {
    String name;
    int id;
    static int employeeCount = 0; // static variable

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // increase count
    }

    // Static method to display count
    static void showCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class EmployeeCountDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee("Darshan", 101);
        Employee e2 = new Employee("Rahul", 102);
        Employee e3 = new Employee("Amit", 103);

        Employee.showCount(); // calling static method
    }
}