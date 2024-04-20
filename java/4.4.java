public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[] rowSums = calculateRowSums(matrix);
        int[] columnSums = calculateColumnSums(matrix);

        System.out.println("Sum of each row:");
        printArray(rowSums);

        System.out.println("Sum of each column:");
        printArray(columnSums);
    }

    public static int[] calculateRowSums(int[][] matrix) {
        int numRows = matrix.length;
        int[] rowSums = new int[numRows];

        for (int i = 0; i < numRows; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            rowSums[i] = sum;
        }

        return rowSums;
    }

    public static int[] calculateColumnSums(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[] columnSums = new int[numCols];

        for (int j = 0; j < numCols; j++) {
            int sum = 0;
            for (int i = 0; i < numRows; i++) {
                sum += matrix[i][j];
            }
            columnSums[j] = sum;
        }

        return columnSums;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}