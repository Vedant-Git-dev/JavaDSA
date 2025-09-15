public class CountFrequency {
    public static int countFrequency(String str, char ch){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)){
                count++;
            }
        }

        return count;
    }
    public static void main(String args[]){
        String str = "Hello, I am Vedant, curently learning DSA";
        
        System.out.println("Frequency of l : " + countFrequency(str, 'l'));
    }
}
