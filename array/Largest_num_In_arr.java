
public class Largest_num_In_arr {

    public static int getLargestnum(int numbers[]) {
        int Largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if(Largest < numbers[i]) {
                Largest = numbers[i];
            }
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number in the array is: " + smallest);
        return Largest;
    }


    public static void main(String[] args) {
        int numbers[] =  {1, 2, 3, 4, 5};
        System.out.println("Largest number in the array is: " + getLargestnum(numbers));
    }

    }
    

