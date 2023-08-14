import java.util.Scanner;
import java.util.Arrays;

class Hello {
    public static void main(String[] args){
        Scanner snc = new Scanner(System.in);

        int arr[][] = new int[2][];

        // fill the array with 1,2,3,4,5..
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }

        // print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        snc.close();
    }
}



// Bitwise operators
        // int d = 0b1010;
        // int e = 0b1100;
        // int and = 0b1000;
        // int xor = 0b0110;
        // int or = 0b1110;
        // int not = 0b0101;
        // int rightShift = 0b0110;
        // int leftShift = 0b1100;
        // int unsignedRightShift = 0b0110;
        // System.out.println("d: " + d);
        // System.out.println("e: " + e);
        // System.out.println("d & e: " + (d & e));
        // System.out.println("and: " + and);
        // System.out.println("d | e: " + (d | e));
        // System.out.println("or: " + or);
        // System.out.println("d ^ e: " + (d ^ e));
        // System.out.println("xor: " + xor);
        // System.out.println("~d: " + (~d));
        // System.out.println("not: " + not);
        // System.out.println("d << 2: " + (d << 2));
        // System.out.println("leftShift: " + leftShift);
        // System.out.println("e >> 1: " + (e >> 1));
        // System.out.println("rightShift: " + rightShift);
        // System.out.println("e >>> 1: " + (e >>> 1));
        // System.out.println("unsignedRightShift: " + (unsignedRightShift >>> 1));



        //  Stack


//         class Stack {
//     private int[] stack;
//     private int top;
//     private int size;

//     public Stack(int size) {
//         this.size = size;
//         this.stack = new int[size];
//         this.top = -1;
//     }

//     public void push(int item) {
//         if (this.top == this.size - 1) {
//             System.out.println("Stack is full");
//             return;
//         }
//         this.stack[++this.top] = item;
//     }

//     public int pop() {
//         if (this.top == -1) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         return this.stack[this.top--];
//     }

//     public int peek() {
//         if (this.top == -1) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         return this.stack[this.top];
//     }

//     public boolean isEmpty() {
//         return this.top == -1;
//     }

//     public boolean isFull() {
//         return this.top == this.size - 1;
//     }

//     public void display() {
//         if (this.top == -1) {
//             System.out.println("Stack is empty");
//             return;
//         }
//         for (int i = this.top; i >= 0; i--) {
//             System.out.println(this.stack[i]);
//         }
//     }
// }


/////   String methods


        // System.out.println(name.concat(str));
        // System.out.println(name.charAt(0));
        // System.out.println(name.length());
        // System.out.println(name.substring(3, 5));
        // System.out.println(name.substring(2, 5));
        // System.out.println(name.indexOf("a"));
        // System.out.println(name.indexOf("a", 3));
        // System.out.println("Hello Dream".replace("Dream", "World"));
        // System.out.println(name.split(" ")[0]);


////    asList() method
        // Integer a[] = new Integer[] { 10, 20, 30, 40 };
 
        // // Getting the list view of Array
        // List<Integer> list = Arrays.asList(a);

        // // Printing all the elements inside list object
        // System.out.println("The list is: " + list);
        // list.set(0, 5);
        // list.set(1, 10);
        // list.remove(0);
        // list.isEmpty();
        // list.size();
        // list.contains(10);
