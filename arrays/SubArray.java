import java.util.Arrays;

public class SubArray {
    public static int[] findSubarray(int arr[]){
        int currentSum = arr[0]; // Stores current sum of the subarray
        int maxSoFar = arr[0]; // Stores best sum so far
        int start = 0, end = 0; // Start and end indices of subarray with max sum
        int s = 0; // Temporary start index 

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > currentSum + arr[i]){
                currentSum = arr[i];
                s = i;
            }
            else{
                currentSum += arr[i];
            }

            // Updates maxSoFar and start and end indices if best subarray so far is found
            if(currentSum > maxSoFar){
                maxSoFar = currentSum;
                start = s;
                end = i;
            }
        }

        
        return Arrays.copyOfRange(arr, start, end + 1);
    }

    public static void main(String args[]){
        int arr[] = {1, -4, 3, 2, 5, 11, -8, 6};

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Subarray with maximum sum : " + Arrays.toString(findSubarray(arr)));
    }
}