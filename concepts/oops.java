package concepts;

import java.util.Scanner;

public class oops {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            

            System.out.println("Enter your name and age : ");

            String fn = in.next();
            int a = in.nextInt();
            
        }
    }

}

class Name {
    String name;
}

class Details extends Name {
    // System.out.println(Name.name);
}
