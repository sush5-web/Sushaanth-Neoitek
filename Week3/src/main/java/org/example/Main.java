package org.example;

import java.util.Scanner;

public class Main {

    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }

    public static void checkPrime(int number) {       if (number <= 1) {
            System.out.println(number + " is not prime.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is Prime.");
        } else {
            System.out.println(number + " is not Prime.");
        }
    }

    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void calculator(double num1, double num2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for Even/Odd check: ");
        int num1 = sc.nextInt();
        checkEvenOdd(num1);

        System.out.print("Enter a number to check Prime: ");
        int num2 = sc.nextInt();
        checkPrime(num2);

        printFibonacci(10);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        calculator(a, b, op);

        sc.close();
    }
}