
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        NumberChangingPyramid(n);


        sc.close();
    }
    /* 
     n = 4 
     * 
     * *
     * * *
     * * * *
     * * *
     * *
     * 
    */

    public static void RightPascalPattern(int n){

        for(int i=1; i<=n; i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=0; i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
              *
             ***
            *****
           *******
          *********
         ***********
        *************
     */

    public static void TriangleStarPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=2*i-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * ******
     * *    *
     * *    *
     * *    *
     * *    *
     * ******
     */

     public static void SquareHollowPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    /*
     *     1
     *    2 2
     *   3 3 3
     *  4 4 4 4
     * 5 5 5 5 5
     */

    public static void NumberTriangular(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=2*i-1; j>0; j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     */

    public static void NumberIncreasingPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    /*
     * 1 2 3 4
     * 1 2 3
     * 1 2 
     * 1 
     */

    public static void NumberIncreasingReversePyramid(int n){
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=n-i;j>=0;j--){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     */

    public static void NumberChangingPyramid(int n){
        int k=1;
        for(int i=1;i<=n;i++){           
            for(int j=0;j<i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     */

    public static void ZeroOneTriangle(int n){
        int k=1;
        int m=0;
        for(int i=1;i<=n;i++){           
            for(int j=0;j<i;j++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

}
