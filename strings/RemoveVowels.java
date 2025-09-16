import java.util.*;

public class RemoveVowels {
    public static String removeVowels(String str){
        // Using hashset because efficiency O(1)
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
        ));

        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            // Adds character to newStr only if it's not a vowel
            if(!vowels.contains(str.charAt(i))) newStr.append(str.charAt(i));
        }

        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Original String : " + str);
        System.out.println("String without vowels : " + removeVowels(str));
        
    }
}