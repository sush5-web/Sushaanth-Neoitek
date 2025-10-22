
public class Week6_Program6 {

    static class Person {

        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    static class Student extends Person {

        int studentId;
        String course;

        Student(String name, int age, int studentId, String course) {
            super(name, age); // call Person constructor
            this.studentId = studentId;
            this.course = course;
        }

        void display() {
            super.display();
            System.out.println("Student ID: " + studentId);
            System.out.println("Course: " + course);
        }
    }

    static void program1() {
        System.out.println("=== Program 1: Inheritance (Person → Student) ===");
        Student s1 = new Student("Alice", 20, 101, "Computer Science");
        Student s2 = new Student("Bob", 22, 102, "Mechanical Engineering");
        s1.display();
        System.out.println();
        s2.display();
        System.out.println();
    }

    static class Calculator {

        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    static void program2() {
        System.out.println("=== Program 2: Method Overloading ===");
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 2 doubles: " + calc.add(4.5, 3.2));
        System.out.println("Sum of 3 integers: " + calc.add(2, 4, 6));
        System.out.println();
    }


    static class Employee {

        void work() {
            System.out.println("Employee is working...");
        }
    }

    static class Manager extends Employee {

        @Override
        void work() {
            System.out.println("Manager is managing the team...");
        }
    }

    static void program3() {
        System.out.println("=== Program 3: Method Overriding ===");
        Employee e1 = new Employee();
        Employee e2 = new Manager(); 

        e1.work();
        e2.work();
        System.out.println();
    }

    public static void main(String[] args) {
        program1();
        program2();
        program3();
    }
}
