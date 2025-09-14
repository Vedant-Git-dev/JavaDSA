public class CheckSorted {
    public static String checkSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
             if(arr[i] > arr[i + 1]){
                return "Not Sorted"; // Returns Not Sorted if current element is greater than its next one
             }
            }

        return "Sorted"; 
        }
    

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5}; // Sorted
        int arr2[] = {3, 1, 5, 3, 8}; // Not sorted

        System.out.println("Array 1 is " + checkSorted(arr1));
        System.out.println("Array 2 is " + checkSorted(arr2));
    }
}
