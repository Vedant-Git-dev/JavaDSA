import java.util.*;

public class CountFrequency {
    public static void countFrequency(String str){
        HashMap <Character, Integer> frequency = new HashMap<>();

        for(char ch : str.toCharArray()) {
            // Checks the frequency of character or set it zero by default and tracks it  
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Frequencies : ");
        for(Map.Entry<Character, Integer> entry : frequency.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
    public static void main(String args[]){
        String str = "Hello World";
        
        countFrequency(str);
    }
}
