package org.example;

import java.util.Scanner;

public class Week2_Program2 {


    public void showPrimitiveDataTypes() {
        byte b = 100;
        short s = 30000;
        int i = 100000;
        long l = 10000000000L;
        float f = 10.5f;
        double d = 20.99;
        char c = 'A';
        boolean bool = true;

        System.out.println("---- Primitive Data Types ----");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println();
    }


    public void typeConversionDemo() {
        int i = 100;
        double d = i;   // Implicit (Widening)

        double d2 = 99.99;
        int i2 = (int) d2;  // Explicit (Narrowing)

        System.out.println("---- Type Conversion ----");
        System.out.println("Implicit Conversion (int to double): " + d);
        System.out.println("Explicit Conversion (double to int): " + i2);
        System.out.println();
    }


    public void calculateSimpleInterest() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Simple Interest Calculator ----");
        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter Time (T in years): ");
        double T = sc.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double R = sc.nextDouble();

        double SI = (P * T * R) / 100;
        System.out.println("Simple Interest = " + SI);
        System.out.println();
    }


    public void swapNumbers() {
        int a = 10, b = 20;

        System.out.println("---- Swap Two Numbers ----");
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
        System.out.println();
    }


    public static void main(String[] args) {
        Week2_Program2 obj = new Week2_Program2();

        obj.showPrimitiveDataTypes();
        obj.typeConversionDemo();
        obj.calculateSimpleInterest();
        obj.swapNumbers();
    }
}
