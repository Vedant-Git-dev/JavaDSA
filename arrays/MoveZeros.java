import java.util.Arrays;

public class MoveZeros {
    public static int[] moveZeros(int arr[]){
        int j = 0; // pointer to track where the next non-zero element goes

        // Move all the non-zero elements to start
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill remaining places with zerso 
        while(j < arr.length){
            arr[j] = 0;
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {2, 0, 1, 0, 9, 0, 4, 0};
        
        System.out.println("Original Array : " + Arrays.toString(arr));
        
        moveZeros(arr);
        System.out.println("Array after moving zeros : " + Arrays.toString(arr));
        
    }
}
