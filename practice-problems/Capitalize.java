


public class Capitalize {
    public static void main(String[] args) {
        String s = "";
        System.out.println(capitalize(s));
    }
    public static String capitalize(String s){
        
        if(s.length() <= 0){
            System.out.println("String is empty");
            return "";
        }
        String[] words = s.split(" ");
        String result = "";
        for(String word : words){
            String firstLetter = word.substring(0,1);
            String restOfWord = word.substring(1);
            result += firstLetter.toUpperCase() + restOfWord + " ";
        }

        return result;
    }
}
    
