import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = reverseString(str);

        System.out.println("The reverse of the string is: " + rev);

        sc.close();
    }

    public static String reverseString(String str) {
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }
}