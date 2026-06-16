import java.util.Arrays;
import java.util.Collections;
public class builtin_sort {
    
    public static void main(String[] args){
        // int arr[] = {3, 2, 4,5,7};

        Integer arr[] = {3, 2, 4, 5, 7};

        // Sort an Array in Ascending Order using inbuilt sorting in java
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));


        // Sort Only a Part of an Array
        // Arrays.sort(arr, 1,3);
        // System.out.println(Arrays.toString(arr));

        // ort in Descending Order (Integer Array)
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));



    }
}
