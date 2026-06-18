public class diagonal_sum {

    // Function to calculate diagonal sum
    public static int diagonalSum(int matrix[][]) {

        int sum = 0;

        //using brute force method

        // Traverse all rows
        // for (int i = 0; i < matrix.length; i++) {

        //     // Traverse all columns
        //     for (int j = 0; j < matrix[0].length; j++) {

        //         // Primary diagonal (row index = column index)
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }

        //         // Secondary diagonal (row + column = n - 1)
        //         else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }

    //     }

    //     return sum;
    // }


     // Optimized Approach - O(n)
        for (int i = 0; i < matrix.length; i++) {

            // Primary Diagonal
            sum += matrix[i][i];

            // Secondary Diagonal
            // Avoid double-counting the middle element
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Print diagonal sum
        System.out.println(diagonalSum(matrix));
    }
}