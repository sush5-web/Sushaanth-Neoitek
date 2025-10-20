
public class Week5_Program5 {

    static class Car {

        String brand;
        String model;
        int year;

        Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        void display() {
            System.out.println("Car Details: " + year + " " + brand + " " + model);
        }
    }

    static class Student {

        String name;
        int[] marks;

        Student(String name, int[] marks) {
            this.name = name;
            this.marks = marks;
        }

        double calculatePercentage() {
            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            return (double) total / marks.length;
        }

        void display() {
            System.out.println("Student Name: " + name);
            System.out.print("Marks: ");
            for (int mark : marks) {
                System.out.print(mark + " ");
            }
            System.out.println();
            System.out.printf("Percentage: %.2f%%\n", calculatePercentage());
            System.out.println();
        }
    }

    static void carProgram() {
        Car[] cars = new Car[10];

        cars[0] = new Car("Toyota", "Camry", 2022);
        cars[1] = new Car("Honda", "Civic", 2023);
        cars[2] = new Car("Ford", "Mustang", 2021);
        cars[3] = new Car("Chevrolet", "Malibu", 2020);
        cars[4] = new Car("BMW", "X5", 2024);
        cars[5] = new Car("Audi", "A4", 2022);
        cars[6] = new Car("Hyundai", "Elantra", 2023);
        cars[7] = new Car("Kia", "Seltos", 2021);
        cars[8] = new Car("Tesla", "Model 3", 2024);
        cars[9] = new Car("Nissan", "Altima", 2020);

        System.out.println("=== Car Details ===");
        for (Car car : cars) {
            car.display();
        }
    }

    static void studentProgram() {
        Student[] students = new Student[10];

        students[0] = new Student("Alice", new int[]{85, 90, 78, 92, 88});
        students[1] = new Student("Bob", new int[]{75, 80, 70, 85, 79});
        students[2] = new Student("Charlie", new int[]{88, 92, 84, 90, 86});
        students[3] = new Student("David", new int[]{65, 70, 68, 72, 75});
        students[4] = new Student("Eve", new int[]{90, 94, 89, 96, 92});
        students[5] = new Student("Frank", new int[]{78, 82, 76, 80, 79});
        students[6] = new Student("Grace", new int[]{88, 91, 87, 90, 89});
        students[7] = new Student("Hannah", new int[]{92, 95, 90, 94, 93});
        students[8] = new Student("Ivy", new int[]{70, 74, 72, 68, 71});
        students[9] = new Student("Jack", new int[]{80, 85, 82, 84, 83});

        System.out.println("\n=== Student Details ===");
        for (Student student : students) {
            student.display();
        }
    }

    public static void main(String[] args) {
        carProgram();
        studentProgram();
    }
}
