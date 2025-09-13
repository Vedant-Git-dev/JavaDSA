import java.util.Arrays;

public class MinMaxValue {
   
    public static int[] findMinMax(int arr[]){
        
        // Initializes both minimum and maximum values as first element of array
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){

            // Updates minimum value if current element is less than min
            if(arr[i] < min){
                min = arr[i];
            }

            // Updates maximum value if current value if greater than max
            else if(arr[i] > max){
                max = arr[i];
            }
        }
        
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        int arr[] = {32, 21, 2, 1, 45, 36, 6};

        System.out.println("Array : " + Arrays.toString(arr));
        int result[] = findMinMax(arr);

        System.out.println("Minimum Value : " + result[0]);
        System.out.println("Maximum Value : " + result[1]);
    }
}
