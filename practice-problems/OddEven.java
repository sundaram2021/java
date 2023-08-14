public class OddEven {
    public static void main(String[] args) {
        int[] array = { 1111, 5678, 9876 }; // Replace with your 4-digit array elements
        
        boolean[] results = checkNumbers(array);
        
        for (boolean result : results) {
            System.out.println(result);
        }
    }

    public static boolean[] checkNumbers(int[] array) {
        boolean[] results = new boolean[array.length];
        
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            
            if (num >= 1000 && num <= 9999) {
                int[] digits = new int[4];
                int temp = num;
                
                for (int j = 3; j >= 0; j--) {
                    digits[j] = temp % 10;
                    temp /= 10;
                }
                
                int evenSum = digits[1] + digits[3];
                int oddSum = digits[0] + digits[2];
                
                if (oddSum % 3 == 0 || evenSum % 4 == 0) {
                    results[i] = true;
                } else {
                    results[i] = false;
                }
            } else {
                results[i] = false;
            }
        }
        
        return results;
    }
}
