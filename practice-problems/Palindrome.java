public class Palindrome {
    public static void main(String[] args) {
        String str = "mom";
        System.out.println(isPalindrome(str));
    }

    public static Boolean isPalindrome(String s){
        s = s.replaceAll(" ","");

        String rev = "";
        for(int i=0;i<s.length();i++){
            rev = s.charAt(i) + rev;
        }

        if(rev.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}
