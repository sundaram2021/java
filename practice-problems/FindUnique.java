public class FindUnique {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 3, 5, 2,};
        System.out.println(findUnique(arr));;
    }

    public static int findUnique(int[] arr) {
        int unique = 0;

        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }
}
