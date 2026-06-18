public class searching_in_sorted_matrix {

    public static boolean staircaseSearch(int matrix[][], int key) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            // Key found
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            }

            // Move left
            else if (key < matrix[row][col]) {
                col--;
            }

            // Move down
            else {
                row++;
            }
        }

        // Key not found
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 33;

        staircaseSearch(matrix, key);
    }
}