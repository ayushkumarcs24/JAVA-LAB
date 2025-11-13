import java.util.Scanner;

// Abstract Class
abstract class Shape {
    int dim1, dim2;

    abstract void printArea();  // abstract method
}

// Rectangle class
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        this.dim1 = length;
        this.dim2 = breadth;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (dim1 * dim2));
    }
}

// Triangle class
class Triangle extends Shape {
    Triangle(int base, int height) {
        this.dim1 = base;
        this.dim2 = height;
    }

    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle = " + area);
    }
}

// Circle class
class Circle extends Shape {
    Circle(int radius) {
        this.dim1 = radius;
    }

    void printArea() {
        double area = 3.14159 * dim1 * dim1;
        System.out.println("Area of Circle = " + area);
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int b = sc.nextInt();
        Shape rect = new Rectangle(l, b);
        rect.printArea();

        // Triangle
        System.out.print("Enter base of triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter height of triangle: ");
        int height = sc.nextInt();
        Shape tri = new Triangle(base, height);
        tri.printArea();

        // Circle
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        Shape cir = new Circle(r);
        cir.printArea();
    }
}
