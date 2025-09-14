import java.util.Arrays;

public class MergeArrays {
    public static int[] merge(int arr1[], int arr2[]){        
        int n = arr1.length, m = arr2.length;
        int mergedArray[] = new int[m + n];

        int i = 0, j = 0, k = 0; // i and j are pointers of arr1 and arr2 respectively and k is pointer of mergedArray

        // Runs till both the arrays have valid elements to compare
        while(i < n && j < m){

            // Adds current element of arr1 in mergedArray if it's > arr2 else adds current element of arr2
            if(arr1[i] < arr2[j]){
                mergedArray[k++] = arr1[i++];
            }
            else {
                mergedArray[k++] = arr2[j++];
            }

        }

        // Adds the remaining elements of arrays (if any)
        while(i < n){
            mergedArray[k++] = arr1[i++];
        }

        while(j < m){
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;

    }

    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8, 10};

        System.out.println("Array 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));
        System.out.println("Merged Array : " + Arrays.toString(merge(arr1, arr2)));
        
    }
}
