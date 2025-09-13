import java.util.Arrays;

public class Sum {
    
    public static int findSum(int arr[]){
        int sum = 0; // Variable to store sum
        
        for(int num : arr){
            sum += num; // Adding each element to sum
        }

        return sum;
    }
    
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Sum : " + findSum(arr));

    }
}