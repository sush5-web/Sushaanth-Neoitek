import java.util.Scanner;

public class Week4_Program4 {
    public void factorialProgram() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    public void maxOfThreeProgram() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers to find maximum: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum of the three numbers is: " + max);
    }


    public void reverseArrayProgram() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array to reverse: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        int start = 0, end = size - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("Reversed array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void linearSearchProgram() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int index = -1;

        for(int i = 0; i < size; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }
        }

        if(index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static void main(String[] args) {
        Week4_Program4 obj = new Week4_Program4();
        obj.factorialProgram();
        obj.maxOfThreeProgram();
        obj.reverseArrayProgram();
        obj.linearSearchProgram();
    }
}
