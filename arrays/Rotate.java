import java.util.Arrays;

public class Rotate {
    public static void reverse(int arr[], int start, int end) {

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original array : " + Arrays.toString(arr));

        // Left Rotate
        reverse(arr, 0, k - 1); // Reverse first k elements
        reverse(arr, k, arr.length - 1); // Reverse remaining elements
        reverse(arr, 0, arr.length - 1); // Reverse entire array

        System.out.println("Left Rotate by " + k + " : " + Arrays.toString(arr));

        int arr2[] = {1, 2, 3, 4, 5};

        // Right Rotate
        reverse(arr2, 0, arr.length - 1); // Reverse whole array
        reverse(arr2, 0, k - 1); // Reverse first k elements
        reverse(arr2, k, arr.length - 1); // reverse remaining elements

        System.out.println("Right Rotate by " + k + " : " + Arrays.toString(arr2));


    }
}