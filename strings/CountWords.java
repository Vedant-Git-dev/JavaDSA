public class CountWords {
    public static int count(String str){
        int count = 0;
 
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ') count += 1; // Increments the word count if character is a space ' '
        }

        return count + 1; // + 1 because last word won't count as there is no space after it
    }
    
    public static void main(String[] args) {
        String str = "Hello I am Learning java";

        System.out.println("No. of Words : " + count(str));
    }
}