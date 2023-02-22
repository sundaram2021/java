package concepts;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        // hello();
        Scanner in = new Scanner(System.in);

        // System.out.println("Enter two numbers : ");
        // int n1 = in.nextInt();
        // int n2 = in.nextInt();

        // System.out.println("Sum = " + sum(n1, n2));

        int a[] = { 23, 45, 2, 89, 56 };

        System.out.println("Enter the number to find : ");
        int n1 = in.nextInt();

        linearSearch(a, n1);
    }
    // functions in java
    // static void hello() {
    // System.out.println("Helloo jaha");
    // }

    // return a value with function/method

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // function to perform linear search

    static void linearSearch(int arr[], int n) {
        for (int ele : arr) {
            if (ele == n) {
                System.out.println("Found");
                return;
            }
        }

        System.out.println("Not Found");
    }

    // function to perform binary search

    static void binarySearch(int arr[], int n) {
        int mid = arr[0] + arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (n > arr[mid]) {

            }

            if (n < arr[mid]) {
               
            }

            if (n == arr[mid]) {
                System.out.println("Number found at index " + mid);
            }
        }
    }

}
