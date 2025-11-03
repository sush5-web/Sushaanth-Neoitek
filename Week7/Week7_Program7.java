
abstract class Shape {

    abstract double area();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

interface Bank {

    double getInterestRate();
}

class SBI implements Bank {

    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC implements Bank {

    public double getInterestRate() {
        return 7.0;
    }
}

interface Printable {

    void print();
}

interface Showable {

    void show();
}

class Display implements Printable, Showable {

    public void print() {
        System.out.println("Printing from Printable interface");
    }

    public void show() {
        System.out.println("Showing from Showable interface");
    }
}

public class Week7_Program7 {

    public static void program1() {
        System.out.println("\n--- Abstract Class Example ---");
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }

    public static void program2() {
        System.out.println("\n--- Interface Example ---");
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
    }

    public static void program3() {
        System.out.println("\n---  Multiple Inheritance using Interfaces ---");
        Display display = new Display();
        display.print();
        display.show();
    }

    public static void main(String[] args) {
        program1();
        program2();
        program3();
    }
}
