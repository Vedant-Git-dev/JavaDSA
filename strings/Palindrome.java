class Palindrome {
    public static boolean isPalindrome(String str) {
        String reversedStr = "";

        // Loops from end to start in original string
        for(int i = str.length() - 1; i >= 0; i--){
            reversedStr += str.charAt(i); // Adds current character to reversedStr
        }

        return str.equals(reversedStr);
    }

    public static void main(String args[]){
        String str1 = "Vedant"; // Not an palindrome
        String str2 = "abccba"; // is an palindrome

        System.out.println("String 1 : " + isPalindrome(str1));
        System.out.println("String 2 : " + isPalindrome(str2));
    
    }
}