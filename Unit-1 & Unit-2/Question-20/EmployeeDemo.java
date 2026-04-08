/* 20. A company wants to clearly assign constructor parameters to object variables.

Question:
Create a class Employee with variables name and salary.
Use this keyword inside the constructor to initialize object variables.
Display employee details. */
class Employee {
    String name;
    double salary;

    // Constructor using 'this'
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee("Darshan", 30000);
        Employee e2 = new Employee("Rahul", 40000);

        e1.display();
        e2.display();
    }
}