import java.util.Arrays;

public class SecondLargest {
    public static int findSecondLargest(int arr[]) {
        
        // Initializing first and second largest with some random small values
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            
            // Checks for first largest element
            if(arr[i] > firstLargest){
                secondLargest = firstLargest; // Sets previous largest element as second largest
                firstLargest = arr[i]; // Updates first largest value
            }

            // Handles values between first and second largest element
            else if(arr[i] > secondLargest && arr[i] < firstLargest){
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }

    public static void main(String args[]){
        int arr[] = {11, 32, 2, 21, 56, 78, 15, 3};

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Second Largest : " + findSecondLargest(arr));
    }
}