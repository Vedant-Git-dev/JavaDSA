public class CheckAnagrams {
    public static String checkAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return "Not anagrams";
        
        int count[] = new int[26];

        for(int i = 0; i < str1.length(); i++){
            count[str1.charAt(i) - 'a']++; // Increments current character's count of str1 
            count[str2.charAt(i) - 'a']--; // Decrement count of current character of str2 
        }

        // if strings are anagrams count of each letter must be zero as we increment and decrement
        // character equal times
        for(int c : count){
            if(c != 0) return "Not anagrams";
        }

        return "Anagrams";
    }
    public static void main(String args[]){
        // Anagrams
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(checkAnagram(str1, str2)); // Anagrams

        // Not anagrams
        String str3 = "vedant";
        String str4 = "arnav";
        
        System.out.println(checkAnagram(str3, str4)); // Not anagrams
    }
}
