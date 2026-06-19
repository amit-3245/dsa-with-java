public class TwoSum_II_sorted_array {

    public int[] twoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] < target) {
                i++;
            } else if (arr[i] + arr[j] > target) {
                j--;   
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7,11,15};
        int target = 9;
        
        TwoSum_II_sorted_array obj = new TwoSum_II_sorted_array();

        int[] result = obj.twoSum(numbers, target);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}