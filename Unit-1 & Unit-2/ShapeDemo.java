/*7. Create an abstract class Shape with an abstract method calculate_area() and a
concrete method display_info(). Create concrete subclasses
like Circle and Rectangle that must implement their own specific logic
for calculate_area(). Try to instantiate an object of the Shape class directly and
observe the compilation error. Use the subclass objects to call both abstract and
concrete methods. */

abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    int r;

    Circle(int r) {
        this.r = r;
    }

    void calculate_area() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void calculate_area() {
        System.out.println("Rectangle Area: " + (l * b));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        c.display_info();
        c.calculate_area();

        r.display_info();
        r.calculate_area();
    }
}