
// import java.util.Arrays;
import java.util.Scanner;

class Hello {
    public static void main(String a[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter two numbers : ");

            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Enter the arithmatic operation you want to perform");
            char op = input.next().charAt(0);

            int res;
            if (op == '+') {
                res = num1 + num2;
                System.out.println("Addition : " + res);
            } else if (op == '-') {
                res = num1 - num2;
                System.out.println("Subtraction : " + res);
            } else if (op == '*') {
                res = num1 * num2;
                System.out.println(res);
            } else if (op == '/') {
                res = num1 / num2;
                System.out.println(res);
            } else {
                System.out.println("Please enter correct operator");
            }
        }
    }
}