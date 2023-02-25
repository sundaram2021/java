package concepts;

// import java.util.Scanner;

// import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        // hello();
        // Scanner in = new Scanner(System.in);

        // System.out.println("Enter two numbers : ");
        // int n1 = in.nextInt();
        // int n2 = in.nextInt();

        // System.out.println("Sum = " + sum(n1, n2));

        // int a[] = { 23, 45, 2, 89, 56 };

        // System.out.println("Enter the number to find : ");
        // int n1 = in.nextInt();

        // linearSearch(a, n1);

        // int arr[] = { 10, 20, 30, 40, 50 };
        // int key = 30;
        // int last = arr.length - 1;
        // binarySearch(arr, 0, last, key);

        // int a = 12;
        // int b = 45;
        // swap(a, b);

        // System.out.println("Enter the number to find prime : ");
        // int n = in.nextInt();
        // isPrime(n);


        // System.out.println("Enter the number to find prime : ");
        // int n = in.nextInt();
        // isArmstrong(n);

    }

    // functions in java
    static void hello() {
        System.out.println("Helloo jaha");
    }

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

    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    // swap two numbers

    public static void swap(int a, int b) {
        a = a + b; // 2 + 3 = 5
        b = a - b; // 5 - 3 = 2
        a = a - b; // 5 - 2 = 3

        System.out.println("Now, a = " + a + " and b = " + b);

    }

    // find whether a number is prime or not

    public static void isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println("Is not prime");
                return;
            }
        }
        System.out.println("Is prime");
    }


    // find whether number is armstrong nos or not => 370, 371, 407;

    public static void isArmstrong(int n){
        int originalNo = n;
        int sum=0;
        while(n > 0){
            int r = n % 10;
            int cube = r*r*r;
            sum += cube;
            n = n / 10;
        }

        if(sum == originalNo){
            System.out.println("IS armstrong number");
            return;
        } 
        System.out.println("Not Armstrong number");
    }

}
