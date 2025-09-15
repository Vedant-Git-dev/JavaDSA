public class Reverse {
    public static String reverse(String str) {
        String reversedStr = "";
        
        // Loops from end to start of original string
        for(int i = str.length() - 1; i >= 0; i--){
            reversedStr += str.charAt(i); // Adds current character to the reversedStr
        }

        return reversedStr;
    }
    public static void main(String args[]){
        String str = "Vedant";

        System.out.println("Reversed String : " + reverse(str));
        
    }
}