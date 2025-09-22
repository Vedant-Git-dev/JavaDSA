public class Prefix {
    public static String commonPrefix(String str1, String str2) {
        StringBuilder prefix = new StringBuilder();

        for(int i = 0; i < str1.length() && i < str2.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                prefix.append(str1.charAt(i));
            }
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        String str1 = "Vedant";
        String str2 = "Vedvyas";

        System.out.println("Longest Prefix : " + commonPrefix(str1, str2));
    }
}
