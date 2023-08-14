import java.util.ArrayList;
import java.util.Scanner;

class PrimeCalc {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n%2 == 0) return false;
        for (int i = 3; i*i <= n; i+=2) {
            if (n%i == 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> primes(int start, int end) {
        ArrayList<Integer> p = new ArrayList<Integer>();

        for(int i = start; i <= end; i++) {
            if (isPrime(i)) p.add(i);
        }

        return p;
    }
}

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(PrimeCalc.isPrime(17));
        System.out.println(PrimeCalc.primes(0, 100));


        sc.close();
    }

}
