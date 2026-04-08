/*9. In a Calculator class, create multiple methods named add() with different
parameter lists (e.g., one taking two integers, another taking three integers, and a
third taking two doubles).
Call the add() method with various arguments in your main program, demonstrating
that the correct method is selected at compile time based on the arguments provided.*/

class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class CalcDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum (2 ints): " + c.add(5, 10));
        System.out.println("Sum (3 ints): " + c.add(5, 10, 15));
        System.out.println("Sum (2 doubles): " + c.add(5.5, 2.5));
    }
}