// Kadane's Algorithm is a popular algorithm used to find the maximum sum of a contiguous subarray within a one-dimensional array of numbers. It works by iterating through the array and keeping track of the current sum of the subarray and the maximum sum found so far. The algorithm has a time complexity of O(n) and a space complexity of O(1).

public class Kadanes_algorithm {
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subarray sum is : " + ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-3, 4, -1, -2, 1,5,-3};
        kadanes(numbers);

    }



    
}
