public class MissingNumber {
    public static int findMissing(int arr[]){
        int n = arr.length + 1; // + 1 because 1 number is missing
        
        int expectedSum = n * (n + 1) / 2; // Formula to find sum of n natural numbers

        int actualSum = 0;

        for(int num : arr){
            actualSum += num;
        }

        return expectedSum - actualSum;
        
    }

    public static void main(String[] args) {
        // 4 is missing
        int arr[] = {1, 2, 3, 5, 6, 7};

        System.out.println("Missing Number is : " + findMissing(arr));
    }
}