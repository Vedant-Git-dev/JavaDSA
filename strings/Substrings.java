import java.util.*;

public class Substrings {
    public static List<String> findSubstrings(String str){
        List<String> substrings = new ArrayList<>(); 

        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                substrings.add(str.substring(i, j + 1));
            }
        }

        return substrings; 
    }
    
    public static void main(String[] args) {
        String str = "Vedant";

        System.out.println("\n" + findSubstrings(str) + "\n");
    }
}