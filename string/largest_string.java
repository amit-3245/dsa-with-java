public class largest_string {
    
    public static void main(String[] args) {

        // Array of strings
        String fruits[] = {"apple", "mango", "banana"};

        // Assume first string is largest
        String largest = fruits[0];

        // Traverse the array
        for (int i = 1; i < fruits.length; i++) {

            // compareTo() returns:
            // > 0 : current string is larger
            // < 0 : current string is smaller
            // = 0 : both strings are equal

            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        // Print largest string
        System.out.println("Largest String = " + largest);
    }
}