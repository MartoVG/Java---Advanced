import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [][]matrix = new int[n][n];

        fillMatrix(matrix,scanner);


        int sumOfPrimaryDiagonal = GetSumOfPrimaryDiagonal(matrix);
        int sumOfSecondaryDiagonal = GetSumOfSecondaryDiagonal(matrix);
        int absolute = Math.abs(sumOfPrimaryDiagonal - sumOfSecondaryDiagonal);
        System.out.println(absolute);
    }

    private static int GetSumOfSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        int row = 0;
        int col = matrix.length -1;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[row][col];
            row ++;
            col --;
        }

        return sum;
    }

    private static int GetSumOfPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[row][col];
            row ++;
            col++;
        }

        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        int rows = matrix.length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < rows; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
