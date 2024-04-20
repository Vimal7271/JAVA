public class MagicSquareChecker {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        System.out.println("Given Matrix:");
        printMatrix(matrix);

        if (isMagicSquare(matrix)) {
            System.out.println("The given matrix is a magic square.");
        } else {
            System.out.println("The given matrix is not a magic square.");
        }
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        
        
        for (int j = 0; j < n; j++) {
            sum += matrix[0][j];
        }

        
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != sum || colSum != sum) {
                return false;
            }
        }

        
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum1 += matrix[i][i];
            diagonalSum2 += matrix[i][n - 1 - i];
        }
        
        return diagonalSum1 == sum && diagonalSum2 == sum;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}