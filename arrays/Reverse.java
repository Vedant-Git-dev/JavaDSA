import java.util.Arrays;

public class Reverse {
    
    public static int[] reverse(int arr[]){
        
        // variables to track indices of array
        int i = 0; 
        int j = arr.length - 1;

        while (i <= j) {

            // swaps front and back elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++; 
            j--;
        }

        return arr;
    }
    
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Reversed Array : " + Arrays.toString(reverse(arr)));

    }
}