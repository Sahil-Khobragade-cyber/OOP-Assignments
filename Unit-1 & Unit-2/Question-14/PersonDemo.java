/*14. Create a base class Person with method role().
Create subclasses:
 Employee
 Manager (extends Employee)
Override role() in each class and demonstrate multilevel inheritance with runtime
polymorphism.*/

class Person {
    void role() {
        System.out.println("I am a Person");
    }
}

class Employee extends Person {
    void role() {
        System.out.println("I am an Employee");
    }
}

class Manager extends Employee {
    void role() {
        System.out.println("I am a Manager");
    }
}

public class PersonDemo {
    public static void main(String[] args) {

        Person p;

        p = new Person();
        p.role();

        p = new Employee();
        p.role();

        p = new Manager();
        p.role();
    }
}